package algoritmos.recursao;

import java.util.Scanner;

/*
 * Faça uma função recursiva que calcule e retorne o N-ésimo termo da sequência Fibonacci. 
 * Alguns números dessa sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 */

public class NesimoTermoFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número n: ");
		int n = sc.nextInt();

		System.out.println("N-ésimo termo da sequência de Fibonacci: " + sequenciaFibonacci(n));
		
		sc.close();
	}
	
	static int sequenciaFibonacci(int n) {
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return 0 + sequenciaFibonacci(n - 2) + sequenciaFibonacci(n -1);
		}
	}

}
