package com.pipecode.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** Models table venta.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Entity
@Table(name="venta")
public class Venta {
	
	/**
	 * Id Venta.
	 */
	@Id
	@Column(name="id_venta")
	private int idVenta;
	
	/*
	 * Date of the Sell.
	 */
	@Column(name="fecha_venta")
	private Date fechaVenta;
	
	/**
	 * Total amount.
	 */
	@Column(name="total")
	private Double total;
	
	/**
	 * Borrado.
	 */
	@Column(name="borrado")
	private boolean borrado;
	
	
	// Getters.
	
	/** Gets idVenta.
	 * 
	 * @return idVenta.
	 */
	public int getIdVenta() {
		return idVenta;
	}
	
	/** Gets fechaVenta.
	 * 
	 * @return fechaVenta.
	 */
	public Date getFechaVenta() {
		return fechaVenta;
	}
	
	/** Gets Total amount.
	 * 
	 * @return total.
	 */
	public Double getTotal() {
		return total;
	}
	
	/** Gets borrado.
	 * 
	 * @return True or False.
	 */
	public boolean isBorrado() {
		return borrado;
	}
	
	
	
	/** Sets idVenta.
	 * 
	 * @param idVenta
	 */
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	
	/** Sets fechaVenta.
	 * 
	 * @param fechaVenta
	 */
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	/** Sets total.
	 * 
	 * @param total
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
	
	/** Sets borrado.
	 * 
	 * @param borrado
	 */
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
	
	
}
