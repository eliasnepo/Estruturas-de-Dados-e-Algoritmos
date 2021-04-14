package exercicios.recursao;

import java.util.Scanner;

/*
 * 	Faça uma função recursiva que receba um número inteiro positivo par N e imprima 
 *  todos os números pares de 0 até N em ordem decrescente.
 */

public class ImprimirParesDecrescentes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número n: ");
		int n = sc.nextInt();
		
		ordemDecrescentePar(0, n);
		
		sc.close();
	}

	static void ordemDecrescentePar(int valorInicial, int n) {
		if (n % 2 != 0) {
			n -= 1;
		}
		if (valorInicial > n) {
			return;
		} else {
			System.out.print(n + " ");
			ordemDecrescentePar(valorInicial, n - 2);
		}
	}
}
