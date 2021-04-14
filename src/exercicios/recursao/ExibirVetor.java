package exercicios.recursao;

import java.util.Scanner;

/*
 * 	Escreva uma função recursiva que exibe todos os elementos em um array de inteiros,
 *  separados por espaço.
 */

public class ExibirVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o tamanho do vetor: ");
		int tamanho = sc.nextInt();
		int vetor[] = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			System.out.print("Insira o valor da posição " + i + " do vetor: ");
			int valor = sc.nextInt();
			vetor[i] = valor;
		}
		
		System.out.print("Exibindo vetor com função recursiva: ");
		exibeArray(0, vetor);
		
		sc.close();
	}
	
	static void exibeArray(int n, int[] vetor) {
		if (n >= vetor.length) {
			return;
		}
		System.out.print(vetor[n] + " ");
		exibeArray(n + 1, vetor);
	}
}
