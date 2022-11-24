package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entities.Cliente;
import com.app.web.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repositorio;
	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}
	@Override
	public Cliente guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return repositorio.save(cliente);
	}
	@Override
	public Cliente obtenerCLientePorId(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).get();
	}
	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return repositorio.save(cliente);
	}
	@Override
	public void eliminarCliente(Long id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	
	
}
