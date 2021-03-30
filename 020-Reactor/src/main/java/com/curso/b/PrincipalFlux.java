package com.curso.b;

import reactor.core.publisher.Flux;

public class PrincipalFlux {

	public static void main(String[] args) {

		// construir un Flux que es un Observable
		// para lista de elementos
		Flux<String> elementos = Flux.just("Hola","caracola","hola","mundo");
		elementos.subscribe(System.out::println);
	}

}
