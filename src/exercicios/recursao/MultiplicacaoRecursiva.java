package exercicios.recursao;

import java.util.Scanner;

/*
 *	A multiplicação de dois números inteiros pode ser feita através de somas sucessivas. 
 *	Proponha um algoritmo recursivo Multip_Rec(n1,n2) que calcule a multiplicação de dois inteiros.
 */

public class MultiplicacaoRecursiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número n1: ");
		int n1 = sc.nextInt();
		System.out.print("Insira o número n2: ");
		int n2 = sc.nextInt();

		System.out.println("Multiplicação de n1 e n2: " + multipRec(n1, n2));
		
		sc.close();
	}
	
	static int multipRec(int n1, int n2) {
		if (n1 == 0 || n2 == 0) {
			return 0;
		} else if (n2 == 1) {
			return n1;
		} else {
			return n1 + multipRec(n1, n2 - 1);
		}
	}
}
