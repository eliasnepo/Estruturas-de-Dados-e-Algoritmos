package exercicios.filas;

import estruturas_de_dados.filas.Fila;

public class InverterFile {

	/*
	 * Escreva uma função que inverta a ordem dos elementos da fila.
	 */
	
	public static void main(String[] args) {
		Fila fila1 = new Fila();
		fila1.enfileirar("1");
		fila1.enfileirar("2");
		fila1.enfileirar("3");
		fila1.enfileirar("4");
		fila1.enfileirar("5");
		fila1.enfileirar("6");
		
		System.out.print("Fila inicial:");
		fila1.exibeFila();
		
		inverterFila(fila1);
	}

	static void inverterFila(Fila fila) {
		int tamanhoDaFila = fila.tamanho - 1;
		int[] numeros = new int[tamanhoDaFila];
		for (int i = 0; i < tamanhoDaFila; i++) {
			numeros[i] = Integer.parseInt(fila.olharPrimeiroDaFila());
			fila.desenfileirar();
		}
		for (int i = tamanhoDaFila - 1; i >= 0; i--) {
			fila.enfileirar(Integer.toString(numeros[i]));
		}
		System.out.print("Fila invertida:");
		fila.exibeFila();
	}
}
