package com.curso.e;

import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PrincipalDosMonosMerge {

	public static void main(String[] args) {

		Mono<String> mimono = Mono.just("Caracola").delayElement(Duration.ofSeconds(2));
		Mono<String> mimono2 = Mono.just("Caracola otra").delayElement(Duration.ofSeconds(3));
		
		Flux<String> combinar = Flux.merge(mimono,mimono2);
		// Estamos combinando dos monos para construir un flux
		// ¡¡¡pero ahora se ejecutan a la vez!!!
		combinar.subscribe(System.out::println);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
