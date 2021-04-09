package exercicios.listas_ligadas;

import estruturas_de_dados.listas_ligadas.ListaLigada;
import estruturas_de_dados.listas_ligadas.No;

public class ConcatenarListas {
	
	/*
	 * Exercício: Escreva uma função que concatena duas listas ligadas (isto é, “amarra” a segunda no fim da primeira) e 
	 * retorna um ponteiro para a lista ligada. As listas originais não devem ser alteradas.
	 */

	public static void main(String[] args) {

		ListaLigada lista1 = new ListaLigada();
		ListaLigada lista2 = new ListaLigada();
		
		lista1.adicionaValor(2);
		lista1.adicionaValor(3);
		lista1.adicionaValor(4);
		lista1.adicionaValor(5);
		lista1.adicionaValor(6);
		
		lista2.adicionaValor(7);
		lista2.adicionaValor(8);
		lista2.adicionaValor(9);
		lista2.adicionaValor(10);
		lista2.adicionaValor(11);
		
		concatenarListas(lista1, lista2);
	}
	
	public static void concatenarListas(ListaLigada lista1, ListaLigada lista2) {
		int tamanho = lista1.tamanho + lista2.tamanho;
		ListaLigada lista3 = new ListaLigada();
		lista3.tamanho = tamanho;
		for (int i = 0; i < lista1.tamanho; i++) {
			No no = lista1.pegarElementoNaPosicao(i);
			if (no.equals(lista1.ultimo)) {
				no.proximo = (lista2.pegarElementoNaPosicao(0));
			}
			lista3.adicionaValor(no.valor);
		}
		
		for (int i = 0; i < lista2.tamanho; i++) {
			No no = lista2.pegarElementoNaPosicao(i);
			lista3.adicionaValor(no.valor);
		}
		System.out.print("Lista 1: " + lista1.exibeLista());
		System.out.print("Lista 2: " + lista2.exibeLista());
		System.out.print("Listas concatenadas : " + lista3.exibeLista());
	}
}
