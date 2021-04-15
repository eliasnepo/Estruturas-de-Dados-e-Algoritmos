package algoritmos.ordenacao;

public class QuickSort {
	
    static void quickSort(int[] vetor, int baixo, int cima) {
        if (baixo < cima) {
            int pIndex = partition(vetor, baixo, cima);

            quickSort(vetor, baixo, pIndex - 1);
            quickSort(vetor, pIndex + 1, cima);
        }
    }

    static int partition(int[] vetor, int baixo, int cima) {
        int pivo = vetor[cima];
        int i = (baixo - 1);

        for (int j = baixo; j < cima; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }

        int aux = vetor[i + 1];
        vetor[i + 1] = vetor[cima];
        vetor[cima] = aux;
        return i + 1;
    }


    static void exibeVetor(int[] vetor) {
        for (int valor : vetor) System.out.print(valor + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = {123, 12, 9, 1, 2, 6, 68, 82, 412, 4, 0};
        quickSort(numeros, 0, numeros.length - 1);
        exibeVetor(numeros);
    }

}
