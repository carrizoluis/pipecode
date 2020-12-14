package com.pipecode.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/** Models venta table.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ventaid;
	
	@Column(name="fecha_venta")
	private Date fecha_venta;
	
	@Column(name="total")
	private Double total;
	
	@Column(name="borrado")
	private boolean borrado;
	
	@OneToMany(mappedBy="venta")
	private List<ProductoVenta> detalle;
	

	public Long getVentaid() {
		return ventaid;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public Double getTotal() {
		return total;
	}

	public boolean isBorrado() {
		return borrado;
	}
	
	public List<ProductoVenta> getDetalle() {
		return detalle;
	}
	
	
	public void setVentaid(Long ventaid) {
		this.ventaid = ventaid;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
	
	public void setDetalle(List<ProductoVenta> detalle) {
		this.detalle = detalle;
	}
	
}
