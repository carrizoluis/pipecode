package com.pipecode.repository;

/** Proporciona los metodos para el repositorio.
 * 
 * @author Luis Alberto Carrizo
 *
 * @param <T> Puede ser un objeto cualquiera.
 */
public interface GenericRepository<T> {
	
	public T create(T t);

	public void delete(T t);

	public T find(T t);

	public T update(T t);

	public Iterable<T> findAll();
}
