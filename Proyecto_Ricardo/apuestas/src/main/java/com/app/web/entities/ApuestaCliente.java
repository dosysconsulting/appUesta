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
@Table(name="apuestaCliente")
public class ApuestaCliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_apuesta_cliente;
	
	@ManyToOne
	@JoinColumn(name="apuesta")
	private Apuesta apuesta;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente id_cliente;
	
	@Column(name="	fecha_creacion", nullable=false)
	private Date fecha_creacion;
	
	@Column(name="valor_apostado", nullable=false)
	private int valor_apostado;
	
	@Column(name="equipo_select", nullable=false,length=60)
	private String equipo_select;

	public ApuestaCliente() {
		
	}
	
	public ApuestaCliente(Long id_apuesta_cliente, Apuesta apuesta, Cliente id_cliente, Date fecha_creacion,
			int valor_apostado, String equipo_select) {
		super();
		this.id_apuesta_cliente = id_apuesta_cliente;
		this.apuesta = apuesta;
		this.id_cliente = id_cliente;
		this.fecha_creacion = fecha_creacion;
		this.valor_apostado = valor_apostado;
		this.equipo_select = equipo_select;
	}

	public Long getId_apuesta_cliente() {
		return id_apuesta_cliente;
	}

	public void setId_apuesta_cliente(Long id_apuesta_cliente) {
		this.id_apuesta_cliente = id_apuesta_cliente;
	}

	public Apuesta getApuesta() {
		return apuesta;
	}

	public void setApuesta(Apuesta apuesta) {
		this.apuesta = apuesta;
	}

	public Cliente getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public int getValor_apostado() {
		return valor_apostado;
	}

	public void setValor_apostado(int valor_apostado) {
		this.valor_apostado = valor_apostado;
	}

	public String getEquipo_select() {
		return equipo_select;
	}

	public void setEquipo_select(String equipo_select) {
		this.equipo_select = equipo_select;
	}

	@Override
	public String toString() {
		return "ApuestaCliente [id_apuesta_cliente=" + id_apuesta_cliente + ", apuesta=" + apuesta + ", id_cliente="
				+ id_cliente + ", fecha_creacion=" + fecha_creacion + ", valor_apostado=" + valor_apostado
				+ ", equipo_select=" + equipo_select + "]";
	}
	
	
}
