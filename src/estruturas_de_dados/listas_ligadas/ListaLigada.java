package estruturas_de_dados.listas_ligadas;

public class ListaLigada {

	public int tamanho;
	public No primeiro;
	public No ultimo;

	public ListaLigada() {
		primeiro = null;
		ultimo = null;
		tamanho = 0;
	}

	public void adicionaValor(int valor) {
		No no = new No(valor);
		if (primeiro == null && ultimo == null) {
			primeiro = no;
			ultimo = primeiro;
		} else {
			ultimo.proximo = no;
			ultimo = no;
		}
		tamanho += 1;
	}
	
	public void adicionaValorAoInicio(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = primeiro;
        primeiro = novoNo;
        tamanho++;
    }
	
	public void adicionaValorNaPosicao(int posicao, int valor) {
        if (posicao < 0 || posicao > tamanho) {
            System.err.println("Posição fora do tamanho da lista! Tamanho: " + tamanho);
        } else if (posicao == 0) {
            adicionaValorAoInicio(valor);
        } else if (posicao == tamanho) {
            adicionaValor(valor);
        } else {
            No atual = primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            No novoNo = new No(valor);
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
            tamanho++;
        }
    }

	public void removeValor(int valor) {
		No anterior = null;
		No atual = this.primeiro;
		for (int i = 0; i < this.tamanho; i++) {
			if (atual.valor == valor) {
				if (this.tamanho == 1) {
					this.primeiro = null;
					this.ultimo = null;
				} else if (atual == primeiro) {
					this.primeiro = atual.proximo;
					atual.proximo = null;
				} else if (atual == ultimo) {
					this.ultimo = anterior;
					anterior.proximo = null;
				} else {
					anterior.proximo = atual.proximo;
					atual = null;
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.proximo;
		}
	}
	
	public void removeValorNaPosicao(int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            System.err.println("Posição fora do tamanho da lista! Tamanho: " + tamanho);
        } else if (posicao == 0) {
            primeiro = this.primeiro.proximo;
            tamanho--;
        } else {
            No atual = primeiro;
            int i;
            for (i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
            tamanho--;
            if (i == tamanho - 1) {
                ultimo = atual;
            }
        }
    }

	public No pegarElemento(int valor) {
		No no = primeiro;
		while (no != null) {
			if (no.valor == valor) {
				return no;
			}
			no = no.proximo;
		}
		return null;
	}

	public No pegarElementoNaPosicao(int posicao) {
		No atual = primeiro;
		for (int i = 0; i < posicao; i++) {
			if (atual.proximo != null) {
				atual = atual.proximo;
			}
		}
		No no = new No(atual.valor);
		no.proximo = atual.proximo;
		return no;
	}
	
	public boolean ehVazio() {
		return (primeiro == null && ultimo == null);
	}

	public String exibeLista() {
		if (ehVazio()) {
			return "vazia\n";
		}
		String str = "";
		for (No no = primeiro; no != null; no = no.proximo) {
			str += " " + no.valor;
		}
		return str + "\n";
	}
	
	// TESTAR A LISTA
	public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();
        listaLigada.adicionaValor(3);
        listaLigada.adicionaValor(4);
        listaLigada.adicionaValorAoInicio(2);
        listaLigada.adicionaValorAoInicio(1);
        System.out.println("Tamanho: " + listaLigada.tamanho);
        System.out.print("Lista:" + listaLigada.exibeLista());
        
        listaLigada.removeValor(3);
        listaLigada.removeValorNaPosicao(1);
        System.out.print("Lista:" + listaLigada.exibeLista());
        
        listaLigada.adicionaValorNaPosicao(1, 2);
        listaLigada.adicionaValorNaPosicao(2, 3);
        System.out.print("Lista:" + listaLigada.exibeLista());
        System.out.println("Tamanho: " + listaLigada.tamanho);
    }
}
