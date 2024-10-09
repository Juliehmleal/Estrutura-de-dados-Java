package com.julie.estruturadados.vetor.teste;

import com.julie.estruturadados.vetor.Vetor;

public class Aula08 {

	public static void main(String[] args) {
		Vetor vet = new Vetor(1);
		
		vet.adiciona("B");
		vet.adiciona("C");
		vet.adiciona("E");
		vet.adiciona("F");
		vet.adiciona("G");
		
		vet.adiciona("bananas");
		
		System.out.println(vet);

	}

}
