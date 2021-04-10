package estruturas_de_dados.filas;


public class Deque {
    public NoDuplo primeiro = null;
    public NoDuplo ultimo = null;
    public int tamanho = 0;

    public String olharPrimeiroDaFila() {
        if (this.tamanho > 0) {
            return this.primeiro.valor;
        } else {
            return null;
        }
    }
    
    public String olharUltimoDaFila() {
        if (this.tamanho > 0) {
            return this.ultimo.valor;
        } else {
            return null;
        }
    }

    public void enfileirar(String valor) {
    	NoDuplo novoNo = new NoDuplo(valor);
        if (this.tamanho == 0) {
            this.primeiro = novoNo;
        } else {
        	novoNo.anterior = this.ultimo;
            this.ultimo.proximo = novoNo;
        }
        this.ultimo = novoNo;
        this.tamanho++;
    }
    
    public void adicionaAoInicioDaFila(String valor) {
    	NoDuplo novoNo = new NoDuplo(valor);
    	if (this.tamanho == 0) {
            this.primeiro = novoNo;
        } else {
            novoNo.proximo = this.primeiro;
            this.primeiro.anterior = novoNo;
        }
    	this.primeiro = novoNo;
    	this.tamanho++;
    }

    public void desenfileirar() {
        if (this.tamanho > 0) {
            this.primeiro = this.primeiro.proximo;
            this.primeiro.anterior = null;
            if (this.tamanho == 1) {
                this.ultimo = null;
            }
            this.tamanho--;
        }
    }
    
    public void removeOUltimoDaFila() {
    	NoDuplo anterior = null;
    	NoDuplo atual = this.primeiro;
    	while (atual.proximo != null) {
    		anterior = atual;
    		atual = atual.proximo;
    	}
    	anterior.proximo = null;
    	this.ultimo = anterior;
    	this.tamanho--;
    }

    public void exibeDeque() {
		if(ehVazio()) {
        	System.out.println("Fila vazia!");
        }
        for (NoDuplo no = primeiro; no != null; no = no.proximo) {
        	System.out.print(no.valor + " ");
        }
		System.out.println("");
	}
    
    public void exibeDequeOrdemInversa() {
    	if(ehVazio()) {
    		System.out.println("DequeVazio!");
    	}
    	for (NoDuplo no = ultimo; no != null; no = no.anterior) {
    		System.out.print(no.valor + " ");
    	}
    	System.out.println("");
    }
    
    public boolean ehVazio() {
        return this.tamanho == 0;
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        System.out.println(deque.ehVazio());
        System.out.println(deque.olharPrimeiroDaFila());
        deque.enfileirar("Elias");
        deque.enfileirar("Nepomuceno");
        deque.enfileirar("Souza");
        deque.adicionaAoInicioDaFila("sou");
        deque.exibeDeque();
        deque.desenfileirar();
        deque.exibeDeque();
        System.out.println(deque.olharPrimeiroDaFila());
        System.out.println(deque.olharUltimoDaFila());
        deque.removeOUltimoDaFila();
        deque.exibeDeque();
        deque.exibeDequeOrdemInversa();
        System.out.println(deque.tamanho);
    }
}
