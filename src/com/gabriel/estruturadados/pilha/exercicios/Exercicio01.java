package com.gabriel.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.gabriel.estruturadados.pilha.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Pilha<Integer> pilha = new Pilha<>();

		
		for(int i=1; i<10; i++) {
			System.out.println("Entre com um número");
			
			int num = scan.nextInt();
			
			if( num % 2 == 0) {
				System.out.println("Empilhando o núemro " + num);
				pilha.empilha(num);
			}else {
				Integer desempilhado = pilha.desimpilha();
				
				if(desempilhado == null) {
					System.out.println("Pilha está vazia");
				} else {
					System.out.println("Número ímpar, desimpilhadondo um elemento da pilha " 
				+ desempilhado);
				}
			}
		}
		
		System.out.println("Todos os números foram lidos, desimplilhando números da pilha");
		
		while(!pilha.estaVazia()) {
			
			System.out.println("desimpilhadondo um elemento da pilha " 
			+ pilha.desimpilha());
			
		}
		
		System.out.println("Todos elementos foram desimpilhados");
	}

}
