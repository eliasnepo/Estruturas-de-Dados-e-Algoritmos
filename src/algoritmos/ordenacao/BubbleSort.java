package algoritmos.ordenacao;

import java.util.Arrays;

public class BubbleSort {
    static int[] bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length-1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        return vetor;
    }

    public static void main(String[] args) {
        int[] numeros = {123, 12, 9, 1, 2, 6, 68, 82, 412, 4, 0};
        System.out.println("Vetor antes da ordenação:  " + Arrays.toString(numeros));
        System.out.println("Vetor depois da ordenação: " + Arrays.toString(bubbleSort(numeros)));
    }
}
