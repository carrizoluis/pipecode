package com.pipecode.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/** Models PRODUCTO Table.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Entity
@Table(name="producto")
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="productoid")
	private Long idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio_final")
	private Double precioFinal;
	
	@Column(name="borrado")
	private boolean borrado;

	@OneToMany(mappedBy="producto")
	List<ProductoCompra> compras;
	
	
	
	@JsonIgnore
	public List<ProductoCompra> getCompras() {
		return compras;
	}



	public void setCompras(List<ProductoCompra> compras) {
		this.compras = compras;
	}



	public Producto() {
	}
	
	
	
	// Getters.
	public Long getIdProducto() {
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
	public void setIdProducto(Long idProducto) {
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
