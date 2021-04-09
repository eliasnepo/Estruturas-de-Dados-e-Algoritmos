package estruturas_de_dados.listas_ligadas;

import java.util.Arrays;

public class ListaDuplamenteLigada {
	public NoDuplo primeiro;
	public NoDuplo ultimo;
	public int tamanho;

	public ListaDuplamenteLigada(int valor) {
		primeiro = new NoDuplo(valor);
		ultimo = primeiro;
		tamanho = 1;
	}

	public void adicionaValor(int valor) {
		NoDuplo novoNo = new NoDuplo(valor);
		novoNo.anterior = ultimo;
		ultimo.proximo = novoNo;
		ultimo = novoNo;
		tamanho++;
	}

	public void adicionaValorAoInicio(int valor) {
		NoDuplo novoNo = new NoDuplo(valor);
		primeiro.anterior = novoNo;
		novoNo.proximo = primeiro;
		primeiro = novoNo;
		tamanho++;
	}

	public void adicionaValorNaPosicao(int index, int value) {
		if (index < 0 || index > tamanho) {
			System.err.println("Posição fora do tamanho da lista! Tamanho: " + tamanho);
		} else if (index == 0) {
			adicionaValorAoInicio(value);
		} else if (index == tamanho) {
			adicionaValor(value);
		} else {
			NoDuplo atual = primeiro;
			for (int i = 0; i < index - 1; i++) {
				atual = atual.proximo;
			}
			NoDuplo novoNo = new NoDuplo(value);
			novoNo.proximo = atual.proximo;
			atual.proximo = novoNo;
			novoNo.anterior = atual;
			novoNo.proximo.anterior = novoNo;
			tamanho++;
		}
	}

	public void removeValor(int index) {
		if (index < 0 || index > tamanho) {
			System.err.println("Posição fora do tamanho da lista! Tamanho: " + tamanho);
		} else if (index == 0) {
			primeiro = this.primeiro.proximo;
			this.primeiro.anterior = null;
			tamanho--;
		} else {
			NoDuplo atual = primeiro;
			int i;
			for (i = 0; i < index - 1; i++) {
				atual = atual.proximo;
			}
			atual.proximo = atual.proximo.proximo;
			tamanho--;
			if (i == tamanho - 1) {
				ultimo = atual;
			} else {
				atual.proximo.anterior = atual;
			}
		}
	}

	public int[] exibeLista() {
		int[] lista = new int[tamanho];
		NoDuplo atual = this.primeiro;
		int i = 0;
		while (atual != null) {
			lista[i] = atual.valor;
			atual = atual.proximo;
			i++;
		}
		return lista;
	}

	public static void main(String[] args) {
		ListaDuplamenteLigada listaDuplamenteLigada = new ListaDuplamenteLigada(3);
		listaDuplamenteLigada.adicionaValor(4);
		listaDuplamenteLigada.adicionaValor(5);
		listaDuplamenteLigada.adicionaValorAoInicio(2);
		listaDuplamenteLigada.adicionaValorAoInicio(1);
		System.out.println(Arrays.toString(listaDuplamenteLigada.exibeLista()));
		listaDuplamenteLigada.adicionaValorNaPosicao(2, 200);
		System.out.println(Arrays.toString(listaDuplamenteLigada.exibeLista()));
	}
}
