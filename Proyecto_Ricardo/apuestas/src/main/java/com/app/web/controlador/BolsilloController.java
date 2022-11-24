package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entities.Apuesta;
import com.app.web.service.ApuestaService;
import com.app.web.service.BolsilloService;

@Controller
public class BolsilloController {

	
	@Autowired
	private BolsilloService bolsilloServicio;
	
	@GetMapping({"/bolsillo","/"})
	public String listarBolsillo(Model modelo) {
		modelo.addAttribute("bolsillo",bolsilloServicio.listarBolsillo());
		return "bolsillo"; //Retornar al archivo apuestas
	}
	
	/*
	@GetMapping({"/apuesta/nuevo","/"})
	public String mostrarFormularioDeRegistroApuesta(Model modelo) {
		Apuesta apuesta= new Apuesta();
		modelo.addAttribute("apuesta",apuesta);
		return "crear_apuesta";
	}
	
	@PostMapping("/apuesta")
	public String guardarApuesta(@ModelAttribute("apuesta") Apuesta apuesta) {
		apuestaServicio.guardarApuesta(apuesta);
		return "apuesta";
	}*/
	
	
}
