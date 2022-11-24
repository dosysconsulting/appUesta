package com.app.web.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	private Long cedula;
	
	
	@Column(name="nombres", nullable=false, length=120)
	private String nombres;
	
	@Column(name="apellidos", nullable=false, length=120)
	private String apellidos;
	
	
	@Column(name="clave", nullable=false, length=100)
	private String clave;
	
	
	public Usuario() {
		
	}


	public Usuario(Long cedula, String nombres, String apellidos, String clave) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.clave = clave;
	}


	public Long getCedula() {
		return cedula;
	}


	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", clave=" + clave
				+ "]";
	}
	
	
	
	
	
	
	
	
}
