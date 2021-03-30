package com.curso.e;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class Nadia implements Observer<Object> {
    @Override
    public void onSubscribe(@NonNull Disposable disposable) {
        System.out.println("Nadia enciende la radio");
    }

    @Override
    public void onNext(@NonNull Object o) {
        System.out.println("Nadia empieza a bailar la cancion  " + ((Cancion)o).getTitulo());
    }

    @Override
    public void onError(@NonNull Throwable throwable) {

    }

    @Override
    public void onComplete() {
        System.out.println("Nadia apaga la radio");
    }
}
