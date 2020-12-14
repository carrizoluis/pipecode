package com.pipecode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pipecode.model.Producto;

/** Repository para producto.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
