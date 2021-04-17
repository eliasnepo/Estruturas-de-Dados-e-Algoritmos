package algoritmos.busca;

import java.util.ArrayList;

import estruturas_de_dados.arvores.ArvorePesquisaBinaria;
import estruturas_de_dados.arvores.No;

public class AlgoritmosDeBuscaTravessia {

	public ArrayList<Integer> buscaLargura(ArvorePesquisaBinaria arvore) {
        No atual = arvore.raiz;
        ArrayList<Integer> resultado = new ArrayList<>();
        ArrayList<No> fila = new ArrayList<>();
        fila.add(atual);

        while (fila.size() > 0) {
            atual = fila.remove(0);
            resultado.add(atual.valor);

            if (atual.esquerda != null) {
                fila.add(atual.esquerda);
            }
            if (atual.direita != null) {
                fila.add(atual.direita);
            }
        }
        return resultado;
    }
	
	public ArrayList<Integer> buscaLarguraRecursiva(
            ArrayList<No> fila,
            ArrayList<Integer> resultado
    ) {
        if (fila.size() == 0) {
            return resultado;
        }

        No atual = fila.remove(0);
        resultado.add(atual.valor);
        if (atual.esquerda != null) {
            fila.add(atual.esquerda);
        }
        if (atual.direita != null) {
            fila.add(atual.direita);
        }

        return buscaLarguraRecursiva(fila, resultado);
    }
}
