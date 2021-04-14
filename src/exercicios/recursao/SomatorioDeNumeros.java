package exercicios.recursao;

import java.util.Scanner;

/*
 * Crie uma fun��o recursiva que receba um n�mero inteiro positivo N e calcule o somat�rio dos 
 * n�meros de 1 a N
 */

public class SomatorioDeNumeros {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o n�mero n: ");
		int n = sc.nextInt();
		
		System.out.println("Somat�rio de 1 at� " + n + " = " + somatorioDeNumeros(n));
		
		sc.close();
	}
	
	static int somatorioDeNumeros(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + somatorioDeNumeros(n - 1);
		}
	}
}
