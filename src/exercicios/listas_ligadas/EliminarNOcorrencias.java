package exercicios.listas_ligadas;

import estruturas_de_dados.listas_ligadas.ListaLigada;

public class EliminarNOcorrencias {

	/*
	 * Exercício: Seja uma lista ligada dinâmica com elementos repetidos, implemente uma rotina para 
	 * eliminar todos as ocorrências de X da lista.
	 */
	
	public static void main(String[] args) {

		ListaLigada lista1 = new ListaLigada();
		
		lista1.adicionaValor(2);
		lista1.adicionaValor(3);
		lista1.adicionaValor(7);
		lista1.adicionaValor(10);
		lista1.adicionaValor(7);
		lista1.adicionaValor(14);
		
		System.out.print("Lista 1 antes de eliminar as ocorrências do número 7: " + lista1.exibeLista());
		eliminarXOcorrencias(7, lista1);
		System.out.println("Lista 1 depois de eliminar as ocorrências do número 7: " + lista1.exibeLista());
	}
	
	public static void eliminarXOcorrencias(int valor, ListaLigada lista) {
		while (lista.pegarElemento(valor) != null) {
			lista.removeValor(valor);
		}
	}
}
