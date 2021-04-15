package algoritmos.recursao;

import java.util.Scanner;

/*
 * 	 Faça uma função recursiva que receba um número inteiro positivo par N e imprima 
 * 	 todos os números pares de 0 até N em ordem crescente.
 */

public class ImprimirParesCrescentes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número n: ");
		int n = sc.nextInt();
		
		ordemCrescentePar(0, n);
		
		sc.close();
	}

	static void ordemCrescentePar(int valorInicial, int n) {
		if (valorInicial > n) {
			return;
		} else {
			System.out.print(valorInicial + " ");
			ordemCrescentePar(valorInicial + 2, n);
		}
	}
}
