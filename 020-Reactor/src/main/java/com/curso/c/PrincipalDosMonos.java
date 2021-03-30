package com.curso.c;

import java.time.Duration;

import reactor.core.publisher.Mono;

public class PrincipalDosMonos {

	public static void main(String[] args) {

		Mono<String> mimono = Mono.just("Caracola").delayElement(Duration.ofSeconds(2));
		mimono.subscribe(System.out::println);
		
		Mono<String> mimono2 = Mono.just("Caracola otra").delayElement(Duration.ofSeconds(3));
		mimono2.subscribe(System.out::println);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
