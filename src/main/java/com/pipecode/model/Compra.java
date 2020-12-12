package com.pipecode.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonSetter;

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
	
	@OneToMany(mappedBy="idCompra")
	@JsonManagedReference
	public List<ProductoCompra> detail;

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
	
	
	public List<ProductoCompra> getDetail() {
		return detail;
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
	
	
	public void setDetail(List<ProductoCompra> detail) {
		this.detail = detail;
	}
}
