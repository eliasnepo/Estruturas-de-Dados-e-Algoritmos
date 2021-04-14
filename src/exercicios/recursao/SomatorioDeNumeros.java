package exercicios.recursao;

import java.util.Scanner;

/*
 * Crie uma função recursiva que receba um número inteiro positivo N e calcule o somatório dos 
 * números de 1 a N
 */

public class SomatorioDeNumeros {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número n: ");
		int n = sc.nextInt();
		
		System.out.println("Somatório de 1 até " + n + " = " + somatorioDeNumeros(n));
		
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
