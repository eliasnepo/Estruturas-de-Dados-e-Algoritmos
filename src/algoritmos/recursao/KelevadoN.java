package algoritmos.recursao;

import java.util.Scanner;

/*
 * 	Crie uma função recursiva que receba dois inteiros positivos k e n e calcule k^n.
 */

public class KelevadoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número k: ");
		int k = sc.nextInt();
		System.out.print("Insira o número n: ");
		int n = sc.nextInt();
		
		
		System.out.println("K elevado a N = " + kElevadoN(k, n));

		sc.close();
	}
	
	static int kElevadoN(int k, int n) {
		if(n == 1) {
			return k;
		}
		return k * kElevadoN(k, n - 1);
	}

}
