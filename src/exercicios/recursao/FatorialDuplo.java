package exercicios.recursao;

import java.util.Scanner;

/*
 *	Faça uma função recursiva que receba um número inteiro positivo impar N e retorne o 
 *	fatorial duplo desse número. O fatorial duplo é definido como o produto de todos os 
 *	números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial duplo de 5 é:
 *	5!! = 1 * 3 * 5 = 15
 */

public class FatorialDuplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número: ");
		int n = sc.nextInt();
		System.out.println("Fatorial duplo de " + n + " = " + fatorialDuplo(n));
		
		sc.close();
	}
	
	public static int fatorialDuplo(int n) {
		if(n == 1) {
			return 1;
		}
		return n * fatorialDuplo(n - 2);
	}
}
