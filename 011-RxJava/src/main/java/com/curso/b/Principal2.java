package com.curso.b;

import io.reactivex.Observable;

public class Principal2 {

	public static void main(String[] args) {

		// Nuestro primer observable
		Observable<String> lista = Observable.just("hola","caracola","hola","mundo");
		
		// Nos acabamos de subscribir a él
		// eso nos procesa en el subscriptor cada uno de los elementos
		lista.subscribe(new MiObserver());
		System.out.println("---------------");
		lista.subscribe(new MiObserver());

	}

}
