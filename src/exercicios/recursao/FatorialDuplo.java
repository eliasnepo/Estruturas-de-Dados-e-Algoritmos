package exercicios.recursao;

import java.util.Scanner;

/*
 *	Fa�a uma fun��o recursiva que receba um n�mero inteiro positivo impar N e retorne o 
 *	fatorial duplo desse n�mero. O fatorial duplo � definido como o produto de todos os 
 *	n�meros naturais �mpares de 1 at� algum n�mero natural �mpar N. Assim, o fatorial duplo de 5 �:
 *	5!! = 1 * 3 * 5 = 15
 */

public class FatorialDuplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o n�mero: ");
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
