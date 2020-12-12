package com.pipecode.repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class GenericRepositoryJPA<T> implements GenericRepository<T> {
	
	@Autowired
	protected EntityManager entityManager;
    private Class<T> type;
 
    public EntityManager getEntityManager() {
        return entityManager;
    }
 
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
 
    @SuppressWarnings("unchecked")
	public GenericRepositoryJPA() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class<T>) pt.getActualTypeArguments()[0];
    }
    
    @Transactional
    public T create(final T t) {
                 
        entityManager.persist(t);
        return t;
    }
 
 
    public void delete(final Object objeto) {
         entityManager.remove(entityManager.merge(objeto));
    }
 
    public T find(final Object id) {
        return (T) entityManager.find(type, id);
    }
    
    @Transactional
    public T update(final T t) {
        return entityManager.merge(t);
    }
 
 
    public Iterable<T> findAll() {
         CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
         CriteriaQuery<T> criteriaQuery = cb.createQuery(type);
         Root<T> root = criteriaQuery.from(type);
         criteriaQuery.select(root);
         TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }

}
