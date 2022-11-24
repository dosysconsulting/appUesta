package com.app.web.service;

import java.util.List;

import com.app.web.entities.Apuesta;



public interface ApuestaService {
	public List<Apuesta> listarClientes();
	
	public  Apuesta guardarApuesta(Apuesta apuesta, Long idCliente);

	
}
