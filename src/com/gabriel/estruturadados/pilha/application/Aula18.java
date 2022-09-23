package com.gabriel.estruturadados.pilha.application;

import java.util.Stack;

import com.gabriel.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		
		Pilha<Integer> pilha = new Pilha<>();
		
		Stack<Integer> stack = new Stack<>();
		
		
		System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(5);
		stack.push(4);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}

}
