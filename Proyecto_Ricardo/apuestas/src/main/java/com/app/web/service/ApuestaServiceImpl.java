package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entities.Apuesta;
import com.app.web.entities.Bolsillo;
import com.app.web.repository.ApuestaRepository;
import com.app.web.repository.BolsilloRepository;
import com.app.web.repository.ClienteRepository;

@Service
public class ApuestaServiceImpl implements ApuestaService {

	@Autowired
	private ApuestaRepository repositorioApuesta;
	
	@Autowired
	private BolsilloRepository repositorioBolsillo;
	
	@Override
	public List<Apuesta> listarClientes() {
		// TODO Auto-generated method stub
		return repositorioApuesta.findAll();
	}
	@Override
	public Apuesta guardarApuesta(Apuesta apuesta, Long idCliente) {
		
		// TODO Auto-generated method stub
		//Saber el valor del bolsillo del cliente
		boolean estado= false;
		int valorAcumulado = apuesta.getNum_apostadores() * apuesta.getValor_maximo();
		List<Bolsillo> listaBolsillo = repositorioBolsillo.findAll();
		for(int i=0; i<listaBolsillo.size();i++) {
			if(listaBolsillo.get(i).getId_cliente().getId_cliente()==idCliente) {
				//Se encontro el id del cliente
				if(listaBolsillo.get(i).getValor()>valorAcumulado) {
					estado= true;
				}
				else {
					estado=false;
					
				}
			}
		}
		if (estado) {
			repositorioApuesta.save(apuesta);
		}
		else {
			apuesta= null;
		}
		return apuesta;
	}
	
	
	

}
