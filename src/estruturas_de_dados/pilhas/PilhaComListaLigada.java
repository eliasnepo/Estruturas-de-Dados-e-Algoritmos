package estruturas_de_dados.pilhas;

public class PilhaComListaLigada {
    public No topo;
    public No fundo;
    public int tamanho;

    public PilhaComListaLigada() {
        topo = null;
        fundo = null;
        tamanho = 0;
    }

    public String olharTopoDaPilha() {
        if (tamanho > 0) {
            return topo.valor;
        } else {
            return null;
        }
    }

    public void empilhar(String valor) {
        No novoNo = new No(valor);
        if (tamanho == 0) {
            topo = novoNo;
            fundo = novoNo;
        } else {
            novoNo.proximo = topo;
            topo = novoNo;
        }
        this.tamanho++;
    }

    public void desempilhar() {
        if (tamanho > 0) {
            topo = topo.proximo;

            if (tamanho == 1) {
                fundo = null;
            }
            tamanho--;
        }
    }
    
    public void exibePilha() {
		if(ehVazio()) {
        	System.out.println("Pilha vazia!");
        }
        for (No no = topo; no != null; no = no.proximo) {
        	System.out.print(" " + no.valor);
        }
		System.out.println("");
	}

    public boolean ehVazio() {
        return tamanho == 0;
    }

    public String pegarUltimoElemento() {
        if (tamanho > 0) {
            return fundo.valor;
        }
        return null;
    }

    public static void main(String[] args) {
    	PilhaComListaLigada pilha = new PilhaComListaLigada();
    	pilha.empilhar("Elias");
        pilha.empilhar("Nepomuceno");
        pilha.empilhar("Souza");
        pilha.exibePilha();
        System.out.println(pilha.olharTopoDaPilha());
        pilha.desempilhar();
        System.out.println(pilha.olharTopoDaPilha());
        System.out.println(pilha.ehVazio());
    }
}
