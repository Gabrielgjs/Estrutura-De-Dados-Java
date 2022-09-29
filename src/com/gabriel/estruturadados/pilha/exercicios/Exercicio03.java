package com.gabriel.estruturadados.pilha.exercicios;

import com.gabriel.estruturadados.pilha.Livro;
import com.gabriel.estruturadados.pilha.Pilha;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Pilha<Livro> pilha = new Pilha<>(20);
		
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
		
		System.out.println("pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
		System.out.println("Empilhando livros na pilha: ");
		
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		
		System.out.println( pilha.tamanho() + " livros empilhados");
		System.out.println(pilha);
		
		System.out.println("pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Espiando o topo da pilha: " + pilha.topo());
		
		System.out.println("Desempilhando livros da pilha");
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando livro? " + pilha.desimpilha());
			
		}
		
		System.out.println("Todos livros foram desempilhados");
	}

}
