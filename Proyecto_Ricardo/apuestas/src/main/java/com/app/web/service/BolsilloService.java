package com.app.web.service;

import java.util.List;

import com.app.web.entities.Apuesta;
import com.app.web.entities.Bolsillo;



public interface BolsilloService {
	public List<Bolsillo> listarBolsillo();
	
	public  Bolsillo guardarBolsillo(Bolsillo bolsillo);
	
	
	
	//public Bolsillo obtenerBolsilloPorCliente(Long id);
	
	/*public Cliente actualizarCliente(Cliente cliente);
	
	public void eliminarCliente(Long id);*/
	
}
