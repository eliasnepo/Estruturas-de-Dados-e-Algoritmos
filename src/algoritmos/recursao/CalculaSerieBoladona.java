package algoritmos.recursao;

import java.util.Scanner;

/*
 *	Faça uma função recursiva que calcule o valor da série S descrita a seguir para 
 *	um valor n > 0 a ser fornecido como parâmetro para a mesma. 
 *	Série:
 *	S = 2 + (5/2) + (10/3) + ... + ((1+n^2)/n)
 */

public class CalculaSerieBoladona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número de termos: ");
		int n = sc.nextInt();
		System.out.printf("Somatório da série de " + n + " termos: %.2f", valorDaSerie(n));
		
		sc.close();
	}
	
	static double valorDaSerie(int n) {
		if(n == 1) {
			return 2;
		} else {
			return ((1 + (n * n * 1.0)) / n) + valorDaSerie(n - 1);
		}
	}
}
