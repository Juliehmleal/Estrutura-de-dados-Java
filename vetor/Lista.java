package com.julie.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista <T>{

	private T[] elementos;
	private int tamanho;


	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	
	public void limparLista() {
		for(int i=0; i<this.getTamanho(); i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}


	/*
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	 */

	public T obtem(int indice)
	{
		return this.busca(indice);
	}

	public void remove(T elemento){
		int pos = busca(elemento);
		if(pos >= 0){
			this.remove(pos);
		}

	}


	public void remove(int posicao) {
		if(!(posicao >= 0 &&posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		for(int i = posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}

		this.tamanho--;


	}

	public boolean adiciona(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho<this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}

		return false;

	}

	public void adiciona(int posicao, T elemento) {
		if(!(posicao >= 0 &&posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		this.aumentaCapacidade();

		this.tamanho++;
		//mover todos os elementos
		for(int i=this.tamanho-1; i>=posicao; i--)
		{
			this.elementos[i+1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
	}

	private void aumentaCapacidade () {
		if(this.tamanho == this.elementos.length) {
			//Cria um novo vetor com o dobro de armazenamento
			T elementosNovos[] = (T[]) new Object[this.elementos.length*2];
			for (int i=0; i<this.tamanho; i++) {
				elementosNovos[i] = this.elementos[i];
			}

			this.elementos = elementosNovos;
		}
	}

	public T busca(int posicao) {
		if(!(posicao >= 0 &&posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		else {
			return this.elementos[posicao];
		}

	}

	public boolean contem (T elemento) {
		return busca(elemento) > -1;	
	}


	public int busca (T elemento) {
		for(int i=0; i<this.tamanho;i++ )
		{
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;	
	}

	public int ultimoIndice (T elemento) {
		for(int i=this.tamanho-1; i>=0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}


	public int getTamanho () {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();

		s.append("[");

		for(int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}


		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}


		s.append("]");


		return s.toString();
	}
}
