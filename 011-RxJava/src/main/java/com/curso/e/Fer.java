package com.curso.e;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class Fer implements Observer<Object> {
    @Override
    public void onSubscribe(@NonNull Disposable disposable) {
        System.out.println("Fer enciende la radio");
    }

    @Override
    public void onNext(@NonNull Object o) {
        System.out.println("Fer empieza a cantar " + ((Cancion)o).getTitulo());
    }

    @Override
    public void onError(@NonNull Throwable throwable) {

    }

    @Override
    public void onComplete() {
        System.out.println("Fer apaga la radio");
    }
}
