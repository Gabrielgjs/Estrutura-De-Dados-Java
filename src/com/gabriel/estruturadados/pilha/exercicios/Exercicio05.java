package com.gabriel.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Exercicio05 {

	public static void main(String[] args) {
		
		imprimiResultado("ADA");
		imprimiResultado("ABCD");
		imprimiResultado("ABCCBA");
		imprimiResultado("Maria");
	}
	
	public static void imprimiResultado(String palavra) {
		System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));
	}
	
	public static boolean testaPalindromo(String palavra) {
		
		Stack<Character> pilha = new Stack<>();
		
		for (int i=0; i<palavra.length(); i++) {
			pilha.push(palavra.charAt(i));
		}
		
		String palavraInversa = "";
		while(!pilha.isEmpty()) {
			palavraInversa += pilha.pop();
		}
		
		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}
		
		return false;
	}
}
