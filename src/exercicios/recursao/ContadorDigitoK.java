package exercicios.recursao;

import java.util.Scanner;

/*
 *	Escreva uma função recursiva que determine quantas vezes um dígito K ocorre 
 *	em um número natural N. Por exemplo, o dígito 2 ocorre 3 vezes em 762021192. 
 */

public class ContadorDigitoK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um número: ");
		int n = sc.nextInt();
		System.out.print("Insira o dígito a ser verificado: ");
		int k = sc.nextInt();
		System.out.println("Quantidade verificada: " + verificaQtdK(n, k));

		sc.close();
	}
	
	static int verificaQtdK(int n, int k) {
		int qtdK = 0;
		if (n == 0) {
			return 0;
		} else if (k == n % 10) {
			qtdK++;
		}
		n = n / 10;
		return qtdK + verificaQtdK(n, k);
	}

}
