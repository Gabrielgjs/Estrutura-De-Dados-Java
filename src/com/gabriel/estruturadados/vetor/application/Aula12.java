package com.gabriel.estruturadados.vetor.application;

import java.util.ArrayList;
import java.util.List;

public class Aula12 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("C");
		
		
		System.out.println(list);
		
		list.add(1, "B");
		
		System.out.println(list);
		
		Boolean existe = list.contains("A");
		if(existe) {
			System.out.println("elemento existe na lista");
		} else {
			System.out.println("Elemento não existe na lista");
		}
		
		int pos = list.indexOf("D");
		if(pos > -1) {
			System.out.println("elemento existe na lista " + pos);
		} else {
			System.out.println("elemento não existe na lista " + pos);
		}
		
		
		System.out.println(list.get(2));
		System.out.println(list.size());
	}

}
