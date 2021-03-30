package com.curso.e;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class Ant implements Observer<Object> {
    @Override
    public void onSubscribe(@NonNull Disposable disposable) {
        System.out.println("Ant enciende la radio");
    }

    @Override
    public void onNext(@NonNull Object o) {
        System.out.println("Ant empieza a valorar a " + ((Cancion)o).getArtista());
    }

    @Override
    public void onError(@NonNull Throwable throwable) {

    }

    @Override
    public void onComplete() {
        System.out.println("Ant apaga la radio");
    }
}
