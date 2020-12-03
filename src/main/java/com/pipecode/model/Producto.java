package com.pipecode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/** Models PRODUCTO Table.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@Column(name="id_producto")
	private int idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio_final")
	private Double precioFinal;
	
	@Column(name="borrado")
	private boolean borrado;
	
	
	// Getters.
	/** Gets idProducto.
	 * 
	 * @return idProducto.
	 */
	public int getIdProducto() {
		return idProducto;
	}
	
	/** Gets Nombre.
	 * 
	 * @return nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/** Gets precioFinal.
	 * 
	 * @return precioFinal.
	 */
	public Double getPrecioFinal() {
		return precioFinal;
	}
	
	/** Determines if the product is deleted.
	 * 
	 * @return true if it deleted.
	 */
	public boolean isBorrado() {
		return borrado;
	}

	// Setters.
	/** Sets idProducto.
	 * 
	 * @param idProducto
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	/** Sets nombre.
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** Sets precioFinal.
	 * 
	 * @param precioFinal
	 */
	public void setPrecioFinal(Double precioFinal) {
		this.precioFinal = precioFinal;
	}

	/** Sets borrado.
	 * 
	 * @param borrado
	 */
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
}
