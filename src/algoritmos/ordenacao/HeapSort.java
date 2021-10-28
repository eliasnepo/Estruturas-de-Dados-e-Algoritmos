package algoritmos.ordenacao;

public class HeapSort {
	static void heapSort(int[] vetor) throws InterruptedException {
		int tamanho = vetor.length;

		heapify(vetor, tamanho);

		int fim = tamanho - 1;
		while (fim > 0) {
			// Faz a troca da ra�z (que possui o valor m�ximo) com o �ltimo elemento do Heap
			int tmp = vetor[fim];
			vetor[fim] = vetor[0];
			vetor[0] = tmp;
			System.out.print("Trocando o primeiro com o �ltimo elemento do heap... ");
			HeapSort.mostraArray(vetor);
			
			// Coloca novamente em ordem de Heap
			trocaPosicao(vetor, 0, fim - 1);
			
			// Diminui o valor da vari�vel fim para que
			// o nosso valor que j� est� ordenado n�o seja mudado
			fim--;
		}
	}

	static void trocaPosicao(int[] vetor, int inicio, int fim) throws InterruptedException {
		// A vari�vel fim representa at� onde esta fun��o deve
		// fazer as trocas

		// A ra�z � onde o usu�rio definiu como o in�cio das nossas trocas
		int raiz = inicio;

		// Repete esse la�o enquanto a ra�z possuir pelo menos um filho
		while ((raiz * 2 + 1) <= fim) {

			// Acessa o filho a esquerda.
			int filho = raiz * 2 + 1;

			// Verifica se o �ltimo n� filho possui um n� irm�o
			// Se possuir irm�o, verifica se o valor do nosso n� filho
			// � menor do que o valor do n� irm�o
			// Caso todas as condi��es sejam verificadas, ent�o o n� irm�o �
			// colocado como o n� filho que iremos utilizar
			if (filho + 1 <= fim && vetor[filho] < vetor[filho + 1]) {
				filho = filho + 1;
			}

			// Verifica se o valor que est� na ra�z � menor do
			// que o valor que est� no n� filho.
			// Caso essa condi��o seja verificada, � feita a troca
			// entre esse valores e a n� filho agora se torna o n� raiz
			if (vetor[raiz] < vetor[filho]) { // out of max-heap order
				int tmp = vetor[raiz];
				vetor[raiz] = vetor[filho];
				vetor[filho] = tmp;
				raiz = filho;
			} else {
				return;
			}
			Thread.sleep(500L);
			System.out.print("Ordenando vetor: ");
			HeapSort.mostraArray(vetor);
		}
	}

	static void heapify(int[] vetor, int tamanho) throws InterruptedException {
		// O in�cio do Heap � sempre colocado como o index do �ltimo n� pai
		int inicio = (tamanho - 2) / 2; // binary heap
		while (inicio >= 0) {
			trocaPosicao(vetor, inicio, tamanho - 1);
			inicio--;
		}
		// Troca de posi��o at� chegar no �ndice 0 e obt�m nosso Heap.
		System.out.println("Heapify finalizado!");
	}

	static void mostraArray(int[] vetor) {
		for (int element : vetor) {
			System.out.print(" " + element);
		}
		System.out.println();
	}

	public static void main(String args[]) throws InterruptedException {
		int vetor[] = { 6, 5, 3, 1, 8, 7, 2, 4 };
		System.out.print("Vetor inicial:   ");
		HeapSort.mostraArray(vetor);
		System.out.println("-------------------------------");

		HeapSort.heapSort(vetor);
		System.out.println("-------------------------------");
		System.out.print("Vetor ordenado:	 ");
		HeapSort.mostraArray(vetor);
	}
}
