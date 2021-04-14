package exercicios.recursao;

import java.util.Scanner;

/*
 *	 Crie um programa que contenha uma fun��o recursiva para encontrar o menor elemento em um vetor. 
 */

public class MenorValorDoVetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o n�mero de elementos do vetor: ");
		int tamanho = sc.nextInt();
		int vetor[] = new int[tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Insira o valor da posi��o " + i + " do vetor: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("O menor valor do vetor �: " + menorValor(vetor, 0, vetor[0]));
		
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