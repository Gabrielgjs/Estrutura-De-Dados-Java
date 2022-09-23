package com.gabriel.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.gabriel.estruturadados.pilha.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Pilha<Integer> pilha = new Pilha<>();

		
		for(int i=1; i<10; i++) {
			System.out.println("Entre com um n�mero");
			
			int num = scan.nextInt();
			
			if( num % 2 == 0) {
				System.out.println("Empilhando o n�emro " + num);
				pilha.empilha(num);
			}else {
				Integer desempilhado = pilha.desimpilha();
				
				if(desempilhado == null) {
					System.out.println("Pilha est� vazia");
				} else {
					System.out.println("N�mero �mpar, desimpilhadondo um elemento da pilha " 
				+ desempilhado);
				}
			}
		}
		
		System.out.println("Todos os n�meros foram lidos, desimplilhando n�meros da pilha");
		
		while(!pilha.estaVazia()) {
			
			System.out.println("desimpilhadondo um elemento da pilha " 
			+ pilha.desimpilha());
			
		}
		
		System.out.println("Todos elementos foram desimpilhados");
	}

}
