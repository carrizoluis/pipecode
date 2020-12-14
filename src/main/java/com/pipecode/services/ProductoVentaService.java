package com.pipecode.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pipecode.model.ProductoVenta;
import com.pipecode.repository.ProductoVentaRepository;

/** Servicio para productoventa.
 * 
 * @author Luis Alberto Carrizo
 *
 */

@Service
public class ProductoVentaService implements Services {
	
	@Autowired
	private ProductoVentaRepository productoVentaRepository;
	
	/** Create.
	 * 
	 * @param pv Producto Venta nuevo.
	 * @return Producto venta insertado.
	 */
	public ProductoVenta create(ProductoVenta pv) {
		return this.productoVentaRepository.save(pv);
	}
	
	/** Update.
	 * 
	 * @param pv 
	 * @return Producto venta modificado.
	 */
	public ProductoVenta update(ProductoVenta pv) {
		return this.productoVentaRepository.save(pv);
	}
	
	/** Metodo que efectua un borrado logico.
	 * 
	 * @param pv ProductoVenta.
	 * @return ProductoVenta eliminado.
	 */
	public ProductoVenta delete(ProductoVenta pv) {
		pv.setBorrado(true);
		return this.productoVentaRepository.save(pv);
	}
	
	/** Método que retorna todos los productos venta.
	 * 
	 * @return Lista con todos los producto venta.
	 */
	public List<ProductoVenta> findAll(){
		List<ProductoVenta> listaProducto = new ArrayList<ProductoVenta>();
		Iterator<ProductoVenta> iterator = this.productoVentaRepository.findAll().iterator();
		while(iterator.hasNext()) {
			ProductoVenta pv = iterator.next();
			listaProducto.add(pv);
		}
		return listaProducto;
	}
}
