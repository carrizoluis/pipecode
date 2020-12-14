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

/** Models Compra Table.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Entity
@Table(name="compra")
public class Compra {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long compraid;
	
	@Column(name="fecha_compra")
	private Date fecha_compra;
	
	@Column(name="total")
	private Double total;
	
	@Column(name="borrado")
	private boolean borrado;
	
	@OneToMany(mappedBy="compra")
	private List<ProductoCompra> detalle;
	
	
	// Getters.
	public Long getCompraid() {
		return compraid;
	}
	public Date getFecha_compra() {
		return fecha_compra;
	}
	public Double getTotal() {
		return total;
	}
	public boolean isBorrado() {
		return borrado;
	}
	
	public List<ProductoCompra> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<ProductoCompra> detalle) {
		this.detalle = detalle;
	}
	// Setters
	public void setCompraid(Long compraid) {
		this.compraid = compraid;
	}
	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
	
	
}
