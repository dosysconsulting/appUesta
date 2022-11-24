package com.app.web.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entities.Apuesta;



@Repository
public interface ApuestaRepository extends JpaRepository<Apuesta,Long> {

}
