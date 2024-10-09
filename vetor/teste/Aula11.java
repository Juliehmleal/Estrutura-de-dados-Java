package com.julie.estruturadados.vetor.teste;

import com.julie.estruturadados.vetor.Lista;
import com.julie.estruturadados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {
		Lista<Contato> vetContatos = new Lista(3);
		Lista<String> vetor = new Lista(1); 
		
		vetor.adiciona("elemento 1");
		System.out.println(vetor.toString());
		
		Contato c1 = new Contato("Julie", "99139-3003", "juliehmleal@gmail.com");
		Contato c2 = new Contato("Roberto", "94829-3483", "robert@gmail.com");
		Contato c3 = new Contato("Maria", "99879-3983", "caldiu@gmail.com");
		
		vetContatos.adiciona(c1);
		vetContatos.adiciona(c2);
		vetContatos.adiciona(c3);
		
		System.out.println(vetContatos.toString());
		

	}

}
