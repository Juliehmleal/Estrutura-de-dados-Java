package com.julie.estruturadados.vetor.teste;

import com.julie.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		Vetor vet = new Vetor(10);
		
		vet.adiciona("agua");
		vet.adiciona("julie");
		vet.adiciona("elemento 3");
		
		System.out.println(vet.busca(1));
		System.out.println(vet.busca(-1));
		

	}

}
