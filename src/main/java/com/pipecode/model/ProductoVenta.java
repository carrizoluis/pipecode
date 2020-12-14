package com.pipecode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/** Models producto_venta table.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Entity
@Table(name="producto_venta")
public class ProductoVenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idproductoventa")
	private Long idProductoVenta;
	
	@Column(name="idproductodetalle", insertable=false, updatable=false)
	private Long idProductoDetalle;
	
	@Column(name="ventaid", insertable=false, updatable=false)
	private Long ventaid;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="precioventa")
	private Double precioVenta;
	
	@Column(name="borrado")
	private boolean borrado;
	
	@ManyToOne
	@JoinColumn(name="ventaid")
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name="idproductodetalle")
	private Producto productoventa;

	public Long getIdProductoVenta() {
		return idProductoVenta;
	}

	public Long getIdProductoDetalle() {
		return idProductoDetalle;
	}

	public Long getVentaid() {
		return ventaid;
	}

	public int getCantidad() {
		return cantidad;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public boolean isBorrado() {
		return borrado;
	}

	public Venta getVenta() {
		return venta;
	}
	
	@JsonIgnore
	public Producto getProducto() {
		return productoventa;
	}

	public void setIdProductoVenta(Long idProductoVenta) {
		this.idProductoVenta = idProductoVenta;
	}

	public void setIdProductoDetalle(Long idProductoDetalle) {
		this.idProductoDetalle = idProductoDetalle;
	}

	public void setVentaid(Long ventaid) {
		this.ventaid = ventaid;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public void setProducto(Producto producto) {
		this.productoventa = producto;
	}
}
