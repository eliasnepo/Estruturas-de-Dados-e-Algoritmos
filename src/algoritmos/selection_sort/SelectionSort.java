package algoritmos.selection_sort;

import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }
        return vetor;
    }

    public static void main(String[] args) {
        int[] numeros = {123, 12, 9, 1, 2, 6, 68, 82, 412, 4, 0};
        System.out.println("Vetor antes da ordenação:  " + Arrays.toString(numeros));
        System.out.println("Vetor depois da ordenação: " + Arrays.toString(selectionSort(numeros)));
    }
}
