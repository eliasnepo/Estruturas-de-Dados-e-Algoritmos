package exercicios.pilhas;

import estruturas_de_dados.pilhas.PilhaComListaLigada;

public class ExibeERemoveElementoAoTopo {

	/*
	 * Escreva uma função que receba uma pilha como argumento e retorne o valor armazenado em seu topo. 
	 * A função deve remover também esse elemento.
	 */
	public static void main(String[] args) {
		PilhaComListaLigada pilha1 = new PilhaComListaLigada();

		pilha1.empilhar("A");
		pilha1.empilhar("B");
		pilha1.empilhar("C");
		pilha1.empilhar("D");

		System.out.print("Pilha (do topo ao fundo):");
		pilha1.exibePilha();
		
		System.out.println("Elemento ao topo desta pilha: " + valorERemocaoDoTopo(pilha1));
		
		System.out.print("Pilha após remoção do topo (do topo ao fundo):");
		pilha1.exibePilha();
	}

	static String valorERemocaoDoTopo(PilhaComListaLigada pilha) {
		String valorDoTopo = pilha.topo.valor;
		pilha.desempilhar();
		return valorDoTopo;
	}
}
