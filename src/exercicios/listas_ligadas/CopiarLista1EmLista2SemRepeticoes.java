package exercicios.listas_ligadas;

import estruturas_de_dados.listas_ligadas.ListaLigada;

public class CopiarLista1EmLista2SemRepeticoes {

	/*
	 * Exercício: Fazer uma função que copia uma lista ligada L1 em outra lista ligada L2, eliminando os elementos 
	 * repetidos.
	 */
	
	public static void main(String[] args) {

		ListaLigada lista1 = new ListaLigada();
		ListaLigada lista2 = new ListaLigada();
		
		lista1.adicionaValor(2);
		lista1.adicionaValor(3);
		lista1.adicionaValor(4);
		lista1.adicionaValor(5);
		lista1.adicionaValor(6);
		
		lista2.adicionaValor(2);
		lista2.adicionaValor(3);
		lista2.adicionaValor(9);
		lista2.adicionaValor(10);
		lista2.adicionaValor(11);
		
		System.out.print("Lista 1: " + lista1.exibeLista());
		System.out.print("Lista 2: " + lista2.exibeLista());
		copiaSemRepeticao(lista1, lista2);
	}
	
	// Resultado esperado: 2 3 9 10 11 4 5 6
	public static void copiaSemRepeticao(ListaLigada lista1, ListaLigada lista2) {
		for (int i = 0; i < lista1.tamanho; i++) {
			for (int j = 0; j < lista2.tamanho; j++) {
				if(lista1.pegarElementoNaPosicao(i).valor == lista2.pegarElementoNaPosicao(j).valor) {
					break;
				}
				else if(lista1.pegarElementoNaPosicao(i).valor != lista2.pegarElementoNaPosicao(j).valor && j == lista2.tamanho - 1) {
					lista2.adicionaValor(lista1.pegarElementoNaPosicao(i).valor);
				}
			}
		}
		System.out.println("Lista 2 após receber a lista 1 sem repetições: " + lista2.exibeLista());
	}

}
