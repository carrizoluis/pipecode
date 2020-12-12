package com.pipecode.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@Column(name="id_producto_compra")
	private int idProductoCompra;
	
	/** 
	 * Id associated Producto.
	 */
	@Column(name="id_producto")
	private int idProducto;
	
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
	
	@JoinColumn(name="fk_producto_productoCompra", nullable=false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Producto producto;
	
	@JoinColumn(name="fk_producto_compra", nullable=false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Compra compra;

	// Getters.
	/** Gets idProductoCompra.
	 * 
	 * @return idProductoCompra.
	 */
	public int getIdProductoCompra() {
		return idProductoCompra;
	}
	
	/** Gets idProducto.
	 *  
	 * @return idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}
	
	/** Gets idcompra.
	 * 
	 * @return idCompra.
	 */
	public int getIdCompra() {
		return idCompra;
	}
	
	/** Gets cantidad.
	 * 
	 * @return cantidad.
	 */
	public int getCantidad() {
		return cantidad;
	}
	
	/** Gets precio de Compra.
	 * 
	 * @return precioCompra.
	 */
	public Double getPrecioCompra() {
		return precioCompra;
	}
	
	/** Gets if it's deleted.
	 * 
	 * @return True or False.
	 */
	public boolean isBorrado() {
		return borrado;
	}
	
	/** Gets Products.
	 * 
	 * @return Collection.
	 */
	public Producto getProducto() {
		return producto;
	}
	
	// Setters.
	/** Set idProductoCompra.
	 * 
	 * @param idProductoCompra
	 */
	public void setIdProductoCompra(int idProductoCompra) {
		this.idProductoCompra = idProductoCompra;
	}

	/** Sets idProducto.
	 * 
	 * @param idProducto
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	/** Sets idCompra.
	 * 
	 * @param idCompra
	 */
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	/** Sets cantidad.
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/** Sets precioCompra.
	 * 
	 * @param precioCompra
	 */
	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/** Sets borrado.
	 * 
	 * @param borrado
	 */
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}

	public void setProductos(Producto producto) {
		this.producto = producto;
	}
	
	
}
