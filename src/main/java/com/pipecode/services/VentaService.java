package com.pipecode.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pipecode.model.Venta;
import com.pipecode.repository.VentaRepository;

/** Servicio para ventas.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Service
public class VentaService implements Services {
	
	@Autowired
	private VentaRepository ventaRepository;
	
	/** Se da de alta una venta.
	 * 
	 * @param v Venta a dar de alta.
	 * @return Venta dada de alta.
	 * 
	 */
	public Venta create(Venta v) {
		return this.ventaRepository.save(v);
	}
	
	/** Modifica una venta.
	 * 
	 * @param v Venta a modificar.
	 * @return venta modificada.
	 */
	public Venta update(Venta v) {
		return this.ventaRepository.save(v);
	}
	
	/** Metodo que efectúa un borrado lógico.
	 * 
	 * @param v Venta a borrar.
	 * @return Venta eliminada.
	 */
	public Venta delete(Venta v) {
		v.setBorrado(true);
		return this.ventaRepository.save(v);
	}
	
	/** Busca todas las instancias de ventas.
	 * 
	 * @return Lista con todas las ventas realizadas.
	 */
	public List<Venta> findAll(){
		List<Venta> listaVenta = new ArrayList<Venta>();
		Iterator<Venta> iterator = this.ventaRepository.findAll().iterator();
		while(iterator.hasNext()) {
			Venta v = iterator.next();
			listaVenta.add(v);
		}
		return listaVenta;
	}
}
