package com.julie.estruturadados.vetor.excercicios;

import com.julie.estruturadados.vetor.Lista;

public class Ex01 {

	public static void main(String[] args) {
		Lista<String> vetor = new Lista(5);
		
		vetor.adiciona("casa");
		vetor.adiciona("jacare");
		vetor.adiciona("apartamento");
		vetor.adiciona("pedra");
		vetor.adiciona("carro");

		
		System.out.println(vetor.toString());
		System.out.println(vetor.contem("casa"));
	}

}
