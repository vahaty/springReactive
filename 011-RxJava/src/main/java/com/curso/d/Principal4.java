package com.curso.d;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Principal4 {

	public static void main(String[] args) {

		Observable<Long> lista = Observable.interval(1, TimeUnit.SECONDS);
		lista.subscribe(System.out::println);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
