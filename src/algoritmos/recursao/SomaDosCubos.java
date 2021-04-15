package algoritmos.recursao;
import java.util.Scanner;

/*
 *	Escreva uma função recursiva que calcule a soma dos primeiros n cubos: S(n) = 1^3 + 2^3 + ::: + n^3
 */

public class SomaDosCubos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o número n: ");
		int n = sc.nextInt();
		
		System.out.println("Soma de números ao cubo de " + n + ": " + somaNumerosAoCubo(n));
		sc.close();
	}
	
	static int somaNumerosAoCubo(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (int) (Math.pow(n, 3) + somaNumerosAoCubo(n - 1)); 
		}
	}

}
