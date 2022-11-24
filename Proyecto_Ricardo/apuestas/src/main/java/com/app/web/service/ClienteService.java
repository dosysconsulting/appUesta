package com.app.web.service;

import java.util.List;

import com.app.web.entities.Cliente;

public interface ClienteService {
	
	public List<Cliente> listarClientes();
	
	public  Cliente guardarCliente(Cliente cliente);
	
	public Cliente obtenerCLientePorId(Long id);
	
	public Cliente actualizarCliente(Cliente cliente);
	
	public void eliminarCliente(Long id);
	
}
