package com.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.daos.HolaRepository;

import reactor.core.publisher.Flux;

@Service
public class HolaService {
	
	@Autowired
	HolaRepository repo;
	
	public Flux<String> hola() {
		
		Flux<String> flux = Flux.concat(repo.hola(),repo.hola());
		return flux;
	}

}