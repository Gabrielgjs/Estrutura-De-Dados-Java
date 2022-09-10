package com.gabriel.estruturadados.vetor.application;

import com.gabriel.estruturadados.vetor.Lista;

public class Aula12 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<>(1);
		
		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2225-4895", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "1236-9887", "contato3@email.com");
		
		Contato c4 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
	
		vetor.adiciona(c4);
		
	}

}
