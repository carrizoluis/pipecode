package com.pipecode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pipecode.model.ProductoCompra;

/** Repository para producto_compra.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Repository
public interface ProductoCompraRepository extends CrudRepository<ProductoCompra, Long> {

}
