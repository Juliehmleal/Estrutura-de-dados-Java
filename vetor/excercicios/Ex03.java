package com.julie.estruturadados.vetor.excercicios;

import com.julie.estruturadados.vetor.Lista;

public class Ex03 {
	public static void main(String[] args) {
		Lista<String> vet = new Lista(5);
		
		vet.adiciona("agua");
		vet.adiciona("carro");
		vet.adiciona("abacaxi");
		vet.adiciona("salame");
		vet.adiciona("agua");
		
		vet.remove("agua");
		System.out.println(vet.toString());
		
	}
}
