package com.curso.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.curso.mongodb.entity.Mensaje;

@Repository
public interface MensajeRepository extends MongoRepository<Mensaje, String> {
	
}
