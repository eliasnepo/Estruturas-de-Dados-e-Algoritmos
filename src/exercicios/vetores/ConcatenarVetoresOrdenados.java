package exercicios.vetores;

import java.util.Arrays;

/* 
 * 
 * DADOS 2 VETORES ORDENADOS, CONCATENAR OS VETORES E MANTER A ORDEM.
 * ENTRADA: [0, 2, 4, 5] | [1, 6]
 * SAIDA: [0, 1, 2, 4, 5, 6]
 * 
 * */

public class ConcatenarVetoresOrdenados {

	static String concatenarVetores(int[] vetor1, int[] vetor2) {
		int[] vetorFinal = new int[vetor1.length + vetor2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < vetor1.length && j < vetor2.length) {
			if(vetor1[i] < vetor2[j]) {
				vetorFinal[k] = vetor1[i];
				i++;
			} else {
				vetorFinal[k] = vetor2[j];
				j++;
			}
			k++;
		}
		
		while (i < vetor1.length) {
            vetorFinal[k] = vetor1[i];
            i++;
            k++;
        }
		
        while (j < vetor2.length) {
            vetorFinal[k] = vetor2[j];
            j++;
            k++;
        }
        
        return Arrays.toString(vetorFinal);
	}
	
	public static void main(String[] args) {
		int[] vetor1 = new int[4];
		vetor1[0] = 0;
		vetor1[1] = 2;
		vetor1[2] = 4;
		vetor1[3] = 5;
		
		int[] vetor2 = new int[2];
		vetor2[0] = 1;
		vetor2[1] = 6;
		
		System.out.println("Vetor final: " + concatenarVetores(vetor1, vetor2));
	}
}
