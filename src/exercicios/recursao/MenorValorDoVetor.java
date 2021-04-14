package exercicios.recursao;

import java.util.Scanner;

/*
 *	 Crie um programa que contenha uma função recursiva para encontrar o menor elemento em um vetor. 
 */

public class MenorValorDoVetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número de elementos do vetor: ");
		int tamanho = sc.nextInt();
		int vetor[] = new int[tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Insira o valor da posição " + i + " do vetor: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("O menor valor do vetor é: " + menorValor(vetor, 0, vetor[0]));
		
		sc.close();
	}
	
	static int menorValor(int[] vetor, int posicao, int valorReferencia) {
		if (posicao == vetor.length) {
			return valorReferencia;
		}
		if (vetor[posicao] < valorReferencia ) {
			valorReferencia = vetor[posicao];
		}
		return menorValor(vetor, posicao + 1, valorReferencia);
	}
}