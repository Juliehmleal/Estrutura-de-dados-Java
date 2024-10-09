package com.julie.estruturadados.vetor.excercicios;

import java.util.Scanner;

import com.julie.estruturadados.vetor.Lista;
import com.julie.estruturadados.vetor.teste.Contato;


public class Ex06 {

	public static void main(String[] args) {
		//Criação das variaveis e vetor com capacidade de 20
		Lista<Contato> vetContatos = new Lista(20);
		Scanner teclado = new Scanner(System.in);
		
		//criar e aducinar 30 contatos
		criarContatosDinamicamente(30, vetContatos);
		
		System.out.println(vetContatos.toString());
		System.out.println(vetContatos.getTamanho());
		
		
	}
	
	private static int obterOpcaoMenu(Scanner teclado) {
		System.out.println("Digite a opção desejada");
		System.out.println("1: Adiciona contato no final do vetor");
		System.out.println("2: Adiciona contato em uma posição específica");
		System.out.println("3: Obtém contato de uma posição específica");
		System.out.println("4: Consulta contato");
		System.out.println("5: Consulta último índice do contato");
		System.out.println("6: Verifica se contato existe");
		System.out.println("7: Exlcluir contato por posição");
		System.out.println("8: Excluir contato");
		System.out.println("9: Verifica tamanho do vetor");
		
		
		return 0;
	}

	private static void criarContatosDinamicamente(int quantidade,Lista<Contato> lista) {
		Contato contato;
		
		for(int i=1; i<=quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato" + i);
			contato.setTelefone("11111111"+i);
			contato.setEmail("contato"+i+"@email.com");
			
			lista.adiciona(contato);
		}
	}
}
