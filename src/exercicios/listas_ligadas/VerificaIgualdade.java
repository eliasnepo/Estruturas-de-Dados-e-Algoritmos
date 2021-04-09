package exercicios.listas_ligadas;

import estruturas_de_dados.listas_ligadas.ListaLigada;

public class VerificaIgualdade {

	/*
	 * Exercício: Escreva uma função que verifica se duas listas ligadas dadas 
	 * são iguais (mesmo conteúdo).
	 */
	
	public static void main(String[] args) {

		ListaLigada lista1 = new ListaLigada();
		ListaLigada lista2 = new ListaLigada();
		ListaLigada lista3 = new ListaLigada();
		ListaLigada lista4 = new ListaLigada();
		
		//LISTAS IGUAIS
		lista1.adicionaValor(2);
		lista1.adicionaValor(3);
		lista1.adicionaValor(4);
		lista1.adicionaValor(5);
		lista1.adicionaValor(6);
		
		lista2.adicionaValor(2);
		lista2.adicionaValor(3);
		lista2.adicionaValor(4);
		lista2.adicionaValor(5);
		lista2.adicionaValor(6);
		
		//LISTAS DIFERENTES
		lista3.adicionaValor(2);
		lista3.adicionaValor(3);
		lista3.adicionaValor(4);
		lista3.adicionaValor(5);
		lista3.adicionaValor(6);
		
		lista4.adicionaValor(7);
		lista4.adicionaValor(3);
		lista4.adicionaValor(9);
		lista4.adicionaValor(5);
		lista4.adicionaValor(10);
		
		System.out.println("Listas 1 e 2 são iguais? " + verificaIgualdade(lista1, lista2));
		System.out.println("Listas 3 e 4 são iguais? " + verificaIgualdade(lista3, lista4));
	}
	
	public static boolean verificaIgualdade(ListaLigada lista1, ListaLigada lista2) {
		int contadorDeIgualdades = 0;
		
		if (lista1.tamanho != lista2.tamanho) {
			return false;
		} else {
			for (int i = 0; i < lista1.tamanho; i++) {
				for (int j = 0; j < lista2.tamanho; j++) {
					if(lista1.pegarElementoNaPosicao(i).valor == lista2.pegarElementoNaPosicao(j).valor) {
						contadorDeIgualdades++;
						break;
					}
				}
			}
			if (contadorDeIgualdades != lista1.tamanho) {
				return false;
			} else {
				return true;
			}
		}
	}
}
