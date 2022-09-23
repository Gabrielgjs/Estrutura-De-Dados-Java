package com.gabriel.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.gabriel.estruturadados.pilha.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Pilha<Integer> par = new Pilha<>();
		Pilha<Integer> impar = new Pilha<>();

		for (int i = 1; i <= 10; i++) {

			System.out.println("Entre com um número: ");
				
			int num = scan.nextInt();

			if (num == 0) {
				Integer desempilhado = par.desimpilha();
				if (desempilhado == null) {
					System.out.println("Pilha par vazia");
				}else {
					System.out.println("Desempilhando da pilha par: " + desempilhado);
				}
				
				desempilhado = impar.desimpilha();
				if (desempilhado == null) {
					System.out.println("Pilha impar vazia");
				}else {
					System.out.println("Desempilhando da pilha impar: " + desempilhado);
				}
				
				impar.desimpilha();
			} else if (num % 2 == 0) {
				System.out.println("Empilhando o número par " + num);
				par.empilha(num);
			} else {
				System.out.println("Empilhando o número ímpar " + num);
				impar.empilha(num);
			}

		}
		
		
		System.out.println("Desempilhando todos os números da pilha par");
		
		while(!par.estaVazia()) {
			System.out.println("Desempilhando da pilha par: " + par.desimpilha());
		}
		

		System.out.println("Desempilhando todos os números da pilha impar");
		
		while(!impar.estaVazia()) {
			System.out.println("Desempilhando da pilha impar: " + impar.desimpilha());
		}
	}

}
