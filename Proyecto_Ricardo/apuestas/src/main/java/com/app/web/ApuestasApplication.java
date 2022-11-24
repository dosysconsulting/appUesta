package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entities.Cliente;
import com.app.web.repository.ClienteRepository;

@SpringBootApplication
public class ApuestasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApuestasApplication.class, args);
	}

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
