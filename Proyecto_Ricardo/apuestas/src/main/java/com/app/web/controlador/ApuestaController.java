package com.app.web.controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entities.Apuesta;
import com.app.web.entities.Cliente;
import com.app.web.service.ApuestaService;
import com.app.web.service.BolsilloService;

@Controller
public class ApuestaController {

	
	@Autowired
	private ApuestaService apuestaServicio;
	
	private EntityManagerFactory emf = null;
	
	
	
	@Autowired
	private BolsilloService bolsilloServicio;
	
	@GetMapping({"/apuesta","/"})
	public String listarClientes(Model modelo) {
		modelo.addAttribute("apuesta",apuestaServicio.listarClientes());
		return "apuesta"; //Retornar al archivo apuestas
	}
	
	@GetMapping({"/apuesta/nuevo","/"})
	public String mostrarFormularioDeRegistroApuesta(Model modelo) {
		Apuesta apuesta= new Apuesta();
		modelo.addAttribute("apuesta",apuesta);
		return "crear_apuesta";
	}
	
	@PostMapping("/apuesta/")
	public String guardarApuesta(@ModelAttribute("apuesta") Apuesta apuesta,Model modelo) {
		Apuesta apuestaTrae = apuestaServicio.guardarApuesta(apuesta, new Long(1));
		if(apuestaTrae ==null) {
			return "apuesta";
		}
		else {
			return "error";
		}
		
	}
}
