package com.curso.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/health")
public class MyController {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/{ping}")
	public Mono<String> check(@PathVariable("ping") String ping) {
		log.info(ping);
		return Mono.just("pong");
	}

}
