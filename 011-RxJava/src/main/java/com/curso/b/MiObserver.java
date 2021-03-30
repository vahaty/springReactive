package com.curso.b;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MiObserver implements Observer{

	@Override
	public void onSubscribe(Disposable d) {
		System.out.println("Subscritos!!!");
	}

	@Override
	public void onNext(Object t) {
		System.out.println(t);
	}

	@Override
	public void onError(Throwable e) {
		System.out.println("ERROR!!!");
	}

	@Override
	public void onComplete() {
		System.out.println("FIN");
	}

}
