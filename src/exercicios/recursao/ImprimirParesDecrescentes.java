package exercicios.recursao;

import java.util.Scanner;

/*
 * 	Fa�a uma fun��o recursiva que receba um n�mero inteiro positivo par N e imprima 
 *  todos os n�meros pares de 0 at� N em ordem decrescente.
 */

public class ImprimirParesDecrescentes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o n�mero n: ");
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
