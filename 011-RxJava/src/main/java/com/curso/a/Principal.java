package com.curso.a;

import io.reactivex.Observable;

public class Principal {

	public static void main(String[] args) {

		// Nuestro primer observable
		Observable<String> lista = Observable.just("hola","caracola","hola","mundo");
		
		// Nos acabamos de subscribir a él
		// eso nos procesa en el subscriptor cada uno de los elementos
		lista.subscribe(elem -> System.out.println(elem));
	}

}
