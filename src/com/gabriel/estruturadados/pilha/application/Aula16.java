package com.gabriel.estruturadados.pilha.application;

import com.gabriel.estruturadados.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();
		
		
		System.out.println(pilha.topo());
		System.out.println(pilha);
		
		
		pilha.empilha(1);
		pilha.empilha(7);
		pilha.empilha(3);
		pilha.empilha(5);
		pilha.empilha(10);
		pilha.empilha(2);
		
		System.out.println(pilha.topo());
		System.out.println(pilha);
		
	}

}
