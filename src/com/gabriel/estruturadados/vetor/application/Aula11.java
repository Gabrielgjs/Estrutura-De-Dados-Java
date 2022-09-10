package com.gabriel.estruturadados.vetor.application;

import com.gabriel.estruturadados.vetor.VetorObjeto;

public class Aula11 {

	public static void main(String[] args) {
		 
		VetorObjeto vetor = new VetorObjeto(2);
		
		vetor.adiciona(1);
		vetor.adiciona("Elemento do tipo String");
		
		System.out.println(vetor);
	}
	
}
