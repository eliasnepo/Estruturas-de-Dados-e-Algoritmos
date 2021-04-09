package exercicios.filas;

import estruturas_de_dados.filas.Fila;

public class MaiorMenorMedia {

	/*
	 * Considere uma lista contendo números inteiros. Escreva uma função que obtenha o maior, 
	 * o menor e a média aritmética dos seus elementos.
	 */
	
	public static void main(String[] args) {
		Fila fila1 = new Fila();
		fila1.enfileirar(Integer.toString(1));
		fila1.enfileirar(Integer.toString(2));
		fila1.enfileirar(Integer.toString(3));
		fila1.enfileirar(Integer.toString(4));
		
		obterMaiorMenorEMedia(fila1);
	}
	
	static void obterMaiorMenorEMedia(Fila fila) {
		String maior = fila.primeiro.valor;
		String menor = fila.primeiro.valor;
		double soma = 0;
		
		for (int i = 0; i < fila.tamanho; i++) {
			if(Integer.parseInt(fila.primeiro.valor) > Integer.parseInt(maior)) {
				maior = fila.primeiro.valor;
			}
			
			if(Integer.parseInt(fila.primeiro.valor) < Integer.parseInt(menor)) {
				menor = fila.primeiro.valor;
			}
			
			soma += Integer.parseInt(fila.primeiro.valor);
			fila.primeiro = fila.primeiro.proximo;
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Média: " + soma / fila.tamanho * 1.0);
	}
}
