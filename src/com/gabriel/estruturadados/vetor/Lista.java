package com.gabriel.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}


	// Aula02
	public boolean adiciona(T elemento) {
		aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	// 0 1 2 3 4 5 6 = tamanho � 5
	// B C E F G + +
	//Aula07
	public boolean adiciona(int posicao, T elemento) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		
		aumentaCapacidade();
		
		//mover elementos
		for (int i=this.tamanho-1; i>= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		tamanho++;
		return true;
	}
	
	//Aula08
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[])new Object[this.elementos.length *2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//B G D E F  -> posi��o a ser removida � 1 (G)
	//0 1 2 3 4 -> Tamanho � 5
	//vetor[1] = vetor[2]
	//vetor[2] = vetor[3]
	//vetor[3] = vetor[4]
	//Aula09
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

	// Aula04
	public int tamanho() {
		return this.tamanho;
	}

	// Aula05
	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.elementos[posicao];
	}

	// Aula06
	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	// Aula04
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			sb.append(this.elementos[i]);
			sb.append(", ");
		}

		if (this.tamanho > 0) {
			sb.append(this.elementos[this.tamanho - 1]);
		}
		sb.append("]");
		return sb.toString();
	}
	
	
	
}
