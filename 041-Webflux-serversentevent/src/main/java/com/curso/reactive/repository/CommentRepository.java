package com.curso.reactive.repository;

import com.curso.reactive.model.Comment;

import reactor.core.publisher.Flux;

public interface CommentRepository {

    Flux<Comment> findAll();

}
