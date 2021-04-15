package algoritmos.recursao;

import java.util.Scanner;

/*
 *	Fa�a uma fun��o recursiva que permita inverter um n�mero inteiro N. Ex.: 123 - 321. 
 */

public class InverterNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		int n = sc.nextInt();
		System.out.print("N�mero invertido: ");
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
