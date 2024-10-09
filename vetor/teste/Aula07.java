package com.julie.estruturadados.vetor.teste;

import com.julie.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		Vetor vet = new Vetor(10);
		
		vet.adiciona("B");
		vet.adiciona("C");
		vet.adiciona("E");
		vet.adiciona("F");
		vet.adiciona("G");
		
		vet.adiciona(0, "A");
		System.out.println(vet.toString());
		
		vet.adiciona(3, "D");
		System.out.println(vet.toString());

	}

}
