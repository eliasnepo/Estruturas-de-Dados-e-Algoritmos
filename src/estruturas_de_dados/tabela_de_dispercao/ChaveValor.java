package estruturas_de_dados.tabela_de_dispercao;

public class ChaveValor {
	private String chave;
	private int valor;

	public ChaveValor(String chave, int valor) {
	        this.chave = chave;
	        this.valor = valor;
	    }

	public String getKey() {
		return chave;
	}

	public int getValue() {
		return valor;
	}
}
