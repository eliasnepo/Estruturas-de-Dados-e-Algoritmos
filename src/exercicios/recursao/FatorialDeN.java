package exercicios.recursao;

import java.util.Scanner;

/*
 * Fa�a uma fun��o recursiva que calcule e retorne o fatorial de um n�mero inteiro N.
 */

public class FatorialDeN {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o n�mero n: ");
		int n = sc.nextInt();
		
		System.out.println("Fatorial de " + n + ": " + calculaFatorial(n));
		
		sc.close();
	}
	
	static int calculaFatorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * calculaFatorial(n - 1);
		}
	}
}
