package estruturas_de_dados.vetor;

import java.util.Arrays;

public class Vetor {
	
    public String[] vetor;
    public int capacidade;
    public int tamanhoAtual;

    public Vetor() {
        vetor = new String[1];
        capacidade = 1;
        tamanhoAtual = 0;
    }

    public String get(int index) {
        if (index >= 0 && index < tamanhoAtual)
            return this.vetor[index];
        else return "Index fora do tamanho";
    }

    public void push(String string) {
        if (tamanhoAtual == capacidade) {
            String[] vetorTemporario = new String[capacidade * 2];
            for (int i = 0; i < vetor.length; i++) {
                vetorTemporario[i] = vetor[i];
            }
            vetor = vetorTemporario;
            capacidade *= 2;
        }
        vetor[tamanhoAtual] = string;
        tamanhoAtual++;
    }

    public void replace(int index, String value) {
        if (index >= 0 && index < tamanhoAtual) {
            vetor[index] = value;
        } else {
            System.err.println("Index fora do tamanho");
        }
    }

    public void pop() {
        if (tamanhoAtual > 0) {
            tamanhoAtual--;
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < tamanhoAtual) {
            if (index == tamanhoAtual - 1) {
                pop();
            } else {
                for (int i = index; i < tamanhoAtual; i++) {
                    vetor[i] = vetor[i + 1];
                }
                tamanhoAtual--;
            }
        } else {
            System.err.println("Index fora do tamanho");
        }
    }

    public String[] getArray() {
        String[] vetorTemporario = new String[tamanhoAtual];
        for (int i = 0; i < tamanhoAtual; i++) {
            vetorTemporario[i] = vetor[i];
        }
        return vetorTemporario;
    }

    // TESTAR O VETOR
    public static void main(String[] args) {
        Vetor vetorDinamico = new Vetor();
        vetorDinamico.push("Eu");
        vetorDinamico.push("sou");
        vetorDinamico.push("o");
        vetorDinamico.push("Elias");
        vetorDinamico.push("!");
        
        System.out.println("Vetor inicial: " + Arrays.toString(vetorDinamico.getArray()));
        System.out.println("Tamanho do vetor: " + vetorDinamico.tamanhoAtual);
        System.out.println("Index 2: " + vetorDinamico.get(2));
        System.out.println("------------------------------------");
        vetorDinamico.replace(3, "Nepomuceno");
        System.out.println("Vetor: " + Arrays.toString(vetorDinamico.getArray()));
        vetorDinamico.pop();
        System.out.println("Vetor: " + Arrays.toString(vetorDinamico.getArray()));
        vetorDinamico.delete(0);
        System.out.println("Vetor: " + Arrays.toString(vetorDinamico.getArray()));
        System.out.println("Tamanho do vetor: " + vetorDinamico.tamanhoAtual);
    }
}
