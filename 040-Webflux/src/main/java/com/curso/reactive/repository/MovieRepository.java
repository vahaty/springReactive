package com.curso.reactive.repository;

import com.curso.reactive.Movie;

import reactor.core.publisher.Flux;

public interface MovieRepository {

    Flux<Movie> findAll();

}
