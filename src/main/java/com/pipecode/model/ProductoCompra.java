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
public class ProductoCompra{

	@Id
	@Column(name="idproductocompra")
	private Long idProductoCompra;
	
	/** 
	 * Id associated Producto.
	 */
	@Column(name="idproductodetalle", insertable=false, updatable=false)
	private Long idProductoDetalle;
	
	/**
	 * Id associated Compra.
	 */
	@Column(name="compraid", insertable=false, updatable=false)
	private Long compraid;
	
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
	@JoinColumn(name="compraid")
	private Compra compra;
	
	@ManyToOne
	@JoinColumn(name="idproductodetalle")
	private Producto producto;
	
	// Getters.
	public Long getIdProductoCompra() {
		return idProductoCompra;
	}
	
	public Long getIdProducto() {
		return idProductoDetalle;
	}
	
	public Long getCompraId() {
		return compraid;
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
	
	
	
	// Setters.
	public void setIdProductoCompra(Long idProductoCompra) {
		this.idProductoCompra = idProductoCompra;
	}

	public void setIdProducto(Long idProducto) {
		this.idProductoDetalle = idProducto;
	}

	public void setCompraId(Long compraid) {
		this.compraid = compraid;
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

	
}
