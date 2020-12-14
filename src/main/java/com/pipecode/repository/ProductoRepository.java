package com.pipecode.repository;

import org.springframework.data.repository.CrudRepository;

import com.pipecode.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
