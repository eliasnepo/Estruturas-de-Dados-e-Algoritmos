package exercicios.pilhas;

import estruturas_de_dados.pilhas.PilhaComListaLigada;

public class InverterPilha {
	
	/*
	 * Escreva uma função para inverter a posição dos elementos de uma pilha P
	 */
	
	public static void main(String[] args) {
		PilhaComListaLigada pilha1 = new PilhaComListaLigada();
		
		pilha1.empilhar("A");
		pilha1.empilhar("B");
		pilha1.empilhar("C");
		pilha1.empilhar("D");
		
		System.out.println("Pilha com elementos na ordem normal (do topo ao fundo):");
		pilha1.exibePilha();
		
		inverterElementos(pilha1);
	}
	
	static void inverterElementos(PilhaComListaLigada pilha) {
		PilhaComListaLigada pilhaComElementosInvertidos = new PilhaComListaLigada();
		while(pilha.topo.proximo != null) {
			pilhaComElementosInvertidos.empilhar(pilha.topo.valor);;
			pilha.desempilhar();
		}
		pilhaComElementosInvertidos.empilhar(pilha.fundo.valor);
		System.out.println("Pilha com elementos invertidos (do topo ao fundo):");
		pilhaComElementosInvertidos.exibePilha();
	}
}
