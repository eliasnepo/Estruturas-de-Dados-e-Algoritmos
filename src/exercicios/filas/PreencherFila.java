package exercicios.filas;

import estruturas_de_dados.filas.Fila;

public class PreencherFila {

	/*
	 * Escreva uma função que receba três filas, duas já preenchidas em ordem crescente e 
	 * preencha a última com os valores das duas primeiras em ordem crescente
	 */
	
	public static void main(String[] args) {

		Fila fila1 = new Fila();
		fila1.enfileirar("1");
		fila1.enfileirar("5");
		fila1.enfileirar("9");
		fila1.enfileirar("14");

		Fila fila2 = new Fila();
		fila2.enfileirar("6");
		fila2.enfileirar("13");
		fila2.enfileirar("15");
		fila2.enfileirar("16");

		Fila fila3 = new Fila();
		
		System.out.print("Fila 1:");
		fila1.exibeFila();
		System.out.print("Fila 2:");
		fila2.exibeFila();
		
		juntarFilasOrdemCrescente(fila1, fila2, fila3);
	}

	static void juntarFilasOrdemCrescente(Fila fila1, Fila fila2, Fila fila3) {
		while (!fila1.ehVazio() && !fila2.ehVazio()) {
			if (Integer.parseInt(fila1.primeiro.valor) <= Integer.parseInt(fila2.primeiro.valor)) {
				fila3.enfileirar(fila1.primeiro.valor);
				fila1.desenfileirar();
			} else {
				fila3.enfileirar(fila2.primeiro.valor);
				fila2.desenfileirar();
			}
		}
		
		while (!fila1.ehVazio()) {
			fila3.enfileirar(fila1.primeiro.valor);
			fila1.desenfileirar();
		}
		
		while (!fila2.ehVazio()) {
			fila3.enfileirar(fila2.primeiro.valor);
			fila2.desenfileirar();
		}
		System.out.print("Filas juntas em ordem crescente:");
		fila3.exibeFila();
	}

}
