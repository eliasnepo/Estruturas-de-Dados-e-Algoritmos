package algoritmos.recursao;

import java.util.Scanner;

/*
 *	Escreva uma função recursiva ImprimeSerie(i,j,k). Esta função imprime na tela a 
 *	série de valores do intervalo [i,j], com incremento k. 
 */

public class ImprimeSerie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro termo do intervalo: ");
		int i = sc.nextInt();
		System.out.print("Último termo do intervalo: ");
		int j = sc.nextInt();
		System.out.print("Incremento: ");
		int k = sc.nextInt();
		
		System.out.print("Série de intervalo [" + i + ", " + j + "] e incremento " + k + ": ");
		imprimeSerie(i, j, k);
		
		sc.close();
	}
	
	static void imprimeSerie(int i, int j, int k) {
		if((i + k) > j) {
			System.out.print(i);
			return;
		}
		System.out.print(i + " ");
		imprimeSerie(i + k, j, k);
	}
}
