package exercicios.pilhas;

import estruturas_de_dados.pilhas.PilhaComListaLigada;

public class InverterCadaPalavraDaFrase {
	
	/*
	 * Escreva uma fun��o, usando uma Pilha, que inverte as letras de cada palavra de um texto 
	 * terminado por ponto (.) preservando a ordem das palavras. Por exemplo, 
	 * dado o texto: ESTE EXERC�CIO � MUITO F�CIL. A sa�da deve ser: ETSE OIC�CREXE � OTIUM LIC�F
	 */

	public static void main(String[] args) {
		String textoQualquer = "ESTE EXERC�CIO � MUITO F�CIL.";
		
		System.out.println("Texto da maneira normal: " + textoQualquer);
		inverteTexto(textoQualquer);
	}

	static void inverteTexto(String texto) {
		PilhaComListaLigada pilha = new PilhaComListaLigada();
		String textoInvertido = "";
		
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == ' ' || texto.charAt(i) == '.') {
				while(pilha.topo.proximo != null) {
					textoInvertido += pilha.topo.valor;
					pilha.desempilhar();
				}
				textoInvertido += pilha.fundo.valor;
				pilha.desempilhar();
				textoInvertido += texto.charAt(i);
				continue;
			}
			pilha.empilhar(Character.toString(texto.charAt(i)));
		}
		System.out.println("Texto invertido usando pilha: " + textoInvertido);
		
		pilha.exibePilha();
	}
}
