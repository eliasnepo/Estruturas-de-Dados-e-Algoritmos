package algoritmos.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
	static ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(123, 12, 9, 1, 2, 6, 68, 82, 412, 4, 0));

	static ArrayList<Integer> insertionSort(ArrayList<Integer> vetor) {
		for (int i = 0; i < vetor.size(); i++) {
			if (vetor.get(i) <= vetor.get(0)) { // Se o numero for menor que o primeiro numero do vetor, mover para o iniocio.
				vetor.add(0, vetor.remove(i));
			} else {
				if (vetor.get(i) < vetor.get(i - 1)) { // Senao, verifica se o elemento na posição é menor que o elemento anterior
					for (int j = 1; j < i; j++) {
						if (vetor.get(i) < vetor.get(j)) {
							vetor.add(j, vetor.remove(i));
							break; // Termina o loop depois de mover o elemento
						}
					}
				}
			}

		}
		return vetor;
	}

	public static void main(String[] args) {
		System.out.println("Vetor antes da ordenação:  " + numeros.toString());
		System.out.println("Vetor depois da ordenação: " + insertionSort(numeros));
	}
}
