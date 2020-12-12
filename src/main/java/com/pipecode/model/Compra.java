package com.pipecode.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** Models a Compra.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@Entity
@Table(name="compra")
public class Compra {
	
	/**
	 * Id compra
	 */
	@Id
	@Column(name="id_compra")
	private int idCompra;
	/**
	 * Date of the buy.
	 */
	@Column(name="fecha_compra")
	private Date fechaCompra;
	
	/**
	 * Total amount of the buy.
	 */
	@Column(name="total")
	private Double total;
	
	/**
	 * Indicates if it's deleted.
	 */
	@Column(name="borrado")
	private boolean borrado;
	
	

	// Getters.
	/**
	 * Gets idCompra.
	 * @return idCompra.
	 */
	public int getIdCompra() {
		return idCompra;
	}

	/**
	 * Gets fechaCompra.
	 * @return fechaCompra.
	 */
	public Date getFechaCompra() {
		return fechaCompra;
	}

	/**
	 * Gets total amount.
	 * @return total.
	 */
	public Double getTotal() {
		return total;
	}

	/** Gets if it's deleted.
	 * 
	 * @return true or false.
	 */
	public boolean isBorrado() {
		return borrado;
	}
	
	
	
	// Setters.
	
	/**
	 * Sets idCompra.
	 * @param idCompra
	 */
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	
	/** Sets fechaCompra.
	 * 
	 * @param fechaCompra
	 */
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
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
