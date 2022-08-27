package com.gabriel.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * public void adiciona(String elemento) { for (int i=0; i<elementos.length;
	 * i++) { if(elementos[i] == null) { this.elementos[i] = elemento; break; } } }
	 */

	/*public void adiciona(String elemento) throws Exception {

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
		}

	}*/

	//Aula02
	public boolean adiciona(String elemento) {
 
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	//Aula04
	public int tamanho() {
		return this.tamanho;
	}
	
	//Aula05
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		} 
		return this.elementos[posicao];
	}
	
	//Aula06
	public int busca(String elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	//Aula04
	@Override
	public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append("[");
		 for(int i=0; i<this.tamanho-1; i++) {
			 sb.append(this.elementos[i]);
			 sb.append(", ");
		 }
		 
		 if(this.tamanho > 0) {
			 sb.append(this.elementos[this.tamanho-1]);
		 }
		 sb.append("]");
		return sb.toString();
	}
}
