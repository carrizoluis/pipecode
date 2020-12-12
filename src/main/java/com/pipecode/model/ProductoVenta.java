package com.pipecode.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** Models table producto_venta.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Entity
@Table(name="producto_venta")
public class ProductoVenta {
	
	/** PK
	 * 
	 */
	@Id
	@Column(name="id_producto_venta")
	private int idProductoVenta;
	
	/** Id Product associated
	 * 
	 */
	@Column(name="id_producto")
	private int idProducto;
	
	/** Id Venta associated.
	 * 
	 */
	@Column(name="id_venta")
	private int idVenta;
	
	/** Cantidad
	 * 
	 */
	@Column(name="cantidad")
	private int cantidad;
	
	/** Precio de venta.
	 * 
	 */
	@Column(name="precio_venta")
	private Double precioVenta;
	
	/** Indicates if it is deleted or not.
	 * 
	 */
	@Column(name="borrado")
	private boolean borrado;
	
	@JoinColumn(name="fk_producto_productoVenta", nullable=false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Producto producto;
	
	@JoinColumn(name="fk_producto_venta", nullable=false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Venta compra;
	
	// Getters.
	/** Gets idProductoVenta.
	 * 
	 * @return id.
	 */
	public int getIdProductoVenta() {
		return idProductoVenta;
	}
	
	/** Gets idProducto.
	 * 
	 * @return idProducto.
	 */
	public int getIdProducto() {
		return idProducto;
	}
	
	/** Gets idVenta.
	 * 
	 * @return idVenta.
	 */
	public int getIdVenta() {
		return idVenta;
	}
	
	/** Gets cantidad.
	 * 
	 * @return cantidad.
	 */
	public int getCantidad() {
		return cantidad;
	}
	
	/** Gets precioVenta.
	 * 
	 * @return precioVenta.
	 */
	public Double getPrecioVenta() {
		return precioVenta;
	}
	
	/** Gets borrado.
	 * 
	 * @return boolean.
	 */
	public boolean isBorrado() {
		return borrado;
	}
	
	// Setters
	/** Sets idProductoVenta.
	 * 
	 * @param idProductoVenta
	 */
	public void setIdProductoVenta(int idProductoVenta) {
		this.idProductoVenta = idProductoVenta;
	}
	
	/** Sets idProducto.
	 * 
	 * @param idProducto
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	
	/** Sets idVenta.
	 * 
	 * @param idVenta
	 */
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	
	/** Sets cantidad.
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	/** Sets precioVenta.
	 * 
	 * @param precioVenta
	 */
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	/** Sets borrado.
	 * 
	 * @param borrado
	 */
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
}
