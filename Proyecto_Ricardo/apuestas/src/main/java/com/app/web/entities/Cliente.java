package com.app.web.entities;

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
@Table(name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_cliente;
	
	
	@Column(name="usuario", nullable=false, length=60)
	private String usuario;
	
	@Column(name="password", nullable=false, length=30)
	private String password;
	
	
	@Column(name="correo", nullable=false, length=60)
	private String correo;
	
	
	@Column(name="celular", nullable=false)
	private int celular;
	
	
	@Column(name="cuenta", nullable=false)
	private int cuenta;
	
	@Column(name="perfil", nullable=false)
	private String perfil;
	
	@OneToMany(mappedBy="id_cliente",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ApuestaCliente> apuestaCliente = new ArrayList<>();
	
	@OneToMany(mappedBy="id_bolsillo",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Bolsillo> bolsillo= new ArrayList<>();
	
	
	public Cliente() {
		
	}
	
	public Cliente(Long id, String usuario, String password, String correo, int celular, int cuenta, String perfil) {
		super();
		this.id_cliente = id;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
		this.celular = celular;
		this.cuenta = cuenta;
		this.perfil = perfil;
	}

	public Cliente(String usuario, String password, String correo, int celular, int cuenta, String perfil) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
		this.celular = celular;
		this.cuenta = cuenta;
		this.perfil = perfil;
	}
	
	public Long getId() {
		return id_cliente;
	}

	public void setId(Long id) {
		this.id_cliente = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	
	
	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}
/*
	public List<ApuestaCliente> getApuestaCliente() {
		return apuestaCliente;
	}

	public void setApuestaCliente(List<ApuestaCliente> apuestaCliente) {
		this.apuestaCliente = apuestaCliente;
	}

	public List<Bolsillo> getBolsillo() {
		return bolsillo;
	}

	public void setBolsillo(List<Bolsillo> bolsillo) {
		this.bolsillo = bolsillo;
	}*/

	@Override
	public String toString() {
		return "Cliente [id=" + id_cliente + ", usuario=" + usuario + ", password=" + password + ", correo=" + correo
				+ ", celular=" + celular + ", cuenta=" + cuenta + ", perfil=" + perfil + "]";
	}
	
	
}
