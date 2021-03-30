package com.curso.c;

import io.reactivex.Observable;

public class Principal3 {

	public static void main(String[] args) {

		Observable<String> lista = Observable.just("hola","caracola","hola","mundo");

		// operaci�n de transformaci�n
		lista.map(String::toUpperCase).subscribe(e->System.out.println(e));

	}

}
