package estruturas_de_dados.arvores;

import java.util.ArrayList;

public class ArvoreAVL {
	class No {
		int chave, altura;
		No esquerda, direita;

		No(int d) {
			chave = d;
			altura = 1;
		}
	}

	No raiz;

	int altura(No no) {
		if (no == null) {
			return 0;
		}
		return no.altura;
	}

	int max(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	No rotacionaDireita(No y) {
		No x = y.esquerda;
		No T2 = x.direita;

		x.direita = y;
		y.esquerda = T2;

		y.altura = max(altura(y.esquerda), altura(y.direita)) + 1;
		x.altura = max(altura(x.esquerda), altura(x.direita)) + 1;

		return x;
	}

	No rotacionaEsquerda(No x) {
		No y = x.direita;
		No T2 = y.esquerda;

		y.esquerda = x;
		x.direita = T2;

		x.altura = max(altura(x.esquerda), altura(x.direita)) + 1;
		y.altura = max(altura(y.esquerda), altura(y.direita)) + 1;

		return y;
	}

	int getBalance(No no) {
		if (no == null) {
			return 0;
		}
		return altura(no.esquerda) - altura(no.direita);
	}

	No inserir(No no, int chave) {

		if (no == null) {
			return (new No(chave));
		}

		if (chave < no.chave) {
			no.esquerda = inserir(no.esquerda, chave);
		} else if (chave > no.chave) {
			no.direita = inserir(no.direita, chave);
		} else {
			return no;
		}

		no.altura = 1 + max(altura(no.esquerda), altura(no.direita));

		int balance = getBalance(no);

		// esquerda esquerda
		if (balance > 1 && chave < no.esquerda.chave)
			return rotacionaDireita(no);

		// direita direita
		if (balance < -1 && chave > no.direita.chave)
			return rotacionaEsquerda(no);

		// esquerda direita
		if (balance > 1 && chave > no.esquerda.chave) {
			no.esquerda = rotacionaEsquerda(no.esquerda);
			return rotacionaDireita(no);
		}

		// direita esquerda
		if (balance < -1 && chave < no.direita.chave) {
			no.direita = rotacionaDireita(no.direita);
			return rotacionaEsquerda(no);
		}

		return no;
	}

	void preOrder(No node) {
		if (node != null) {
			System.out.print(node.chave + " ");
			preOrder(node.esquerda);
			preOrder(node.direita);
		}
	}

	ArrayList<Integer> buscaLargura(ArvoreAVL arvore) {
		No atual = arvore.raiz;
		ArrayList<Integer> resultado = new ArrayList<>();
		ArrayList<No> fila = new ArrayList<>();
		fila.add(atual);

		while (fila.size() > 0) {
			atual = fila.remove(0);
			resultado.add(atual.chave);

			if (atual.esquerda != null) {
				fila.add(atual.esquerda);
			}
			if (atual.direita != null) {
				fila.add(atual.direita);
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		ArvoreAVL caso1 = new ArvoreAVL();

		caso1.raiz = caso1.inserir(caso1.raiz, 8);
		caso1.raiz = caso1.inserir(caso1.raiz, 4);
		caso1.raiz = caso1.inserir(caso1.raiz, 10);
		caso1.raiz = caso1.inserir(caso1.raiz, 9);
		caso1.raiz = caso1.inserir(caso1.raiz, 15);
		caso1.raiz = caso1.inserir(caso1.raiz, 12);

		System.out.print("Pre-Order caso 1: ");
		caso1.preOrder(caso1.raiz);

		System.out.println();
		System.out.println("Busca por largura caso 1: " + caso1.buscaLargura(caso1));

		System.out.println();

		ArvoreAVL caso2 = new ArvoreAVL();

		caso2.raiz = caso2.inserir(caso2.raiz, 8);
		caso2.raiz = caso2.inserir(caso2.raiz, 4);
		caso2.raiz = caso2.inserir(caso2.raiz, 10);
		caso2.raiz = caso2.inserir(caso2.raiz, 2);
		caso2.raiz = caso2.inserir(caso2.raiz, 6);
		caso2.raiz = caso2.inserir(caso2.raiz, 5);

		System.out.print("Pre-Order caso 2: ");
		caso2.preOrder(caso2.raiz);

		System.out.println();
		System.out.println("Busca por largura caso 2: " + caso2.buscaLargura(caso2));
	}
}
