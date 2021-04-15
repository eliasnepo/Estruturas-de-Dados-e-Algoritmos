package algoritmos.recursao;

import java.util.Scanner;

/*
 *	Escreva uma função recursiva SomaSerie(i,j,k). Esta função devolve a soma da série de
 *	valores do intervalo [i,j], com incremento k. 
 */

public class SomarSerie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro termo do intervalo: ");
		int i = sc.nextInt();
		System.out.print("Último termo do intervalo: ");
		int j = sc.nextInt();
		System.out.print("Incremento: ");
		int k = sc.nextInt();
		
		System.out.println("Soma da série de intervalo [" + i + ", " + j + "] e incremento " + k + ": " + somaSerie(i, j, k));
		
		sc.close();
	}
	
	static int somaSerie(int i, int j, int k) {
		if((i + k) > j) {
			return i;
		}
		return i + somaSerie(i + k, j, k);
	}
}