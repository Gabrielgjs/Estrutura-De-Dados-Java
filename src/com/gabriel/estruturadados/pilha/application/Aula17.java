package com.gabriel.estruturadados.pilha.application;

import com.gabriel.estruturadados.pilha.Pilha;

public class Aula17 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();
		
		pilha.empilha(1);
		pilha.empilha(7);
		pilha.empilha(3);
		pilha.empilha(5);
		
		System.out.println(pilha);
		pilha.desimpilha();
		System.out.println(pilha);
	}

}
