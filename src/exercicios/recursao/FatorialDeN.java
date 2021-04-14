package exercicios.recursao;

import java.util.Scanner;

/*
 * Faça uma função recursiva que calcule e retorne o fatorial de um número inteiro N.
 */

public class FatorialDeN {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número n: ");
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
