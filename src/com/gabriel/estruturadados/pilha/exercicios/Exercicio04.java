package com.gabriel.estruturadados.pilha.exercicios;

import java.util.Stack;

import com.gabriel.estruturadados.pilha.Livro;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Stack<Livro> pilha = new Stack<>();

		Livro livro1 = new Livro();
		livro1.setNome("java");
		livro1.setAutor("Javac");
		livro1.setAnoLancamento(2000);
		livro1.setIsbn("BCS324");

		Livro livro2 = new Livro();
		livro2.setNome("python");
		livro2.setAutor("pytholomeu");
		livro2.setAnoLancamento(2010);
		livro2.setIsbn("BCS358");

		Livro livro3 = new Livro();
		livro3.setNome("HTML");
		livro3.setAutor("Heithor");
		livro3.setAnoLancamento(1999);
		livro3.setIsbn("BCS378");

		System.out.println("pilha de livros criada, pilha está vazia? " + pilha.isEmpty());
		System.out.println("Empilhando livros na pilha: ");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);

		System.out.println(pilha.size() + " livros empilhados");
		System.out.println(pilha);

		System.out.println("pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

		System.out.println("Espiando o topo da pilha: " + pilha.peek());

		System.out.println("Desempilhando livros da pilha");
		while (!pilha.isEmpty()) {
			System.out.println("Desempilhando livro? " + pilha.pop());

		}

		System.out.println("Todos livros foram desempilhados");

	}

}
