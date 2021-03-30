package com.curso.mongodb.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mensaje")
public class Mensaje implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2330289880871451994L;
	@Id
	private String id;
	private String mensaje;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
