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
	@Column(name="productoid")
	private int idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio_final")
	private Double precioFinal;
	
	@Column(name="borrado")
	private boolean borrado;

	public Producto() {
	}
	
	
	// Getters.
	public int getIdProducto() {
		return idProducto;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Double getPrecioFinal() {
		return precioFinal;
	}
	
	public boolean isBorrado() {
		return borrado;
	}
	
	// Setters.
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecioFinal(Double precioFinal) {
		this.precioFinal = precioFinal;
	}

	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
}
