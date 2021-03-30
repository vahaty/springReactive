package com.curso.a;

import reactor.core.publisher.Mono;

public class PrincipalMono {

	public static void main(String[] args) {

		// nuestro primer ejemplo con reactor
		// tenemos un elemento de tipo Mono
		// que es un tipo de Observable
		Mono<String> mimono = Mono.just("Caracola");
		mimono.subscribe(System.out::println);
	}

}
