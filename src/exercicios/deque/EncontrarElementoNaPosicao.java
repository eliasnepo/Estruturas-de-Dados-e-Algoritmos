package exercicios.deque;

import estruturas_de_dados.filas.Deque;
import estruturas_de_dados.filas.NoDuplo;

public class EncontrarElementoNaPosicao {

	/*
	 * Escreva uma função que retorne o elemento que está na posição pos (1 a 'n') do deque. 
	 * A função deve receber pos como parâmetro e retornar o elemento localizado.
	 */
	
	public static void main(String[] args) {
		Deque deque = new Deque();
		deque.enfileirar("2");
		deque.enfileirar("3");
		deque.enfileirar("4");
		deque.adicionaAoInicioDaFila("1");
		
		System.out.print("Deque: ");
		deque.exibeDeque();
		System.out.println("Posicao 2: " + encontrarElementoPorPosicao(2, deque));
		System.out.println("Posicao 3: " + encontrarElementoPorPosicao(3, deque));
	}
	
	static String encontrarElementoPorPosicao(int posicao, Deque deque) {
		NoDuplo novoNo = new NoDuplo();
		novoNo = deque.primeiro;
		for (int i = 0; i < posicao; i++) {
			novoNo = novoNo.proximo;
		}
		return novoNo.valor;
	}
}
