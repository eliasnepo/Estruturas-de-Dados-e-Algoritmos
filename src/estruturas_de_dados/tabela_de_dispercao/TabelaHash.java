package estruturas_de_dados.tabela_de_dispercao;

/*
 * Implementação de uma Hash Table para aprendizado, sem as otimizações que ela pode ter.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class TabelaHash {
    public ArrayList<ChaveValor>[] data;
    public int tamanhoAtual;

    @SuppressWarnings("unchecked")
	public TabelaHash(int tamanho) {
        data = new ArrayList[tamanho];
        tamanhoAtual = 0;
    }

    private int hash(String chave) {
        int hash = 0;
        for (int i = 0; i < chave.length(); i++) {
            hash = (hash + chave.codePointAt(i) * i) % data.length;
        }
        return hash;
    }

    public void set(String chave, int valor) {
        int enderecoDeMemoria = hash(chave);
        if (data[enderecoDeMemoria] == null) {
            ArrayList<ChaveValor> vetorNoEndereco = new ArrayList<>();
            data[enderecoDeMemoria] = vetorNoEndereco;
            tamanhoAtual++;
        }
        ChaveValor parChaveValor = new ChaveValor(chave, valor);
        data[enderecoDeMemoria].add(parChaveValor);
    }

    public Integer get(String chave) {
        int enderecoDeMemoria = hash(chave);
        ArrayList<ChaveValor> tamanhoOcupadoNoEndereco = data[enderecoDeMemoria];
        if (tamanhoOcupadoNoEndereco != null) {
            for (ChaveValor keyValue : tamanhoOcupadoNoEndereco) {
                if (keyValue.chave.equals(chave)) {
                    return keyValue.valor;
                }
            }
        }
        return null;
    }

    public String[] keys() {
        ArrayList<ChaveValor>[] tamanhoOcupado = data;
        String[] vetorDeChaves = new String[tamanhoAtual];
        int contador = 0;
        for (ArrayList<ChaveValor> chaveValor : tamanhoOcupado) {
            if (chaveValor != null) {
            	vetorDeChaves[contador] = chaveValor.get(0).chave;
            	contador++;
            }
        }
        return vetorDeChaves;
    }


    public static void main(String[] args) {
        TabelaHash hashTable = new TabelaHash(50);
        hashTable.set("Elias", 1200);
        hashTable.set("Joao", 1500);
        System.out.println("Valor para chave Elias: " + hashTable.get("Elias"));
        System.out.println("Valor para chave Joao: " + hashTable.get("Joao"));
        System.out.println("Lista de chaves: " + Arrays.toString(hashTable.keys()));
    }
}
