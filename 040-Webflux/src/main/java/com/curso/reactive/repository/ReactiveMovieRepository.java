package com.curso.reactive.repository;

import org.springframework.stereotype.Repository;

import com.curso.reactive.Movie;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReactiveMovieRepository implements MovieRepository {

    private static List<Movie> movie = new ArrayList<>();

    static {
        movie.add(new Movie("Polar (2019)", 64));
        movie.add(new Movie("Iron Man (2008)", 79));
        movie.add(new Movie("The Shawshank Redemption (1994)", 93));
        movie.add(new Movie("Forrest Gump (1994)", 83));
        movie.add(new Movie("Glass (2019)", 70));
        movie.add(new Movie("Bracula (1997)", 100));
    }

    @Override
    public Flux<Movie> findAll() {
        //simulate stream data with 2 seconds delay.
        return Flux.fromIterable(movie).delayElements(Duration.ofSeconds(2));
    }

}
