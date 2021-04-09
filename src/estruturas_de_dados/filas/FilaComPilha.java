package estruturas_de_dados.filas;

import java.util.Stack;

public class FilaComPilha {
	Stack<Integer> filaDePilha = new Stack<>();
	Stack<Integer> pilhaInvertida = new Stack<>();

	public void enfileirar(int valor) {
		if (this.filaDePilha.size() == 0) {
			this.filaDePilha.push(valor);
		} else {
			while (this.filaDePilha.size() != 0) {
				this.pilhaInvertida.push(this.filaDePilha.pop());
			}
			this.pilhaInvertida.push(valor);
			while (this.pilhaInvertida.size() != 0) {
				this.filaDePilha.push(this.pilhaInvertida.pop());
			}
		}
	}

	public Integer desenfileirar() {
		if (this.filaDePilha.size() > 0) {
			return this.filaDePilha.pop();
		} else {
			return null;
		}

	}

	public Integer olharTopoDaPilha() {
		if (this.filaDePilha.size() > 0) {
			return this.filaDePilha.get(this.filaDePilha.size() - 1);
		} else {
			return null;
		}
	}

	public boolean ehVazio() {
		return this.filaDePilha.size() == 0;
	}

	public static void main(String[] args) {
		FilaComPilha fila = new FilaComPilha();
		fila.enfileirar(10);
		fila.enfileirar(20);
		fila.enfileirar(30);
		System.out.println("Fila: " + fila.filaDePilha);
		System.out.println("Olhar elemento a retirar: " + fila.olharTopoDaPilha());
		System.out.println("Retirar elemento: " + fila.desenfileirar());
		System.out.println("Fila: " + fila.filaDePilha);
		System.out.println("Olhar elemento a retirar: " + fila.olharTopoDaPilha());
		System.out.println("Fila vazia? " + fila.ehVazio());
	}
}
