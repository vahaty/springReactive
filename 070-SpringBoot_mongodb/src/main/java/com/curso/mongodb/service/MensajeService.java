package com.curso.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.mongodb.entity.Mensaje;
import com.curso.mongodb.repository.MensajeRepository;

@Service
public class MensajeService {
	@Autowired
	MensajeRepository repository;
	
	public Mensaje guardar(Mensaje entity) {
		return repository.save(entity);
	}
	
	public boolean borrar(String id) {
		try {
			repository.deleteById(id);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public Mensaje actualizar(Mensaje entity) {
		return repository.save(entity);
	}
	
	public Mensaje consultarPorId(String id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Mensaje>consultarTodos() {
		return repository.findAll();
	}
}
