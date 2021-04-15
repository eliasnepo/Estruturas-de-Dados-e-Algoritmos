package algoritmos.recursao;

import java.util.Scanner;

/*
 *	Fa�a uma fun��o recursiva que calcule o valor da s�rie S descrita a seguir para 
 *	um valor n > 0 a ser fornecido como par�metro para a mesma. 
 *	S�rie:
 *	S = 2 + (5/2) + (10/3) + ... + ((1+n^2)/n)
 */

public class CalculaSerieBoladona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o n�mero de termos: ");
		int n = sc.nextInt();
		System.out.printf("Somat�rio da s�rie de " + n + " termos: %.2f", valorDaSerie(n));
		
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
