package com.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

import com.curso.components.ExampleHandlerFilterFunction;
import com.curso.components.PlayerHandler;

@SpringBootApplication
public class Application {

	@Bean
	public RouterFunction<ServerResponse> route(PlayerHandler playerHandler) {
		return RouterFunctions.route(GET("/players/{name}"), playerHandler::getName)
				.filter(new ExampleHandlerFilterFunction());
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
