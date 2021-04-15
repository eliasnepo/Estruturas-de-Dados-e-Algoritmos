package algoritmos.recursao;

import java.util.Scanner;

/*
 *	Faça uma função recursiva que permita inverter um número inteiro N. Ex.: 123 - 321. 
 */

public class InverterNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int n = sc.nextInt();
		System.out.print("Número invertido: ");
		inverterNumero(n);
		
		sc.close();
	}
	
	static void inverterNumero(int n) {
		if (n == 0) {
			return;
		} else {
			System.out.printf("%d", n % 10);
			n = n / 10;
			inverterNumero(n);
		}
	}
}
