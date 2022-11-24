package com.app.web.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="bolsillo")
public class Bolsillo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_bolsillo;
	
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente id_cliente;
	
	@Column(name="	valor", nullable=false)
	private int valor;
	
	
	public Bolsillo() {
		
	}


	public Bolsillo(Long id_apuesta_cliente, Cliente id_cliente, int valor) {
		super();
		this.id_bolsillo = id_apuesta_cliente;
		this.id_cliente = id_cliente;
		this.valor = valor;
	}


	public Long getId_apuesta_cliente() {
		return id_bolsillo;
	}


	public void setId_apuesta_cliente(Long id_apuesta_cliente) {
		this.id_bolsillo = id_apuesta_cliente;
	}


	public Cliente getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}


	public Long getId_bolsillo() {
		return id_bolsillo;
	}


	public void setId_bolsillo(Long id_bolsillo) {
		this.id_bolsillo = id_bolsillo;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	


	
	
	
}
