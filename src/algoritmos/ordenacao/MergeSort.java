package algoritmos.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    static List<Integer> mergeSort(List<Integer> vetor) {
        if (vetor.size() == 1) {
            return vetor;
        }

        List<Integer> esquerda = vetor.subList(0, vetor.size() / 2);
        List<Integer> direita = vetor.subList(vetor.size() / 2, vetor.size());

        return merge(mergeSort(esquerda), mergeSort(direita));
    }

    static List<Integer> merge(List<Integer> esquerda, List<Integer> direita) {
        ArrayList<Integer> resultado = new ArrayList<>();
        int indexEsquerda = 0;
        int indexDireita = 0;

        while (indexEsquerda < esquerda.size() && indexDireita < direita.size()) {
            if (esquerda.get(indexEsquerda) < direita.get(indexDireita)) {
                resultado.add(esquerda.get(indexEsquerda));
                indexEsquerda++;
            } else {
                resultado.add(direita.get(indexDireita));
                indexDireita++;
            }
        }
        List<Integer> leftRemaining = esquerda.subList(indexEsquerda, esquerda.size());
        List<Integer> rightRemaining = direita.subList(indexDireita, direita.size());

        resultado.addAll(leftRemaining);
        resultado.addAll(rightRemaining);

        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(123, 12, 9, 1, 2, 6, 68, 82, 412, 4, 0));
        System.out.println(mergeSort(numeros));
    }
}
