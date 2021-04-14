package exercicios.recursao;

import java.util.Scanner;

/*
 *	Faça uma função recursiva que receba um número N e retorne o N-ésimo termo 
 *	da sequência de tetranacci. Os números tetranacci iniciam com quatro termos 
 *	pré-determinados e a partir daí todos os demais números são obtidos pela soma 
 *	dos quatro números anteriores. Os primeiros números tetranacci são: 0, 0, 0, 1, 1, 2, 4, 8, 15, 29, 56, 108, 208...
 */

public class Tetranacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o termo da tetranacci: ");
		int n = sc.nextInt();
		System.out.println("Termo " + n + " = " + tetranacci(n));
		
		sc.close();
	}
	
	public static int tetranacci(int n) {
		if(n == 1 || n == 2 || n == 3) {
			return 0;
		} else if(n == 4) {
			return 1;
		} 
			return 0 + tetranacci(n - 1) + tetranacci(n - 2) + tetranacci(n - 3) + tetranacci(n - 4);
	}
}
