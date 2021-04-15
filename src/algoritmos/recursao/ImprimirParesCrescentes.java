package algoritmos.recursao;

import java.util.Scanner;

/*
 * 	 Fa�a uma fun��o recursiva que receba um n�mero inteiro positivo par N e imprima 
 * 	 todos os n�meros pares de 0 at� N em ordem crescente.
 */

public class ImprimirParesCrescentes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o n�mero n: ");
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
