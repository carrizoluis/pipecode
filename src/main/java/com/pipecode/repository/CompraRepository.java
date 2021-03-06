package com.pipecode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pipecode.model.Compra;

/** Repository para compra.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Repository
public interface CompraRepository extends CrudRepository<Compra, Long> {

}
