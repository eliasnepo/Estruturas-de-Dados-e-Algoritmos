package algoritmos.recursao;

import java.util.Scanner;

/*
 * 	Faça uma função recursiva que receba um número inteiro positivo N e imprima
 *  todos os números naturais de 0 até N em ordem crescente.
 */

public class ImprimirAteN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número n: ");
		int n = sc.nextInt();
		
		ordemCrescente(0, n);
		
		sc.close();
	}
	
	static void ordemCrescente(int valorInicial, int n) {
		if (valorInicial == n) {
			System.out.println(n);
		} else {
			System.out.print(valorInicial + " ");
			ordemCrescente(valorInicial + 1, n);
		}
	}
}
