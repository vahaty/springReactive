package com.curso.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.mongodb.entity.Mensaje;
import com.curso.mongodb.service.MensajeService;

@RestController
@RequestMapping(path = "/curso")
public class MensajeController {
	@Autowired
	MensajeService serviceJR;
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Mensaje guardar(@RequestBody Mensaje entity) {
		return serviceJR.guardar(entity);
	}
	
	@RequestMapping(value = "/borrar/{id}", method = RequestMethod.GET)
	public @ResponseBody boolean borrar(@PathVariable String id) {
		return serviceJR.borrar(id);
	}
	
	@RequestMapping(value = "/actualizar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Mensaje actualizar(@RequestBody Mensaje entity) {
		return serviceJR.actualizar(entity);
	}
	
	@RequestMapping(value = "/consultar/{id}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Mensaje consultarPorId(@PathVariable String id) {
		return serviceJR.consultarPorId(id);
	}
	
	@RequestMapping(value = "/consultarTodos", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Mensaje> consultarTodos() {
		return serviceJR.consultarTodos();
	}
}
