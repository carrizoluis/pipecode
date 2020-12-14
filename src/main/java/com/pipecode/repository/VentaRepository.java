package com.pipecode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pipecode.model.Venta;

/** Repository para Venta.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Repository
public interface VentaRepository extends CrudRepository<Venta, Long> {

}
