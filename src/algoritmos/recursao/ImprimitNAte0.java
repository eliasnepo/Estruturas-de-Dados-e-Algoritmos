package algoritmos.recursao;

import java.util.Scanner;

/*
 * 	Fa�a uma fun��o recursiva que receba um n�mero inteiro positivo N e imprima 
 * todos os n�meros naturais de 0 at� N em ordem decrescente.
 */

public class ImprimitNAte0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o n�mero n: ");
		int n = sc.nextInt();
		
		ordemDecrescente(0, n);
		
		sc.close();
	}
	
	static void ordemDecrescente(int valorInicial, int n) {
		if (valorInicial == n) {
			System.out.println(n);
		} else {
			System.out.print(n + " ");
			ordemDecrescente(valorInicial, n - 1);
		}
	}
}
