package com.curso.e;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Principal5 {
    public static void main(String[] args) {
        Observable<Cancion> emisora = Observable.just(new Cancion("asd","asd"),new Cancion("qwe", "qwe"));

        emisora.delay(1, TimeUnit.SECONDS).subscribe(new Fer());
        emisora.delay(1, TimeUnit.SECONDS).subscribe(new Nadia());
        emisora.delay(1, TimeUnit.SECONDS).subscribe(new Ant());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
