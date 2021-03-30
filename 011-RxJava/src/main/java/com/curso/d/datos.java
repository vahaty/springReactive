package com.curso.d;

import java.io.File;

public class datos implements EventListener {
	private String titulo;
	private String artista;
	private String cantar;

	public datos(String titulo, String artista, String cantar) {
		
		this.titulo = titulo;
		this.cantar = cantar;
		this.artista = artista;
	}

	@Override
	public void update(String eventType, File file) {
		// TODO Auto-generated method stub
		
	}

}
