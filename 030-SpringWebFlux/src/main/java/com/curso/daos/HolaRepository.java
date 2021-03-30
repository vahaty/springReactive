package com.curso.daos;

import java.time.Duration;

import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

@Repository
public class HolaRepository {

	public Mono<String> hola() {
		return Mono.just("hola asincrono").delayElement(Duration.ofSeconds(3));
	}
}
