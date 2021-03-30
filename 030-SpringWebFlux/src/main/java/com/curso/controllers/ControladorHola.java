package com.curso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping
public class ControladorHola {
	@Autowired
	com.curso.services.HolaService servicio;

	@RequestMapping("/hola")
	public Flux<String> hola() {

		return servicio.hola();
	}
}