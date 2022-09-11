package com.gabriel.estruturadados.vetor.exercicios;

import com.gabriel.estruturadados.vetor.Lista;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));
		
	}

}
