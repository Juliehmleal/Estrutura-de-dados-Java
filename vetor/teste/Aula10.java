package com.julie.estruturadados.vetor.teste;

import com.julie.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		VetorObjetos vet = new VetorObjetos(10);
		Contato c1 = new Contato("Julie", "99139-3003", "juliehmleal@gmail.com");
		Contato c2 = new Contato("Roberto", "94829-3483", "robert@gmail.com");
		Contato c3 = new Contato("Maria", "99879-3983", "caldiu@gmail.com");
		Contato c4 = new Contato("Maria", "99879-3983", "caldiu@gmail.com");
		
		vet.adiciona(c1);
		vet.adiciona(c2);
		vet.adiciona(c3);
		//c4 não foi adicionado
		
		System.out.println(vet.getTamanho());
		System.out.println(vet.toString());
		
		int pos = vet.busca(c4);
		if(pos >=0) {
			System.out.println("Elemento existe no vetor");
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		
		

	}

}
