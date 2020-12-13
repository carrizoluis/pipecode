package com.pipecode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/** Models table producto_compra
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Entity
@Table(name="producto_compra")
public class ProductoCompra {
	
	@Id
	@Column(name="idproductocompra")
	private int idProductoCompra;
	
	/** 
	 * Id associated Producto.
	 */
	@Column(name="idproductodetalle")
	private int idProductoDetalle;
	
	/**
	 * Id associated Compra.
	 */
	@Column(name="id_compra")
	private int idCompra;
	
	/**
	 * Stock income.
	 */
	@Column(name="cantidad")
	private int cantidad;
	
	/**
	 * Buy price.
	 */
	@Column(name="precio_compra")
	private Double precioCompra;
	
	/**
	 * Deleted or not.
	 */
	@Column(name="borrado")
	private boolean borrado;
	
	@ManyToOne
	@JoinColumn(name="productoid")
	private Producto productoComprado;
	
	
	// Getters.
	public int getIdProductoCompra() {
		return idProductoCompra;
	}
	
	public int getIdProducto() {
		return idProductoDetalle;
	}
	
	public int getIdCompra() {
		return idCompra;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	
	public Double getPrecioCompra() {
		return precioCompra;
	}
	
	public boolean isBorrado() {
		return borrado;
	}
	
	public Producto getProducto() {
		return productoComprado;
	}
	
	// Setters.
	public void setIdProductoCompra(int idProductoCompra) {
		this.idProductoCompra = idProductoCompra;
	}

	public void setIdProducto(int idProducto) {
		this.idProductoDetalle = idProducto;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}

	public void setProducto(Producto producto) {
		this.productoComprado = producto;
	}
	
}
