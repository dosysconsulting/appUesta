package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.app.web.entities.Apuesta;
import com.app.web.entities.Bolsillo;
import com.app.web.repository.BolsilloRepository;

@Service
public class BolsilloServiceImpl implements BolsilloService {

	@Autowired
	private BolsilloRepository repositorioBolsillo;

	@Override
	public List<Bolsillo> listarBolsillo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bolsillo guardarBolsillo(Bolsillo bolsillo) {
		// TODO Auto-generated method stub
		return repositorioBolsillo.save(bolsillo);
	}

}
