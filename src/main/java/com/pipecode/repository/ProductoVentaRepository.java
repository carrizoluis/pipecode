package com.pipecode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pipecode.model.ProductoVenta;

/** Repository para producto_venta.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Repository
public interface ProductoVentaRepository extends CrudRepository<ProductoVenta, Long> {

}
