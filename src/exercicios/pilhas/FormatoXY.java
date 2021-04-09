package exercicios.pilhas;

import estruturas_de_dados.pilhas.PilhaComListaLigada;

public class FormatoXY {

	/*
	 * Considere uma pilha que armazene caracteres. Escreva uma função para determinar se uma string é da 
	 * forma XY, onde X é uma cadeia formada por caracteres arbitrários e Y é o reverso de X. Por exemplo, 
	 * se x = ABCD, então y = DCBA. Considere que x e y são duas strings distintas.
	 */
	
	public static void main(String[] args) {
		PilhaComListaLigada pilha1 = new PilhaComListaLigada();
		PilhaComListaLigada pilha2 = new PilhaComListaLigada();
		PilhaComListaLigada pilha3 = new PilhaComListaLigada();
		PilhaComListaLigada pilha4 = new PilhaComListaLigada();
		
		//PILHAS 1 E 2 TEM FORMATO XY
		pilha1.empilhar("A");
		pilha1.empilhar("B");
		pilha1.empilhar("C");
		pilha1.empilhar("D");
		
		pilha2.empilhar("D");
		pilha2.empilhar("C");
		pilha2.empilhar("B");
		pilha2.empilhar("A");
		
		pilha3.empilhar("Z");
		pilha3.empilhar("T");
		pilha3.empilhar("C");
		pilha3.empilhar("I");
		
		pilha4.empilhar("O");
		pilha4.empilhar("W");
		pilha4.empilhar("T");
		pilha4.empilhar("D");

		System.out.println("SOBRE AS PILHAS 1 E 2:");
		formaXY(pilha1, pilha2);
		System.out.println();
		
		System.out.println("SOBRE AS PILHAS 3 E 4:");
		formaXY(pilha3, pilha4);
	}
	
	static void formaXY(PilhaComListaLigada pilha1, PilhaComListaLigada pilha2) {
		String stringDaPilha1 = "";
		while(pilha1.topo.proximo != null) {
			stringDaPilha1 += pilha1.topo.valor;
			pilha1.desempilhar();
		}
		stringDaPilha1 += pilha1.fundo.valor;
		stringDaPilha1 = inverterString(stringDaPilha1);
		
		String stringDaPilha2 = "";
		while(pilha2.topo.proximo != null) {
			stringDaPilha2 += pilha2.topo.valor;
			pilha2.desempilhar();
		}
		stringDaPilha2 += pilha2.fundo.valor;
		
		System.out.println("As pilhas tem formato XY? " + stringDaPilha1.equals(stringDaPilha2));;
	}
	
	static String inverterString(String string1) {
		String stringInvertida = "";
		for (int i = string1.length() - 1; i >= 0; i--) {
			stringInvertida += string1.charAt(i);
		}
		return stringInvertida;
	}

}
