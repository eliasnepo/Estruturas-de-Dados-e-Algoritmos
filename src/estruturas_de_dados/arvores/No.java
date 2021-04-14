package estruturas_de_dados.arvores;

public class No {
    public int valor;
    public No direita;
    public No esquerda;

    public No(int valor) {
        this.valor = valor;
        this.direita = null;
        this.esquerda = null;
    }
}
