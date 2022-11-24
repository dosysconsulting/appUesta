package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entities.Cliente;
import com.app.web.repository.ClienteRepository;
import com.app.web.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteServicio;
	
	@GetMapping({"/cliente","/"})
	public String listarClientes(Model modelo) {
		modelo.addAttribute("cliente",clienteServicio.listarClientes());
		return "cliente"; //Retornar al archivo clientes
	}
	
	@GetMapping({"/cliente/nuevo","/"})
	public String mostrarFormularioDeRegistroCliente(Model modelo) {
		Cliente cliente= new Cliente();
		modelo.addAttribute("client",cliente);
		return "crear_cliente";
	}
	
	@PostMapping("/cliente")
	public String guardarCliente(@ModelAttribute("cliente") Cliente cliente) {
		clienteServicio.guardarCliente(cliente);
		return "cliente";
	}
	
	@GetMapping({"/cliente/editar/{id}"})
	public String mostrarFormularioEditarCliente(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("cliente", clienteServicio.obtenerCLientePorId(id));
		System.out.println(clienteServicio.obtenerCLientePorId(id).getId());
		return "editar_cliente";
	}
	
	@PostMapping("/cliente/{id}")
	public String actualizarCliente(@PathVariable Long id, @ModelAttribute("cliente") Cliente cliente, Model modelo) {
		Cliente clienteExistente= clienteServicio.obtenerCLientePorId(id);
		clienteExistente.setId(id);
		clienteExistente.setUsuario(cliente.getUsuario());
		clienteExistente.setCelular(cliente.getCelular());
		clienteExistente.setCorreo(cliente.getCorreo());
		clienteExistente.setPerfil(cliente.getPerfil());
		clienteExistente.setCuenta(cliente.getCuenta());
		clienteServicio.actualizarCliente(clienteExistente);
		return "cliente";
	}
	
	@GetMapping({"/cliente/{id}"})
	public String eliminarCliente(@PathVariable Long id) {
		clienteServicio.eliminarCliente(id);
		return "cliente";
	}
	
}
