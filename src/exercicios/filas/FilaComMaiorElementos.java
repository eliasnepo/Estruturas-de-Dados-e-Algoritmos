package exercicios.filas;

import java.util.LinkedList;
import java.util.Queue;

public class FilaComMaiorElementos {

	/*
	 * Escreva uma função para testar se uma fila F1 tem mais elementos do que uma fila F2.
	 */
	
	public static void main(String[] args) {

		Queue<Integer> fila1 = new LinkedList<>();
		fila1.add(1);
		fila1.add(2);
		fila1.add(3);
		fila1.add(4);

		Queue<Integer> fila2 = new LinkedList<>();
		fila2.add(1);
		fila2.add(2);
		fila2.add(3);
		fila2.add(4);
		fila2.add(5);
		fila2.add(6);
		
		maiorFila(fila1, fila2);
	}
	
	static void maiorFila(Queue<Integer> fila1, Queue<Integer> fila2) {
		if (fila1.size() > fila2.size()) {
			System.out.println("A primeira fila é maior!");
		} else if (fila1.size() < fila2.size()) {
			System.out.println("A segunda fila é maior!");
		} else if (fila1.size() == fila2.size()) {
			System.out.println("As filas são iguais!");;
		}
	}

}
