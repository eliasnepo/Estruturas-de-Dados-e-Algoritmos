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
	
	//  			   9
	//            4        20
	//         1    6   15    170
	//	Em ordem [1, 4, 6, 9, 15, 20, 170]
	//	Pré ordem[9, 4, 1, 6, 20, 15, 170]
	//	Pós ordem[1, 6, 4, 15, 170, 20, 9]
	
	public ArrayList<Integer> travessiaEmOrdem(No no, ArrayList<Integer> vetor) {
        if (no.esquerda != null) {
            travessiaEmOrdem(no.esquerda, vetor);
        }
        vetor.add(no.valor);
        if (no.direita != null) {
            travessiaEmOrdem(no.direita, vetor);
        }
        return vetor;
    }

    public ArrayList<Integer> travessiaPreOrdem(No no, ArrayList<Integer> vetor) {
        vetor.add(no.valor);
        if (no.esquerda != null) {
            travessiaPreOrdem(no.esquerda, vetor);
        }
        if (no.direita != null) {
            travessiaPreOrdem(no.direita, vetor);
        }
        return vetor;
    }

    public ArrayList<Integer> travessiaPosOrdem(No no, ArrayList<Integer> vetor) {
        if (no.esquerda != null) {
            travessiaPosOrdem(no.esquerda, vetor);
        }
        if (no.direita != null) {
            travessiaPosOrdem(no.direita, vetor);
        }
        vetor.add(no.valor);
        return vetor;
    }
    
    public ArrayList<Integer> buscaProfundidadeEmOrdem(ArvorePesquisaBinaria arvore) {
        ArrayList<Integer> resultado = new ArrayList<>();
        return travessiaEmOrdem(arvore.raiz, resultado);
    }

    public ArrayList<Integer> buscaProfundidadePreOrdem(ArvorePesquisaBinaria arvore) {
        ArrayList<Integer> resultado = new ArrayList<>();
        return travessiaPreOrdem(arvore.raiz, resultado);
    }

    public ArrayList<Integer> buscaProfundidadePosOrdem(ArvorePesquisaBinaria arvore) {
        ArrayList<Integer> resultado = new ArrayList<>();
        return travessiaPosOrdem(arvore.raiz, resultado);
    }
}
