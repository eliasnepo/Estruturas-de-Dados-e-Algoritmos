package exercicios.tabela_de_dispersao;

import java.util.HashSet;

public class PrimeiroElementoRecorrente {
	
	/*
	 * Exercício do Google: Dado um vetor, pegar o primeiro elemento recorrente.
	 * Exemplo: [2,6,6,2,3] -> primeiro elemento recorrente: 2
	 * Exemplo2:[2,5,2,5,1] -> primeiro elemento recorrente: 5
	 */
	
    static Integer primeiroElementoRecorrente(int[] vetor) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int elemento : vetor) {
            if (hashSet.contains(elemento)) {
                return elemento;
            } else {
                hashSet.add(elemento);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] vetor1 = {2, 6, 6, 2, 3};
        System.out.println(primeiroElementoRecorrente(vetor1)); // Deve retornar 6
        int[] vetor2 = {2, 5, 2, 5, 1};
        System.out.println(primeiroElementoRecorrente(vetor2)); // Deve retornar 2
    }
}
