package exercicios.deque;

import estruturas_de_dados.filas.Deque;
import estruturas_de_dados.filas.NoDuplo;

public class ExibirAlunosPorOrdemEDirecao {

	/*
	 * Uma lista mantém nomes de 40 alunos por ordem de classificação no vestibular em um curso superior. 
	 * Supondo que esta lista está implementada na forma de um deque, construa um método exibe(pos inteiro, 
	 * ordem caractere) que escreve na tela os nomes de alunos a partir de pos, na ordem direta ou inversa 
	 * (‘d’ / ‘i’) indicado por ordem.
	 */
	
	public static void main(String[] args) {
		Deque deque = new Deque();
		deque.enfileirar("Rafael Souza");
		deque.enfileirar("Bruna Silva");
		deque.enfileirar("Marcos Santos");
		deque.enfileirar("Clóvis Pereira");
		deque.enfileirar("Elias Nepomuceno");
		deque.enfileirar("Ricardo Franco");
		deque.enfileirar("Andre Luiz");
		
		System.out.println("Imprimindo na ordem DIRETA a partir da POSICAO 2:");
		exibeListaDeAlunosAPartirDePosicao('d', 2, deque);
		System.out.println("----------------------------");
		System.out.println("Imprimindo na ordem INDIRETA a partir da POSICAO 4");
		exibeListaDeAlunosAPartirDePosicao('i', 4, deque);
	}
	
	static void exibeListaDeAlunosAPartirDePosicao(char ordem, int posicao, Deque deque) {
		if (ordem == 'd') {
			NoDuplo noDireto = new NoDuplo();
			noDireto = deque.primeiro;
			
			// Alcancar a posicao
			for (int i = 0; i < posicao; i++) {
				noDireto = noDireto.proximo;
			}
			
			// Imprimir o que é desejado
			while (noDireto != null) {
				System.out.println(noDireto.valor);
				noDireto = noDireto.proximo;
			}
			
		} else if (ordem == 'i') {
			NoDuplo noInverso = new NoDuplo();
			noInverso = deque.ultimo;
			
			//Alcancar a posicao
			for (int i = deque.tamanho - 1; i > posicao; i--) {
				noInverso = noInverso.anterior;
			}
			
			// Imprimir o que é desejado
			while (noInverso != null) {
				System.out.println(noInverso.valor);
				noInverso = noInverso.anterior;
			}
		}
	}

}
