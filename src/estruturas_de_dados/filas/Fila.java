package estruturas_de_dados.filas;

public class Fila {
    public No primeiro = null;
    public No ultimo = null;
    public int tamanho = 0;

    public String olharPrimeiroDaFila() {
        if (this.tamanho > 0) {
            return this.primeiro.valor;
        } else {
            return null;
        }
    }

    public void enfileirar(String valor) {
        No novoNo = new No(valor);
        if (this.tamanho == 0) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.proximo = novoNo;
        }
        this.ultimo = novoNo;
        this.tamanho++;
    }

    public void desenfileirar() {
        if (this.tamanho > 0) {
            this.primeiro = this.primeiro.proximo;

            if (this.tamanho == 1) {
                this.ultimo = null;
            }
            this.tamanho--;
        }
    }

    public void exibeFila() {
		if(ehVazio()) {
        	System.out.println("Fila vazia!");
        }
        for (No no = primeiro; no != null; no = no.proximo) {
        	System.out.print(no.valor + " ");
        }
		System.out.println("");
	}
    
    public boolean ehVazio() {
        return this.tamanho == 0;
    }

    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.println(fila.ehVazio());
        System.out.println(fila.olharPrimeiroDaFila());
        fila.enfileirar("Elias");
        fila.enfileirar("Nepomuceno");
        fila.enfileirar("Souza");
        fila.exibeFila();
        fila.desenfileirar();
        fila.exibeFila();
        System.out.println(fila.olharPrimeiroDaFila());
    }
}
