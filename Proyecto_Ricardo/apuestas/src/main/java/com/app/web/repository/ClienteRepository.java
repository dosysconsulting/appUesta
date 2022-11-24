package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

	
	
}
