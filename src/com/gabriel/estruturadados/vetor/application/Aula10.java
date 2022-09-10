package com.gabriel.estruturadados.vetor.application;

import com.gabriel.estruturadados.vetor.VetorObjeto;

public class Aula10 {

	public static void main(String[] args) {

		VetorObjeto vetor = new VetorObjeto(3);
		
		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2225-4895", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "1236-9887", "contato3@email.com");
		
		Contato c4 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
	}
}
