package com.julie.estruturadados.vetor.excercicios;

import com.julie.estruturadados.vetor.Lista;

public class Ex04 {
	public static void main(String[] args) {
		Lista<String> vet = new Lista(5);

		vet.adiciona("agua");
		vet.adiciona("carro");
		vet.adiciona("abacaxi");
		vet.adiciona("salame");
		vet.adiciona("agua");


		System.out.println(vet.obtem(0));

	}
}
