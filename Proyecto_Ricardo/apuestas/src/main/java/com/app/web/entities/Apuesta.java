package com.app.web.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="apuestas")
public class Apuesta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_apuesta;
	
	
	@Column(name="nombre", nullable=false, length=100)
	private String nombre;
	
	@Column(name="fecha_inicio", nullable=false)
	private Date fecha_inicio;
	
	
	@Column(name="	fecha_fin", nullable=false)
	private Date fecha_fin;
	
	
	@Column(name="estado", nullable=false)
	private String estado;
	
	
	@Column(name="equipo1", nullable=false,length=60)
	private String equipo1;
	
	@Column(name="equipo2", nullable=false,length=60)
	private String equipo2;
	
	@Column(name="num_apostadores", nullable=false)
	private int num_apostadores;
	
	@Column(name="valor_maximo", nullable=false)
	private int valor_maximo;
	
	
	
	@OneToMany(mappedBy="apuesta",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ApuestaCliente> apuestaCliente= new ArrayList<>();
	
	public Apuesta() {
		
	}
	
	

	



	public Apuesta(Long id_apuesta, String nombre, Date fecha_inicio, Date fecha_fin, String estado, String equipo1,
			String equipo2, int num_apostadores, int valor_maximo) {
		super();
		this.id_apuesta = id_apuesta;
		this.nombre = nombre;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.estado = estado;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.num_apostadores = num_apostadores;
		this.valor_maximo = valor_maximo;
	}



	public Long getId_apuesta() {
		return id_apuesta;
	}

	public void setId_apuesta(Long id_apuesta) {
		this.id_apuesta = id_apuesta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}

	public int getNum_apostadores() {
		return num_apostadores;
	}

	public void setNum_apostadores(int num_apostadores) {
		this.num_apostadores = num_apostadores;
	}

	public int getValor_maximo() {
		return valor_maximo;
	}

	public void setValor_maximo(int valor_maximo) {
		this.valor_maximo = valor_maximo;
	}

	public List<ApuestaCliente> getApuestaCliente() {
		return apuestaCliente;
	}



	public void setApuestaCliente(List<ApuestaCliente> apuestaCliente) {
		this.apuestaCliente = apuestaCliente;
	}
	
	
	
}
