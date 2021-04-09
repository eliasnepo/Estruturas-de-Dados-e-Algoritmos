package exercicios.filas;

import estruturas_de_dados.filas.Fila;

public class IntercalarFilas {

	/*
	 * Escreva uma função para intercalar filas: a função recebe as duas filas e retorna a fila 
	 * com os elementos das duas filas intercalados conforme a ordem com que elas se dispõe na fila.
	 */
	
	public static void main(String[] args) {

		Fila fila1 = new Fila();
		fila1.enfileirar("1");
		fila1.enfileirar("3");
		fila1.enfileirar("5");
		fila1.enfileirar("7");

		Fila fila2 = new Fila();
		fila2.enfileirar("2");
		fila2.enfileirar("4");
		fila2.enfileirar("6");
		fila2.enfileirar("8");
		
		System.out.print("Fila 1:");
		fila1.exibeFila();
		System.out.print("Fila 2:");
		fila2.exibeFila();
		
		System.out.print("Filas intercaladas:");
		intercalarFilas(fila1, fila2);
	}
	
	static void intercalarFilas(Fila fila1, Fila fila2) {
		Fila fila3 = new Fila();
		for(int i = 0; i < fila1.tamanho; i++) {
			fila3.enfileirar(fila1.primeiro.valor);
			fila3.enfileirar(fila2.primeiro.valor);
			fila1.primeiro = fila1.primeiro.proximo;
			fila2.primeiro = fila2.primeiro.proximo;
		}
		fila3.exibeFila();
	}

}
