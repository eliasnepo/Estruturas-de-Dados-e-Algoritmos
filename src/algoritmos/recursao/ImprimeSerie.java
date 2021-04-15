package algoritmos.recursao;

import java.util.Scanner;

/*
 *	Escreva uma fun��o recursiva ImprimeSerie(i,j,k). Esta fun��o imprime na tela a 
 *	s�rie de valores do intervalo [i,j], com incremento k. 
 */

public class ImprimeSerie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro termo do intervalo: ");
		int i = sc.nextInt();
		System.out.print("�ltimo termo do intervalo: ");
		int j = sc.nextInt();
		System.out.print("Incremento: ");
		int k = sc.nextInt();
		
		System.out.print("S�rie de intervalo [" + i + ", " + j + "] e incremento " + k + ": ");
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
