package estruturas_de_dados.filas;

public class NoDuplo {
    public String valor;
    public NoDuplo proximo;
    public NoDuplo anterior;

    public NoDuplo() {
    }
    
    public NoDuplo(String valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}
