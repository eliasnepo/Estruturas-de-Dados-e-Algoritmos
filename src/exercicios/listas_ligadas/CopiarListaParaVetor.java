package exercicios.listas_ligadas;

import estruturas_de_dados.listas_ligadas.ListaLigada;

public class CopiarListaParaVetor {

	/*
	 * Exercício: Escreva uma função que copie uma lista ligada para um vetor.
	 */
	
	public static void main(String[] args) {

		ListaLigada listaLigada = new ListaLigada();
		
		listaLigada.adicionaValor(2);
		listaLigada.adicionaValor(3);
		listaLigada.adicionaValor(7);
		listaLigada.adicionaValor(10);
		listaLigada.adicionaValor(14);
		
		System.out.println("Lista: " + listaLigada.exibeLista());
		
		int[] vetor = copiarListaParaVetor(listaLigada);
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor na posição " + i + ": " + vetor[i]);
		}
	}

	public static int[] copiarListaParaVetor(ListaLigada lista) {
		int vetorDaLista[] = new int[lista.tamanho];
		for (int i = 0; i < lista.tamanho; i++) {
			vetorDaLista[i] = lista.pegarElementoNaPosicao(i).valor;
		}
		return vetorDaLista;
	}
}
