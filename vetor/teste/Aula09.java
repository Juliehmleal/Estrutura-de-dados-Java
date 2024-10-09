package com.julie.estruturadados.vetor.teste;

import com.julie.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		Vetor vet = new Vetor(1);
		
		vet.adiciona("B");
		vet.adiciona("G");
		vet.adiciona("D");
		vet.adiciona("E");
		vet.adiciona("F");
		
		System.out.println(vet.toString());
		
		vet.elimina(0);
		System.out.println(vet.toString());
		
		vet.adiciona("bolsonaro");
		System.out.println(vet.toString());
		
		System.out.println("apagando o elemento bolsonaro");
		
		
		//descobrindo a posicao de um elemento usando o metodo busca
		int pos = vet.busca("bolsonaro");
		//caso busca retorne maior que 0 (funcionou) exclua no indice busca
		if(pos>=0) {
			vet.elimina(pos);
		}
		
		System.out.println(vet.toString());

	}

}
