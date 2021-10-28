package algoritmos.ordenacao;

public class HeapSort {
	static void heapSort(int[] vetor) throws InterruptedException {
		int tamanho = vetor.length;

		heapify(vetor, tamanho);

		int fim = tamanho - 1;
		while (fim > 0) {
			// Faz a troca da raíz (que possui o valor máximo) com o último elemento do Heap
			int tmp = vetor[fim];
			vetor[fim] = vetor[0];
			vetor[0] = tmp;
			System.out.print("Trocando o primeiro com o último elemento do heap... ");
			HeapSort.mostraArray(vetor);
			
			// Coloca novamente em ordem de Heap
			trocaPosicao(vetor, 0, fim - 1);
			
			// Diminui o valor da variável fim para que
			// o nosso valor que já está ordenado não seja mudado
			fim--;
		}
	}

	static void trocaPosicao(int[] vetor, int inicio, int fim) throws InterruptedException {
		// A variável fim representa até onde esta função deve
		// fazer as trocas

		// A raíz é onde o usuário definiu como o início das nossas trocas
		int raiz = inicio;

		// Repete esse laço enquanto a raíz possuir pelo menos um filho
		while ((raiz * 2 + 1) <= fim) {

			// Acessa o filho a esquerda.
			int filho = raiz * 2 + 1;

			// Verifica se o último nó filho possui um nó irmão
			// Se possuir irmão, verifica se o valor do nosso nó filho
			// é menor do que o valor do nó irmão
			// Caso todas as condições sejam verificadas, então o nó irmão é
			// colocado como o nó filho que iremos utilizar
			if (filho + 1 <= fim && vetor[filho] < vetor[filho + 1]) {
				filho = filho + 1;
			}

			// Verifica se o valor que está na raíz é menor do
			// que o valor que está no nó filho.
			// Caso essa condição seja verificada, é feita a troca
			// entre esse valores e a nó filho agora se torna o nó raiz
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
		// O início do Heap é sempre colocado como o index do último nó pai
		int inicio = (tamanho - 2) / 2; // binary heap
		while (inicio >= 0) {
			trocaPosicao(vetor, inicio, tamanho - 1);
			inicio--;
		}
		// Troca de posição até chegar no índice 0 e obtém nosso Heap.
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
