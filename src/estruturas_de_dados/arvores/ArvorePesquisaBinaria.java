package estruturas_de_dados.arvores;

import java.util.ArrayList;

import algoritmos.busca.AlgoritmosDeBuscaTravessia;

public class ArvorePesquisaBinaria {
    public No raiz = null;

    public void inserirValor(int valor) {
        No novoNo = new No(valor);
        if (this.raiz == null) {
            this.raiz = novoNo;
        } else {
            No atual = this.raiz;
            while (true) {
                if (atual.valor < valor) {
                    if (atual.direita != null) {
                        atual = atual.direita;
                    } else {
                        atual.direita = novoNo;
                        break;
                    }
                } else {
                    if (atual.esquerda != null) {
                        atual = atual.esquerda;
                    } else {
                        atual.esquerda = novoNo;
                        break;
                    }
                }
            }
        }
    }

    public boolean procurarValor(int valor) {
        No atual = this.raiz;
        while (atual != null) {
            if (atual.valor > valor) {
                atual = atual.esquerda;
            } else if (atual.valor < valor) {
                atual = atual.direita;
            } else {
                return true;
            }
        }
        return false;
    }

    public void removerValor(int valor) {
        if (this.raiz == null) {
            return;
        }
        No atual = this.raiz;
        No noPai = null;
        // while current is not null
        while (atual != null) {
            if (valor < atual.valor) {
                // go left
                noPai = atual;
                atual = atual.esquerda;
            } else if (valor > atual.valor) {
                // go right
                noPai = atual;
                atual = atual.direita;
            }
            // (value == current.value, means if we found the value to be removed)
            else {
                // Option 1: NO RIGHT CHILD            // Child means the child of current Node
                if (atual.direita == null) {
                    // if parentNode is null means delete the root node
                    if (noPai == null) {
                        this.raiz = atual.esquerda;
                    } else {
                        // if current < parent, make current left child a left child of parent
                        if (atual.valor < noPai.valor) {
                            noPai.esquerda = atual.esquerda;

                        }
                        // if current > parent, make current's left child a right child of parent
                        else if (atual.valor > noPai.valor) {
                            noPai.direita = atual.esquerda;
                        }
                    }
                }

                // Option 2: RIGHT CHILD WHICH DOESN'T HAVE A LEFT CHILD
                else if (atual.direita.esquerda == null) {
                    if (noPai == null) {
                        this.raiz = atual.direita;
                    } else {
                        // if current < parent, make current's right child a left child of parent
                        if (atual.valor < noPai.valor) {
                            noPai.esquerda = atual.direita;
                        }
                        // if current > parent, make current's right child a right child of parent
                        else if (atual.valor > noPai.valor) {
                            noPai.direita = atual.direita;
                        }
                    }
                }

                // Option 3: RIGHT CHILD WHICH HAVE LEFT CHILD
                else {
                    if (noPai == null) {
                        // save reference of left and right nodes of the root
                        No noEsquerdo = this.raiz.esquerda;
                        No noDireito = this.raiz.direita;
                        // root.right.left node becomes new root
                        this.raiz = atual.direita.esquerda;
                        noDireito.esquerda = noDireito.esquerda.direita;
                        // set back the saved reference of left and right nodes of root.
                        this.raiz.esquerda = noEsquerdo;
                        this.raiz.direita = noDireito;
                    } else {
                        if (atual.valor < noPai.valor) {
                            noPai.esquerda = atual.direita.esquerda;
                        } else if (atual.valor > noPai.valor) {
                            noPai.direita = atual.direita.esquerda;
                        }
                    }
                }
                return;
            }
        }
    }

    public static void main(String[] args) {
    	//                 9
    	//            4        20
    	//         1    6   15    170
        ArvorePesquisaBinaria arvore = new ArvorePesquisaBinaria();
        arvore.inserirValor(9);
        arvore.inserirValor(4);
        arvore.inserirValor(6);
        arvore.inserirValor(20);
        arvore.inserirValor(170);
        arvore.inserirValor(15);
        arvore.inserirValor(1);
        AlgoritmosDeBuscaTravessia buscas = new AlgoritmosDeBuscaTravessia();
        System.out.println("BFS Normal: " + buscas.buscaLargura(arvore));
        ArrayList<No> fila = new ArrayList<>();
        fila.add(arvore.raiz);
        System.out.println("BFS Recursiva: " + buscas.buscaLarguraRecursiva(fila, new ArrayList<>()));
        System.out.println("DFS Em Ordem: " + buscas.buscaProfundidadeEmOrdem(arvore));
        System.out.println("DFS Pre Ordem: " + buscas.buscaProfundidadePreOrdem(arvore));
        System.out.println("DFS Pós Ordem: " + buscas.buscaProfundidadePosOrdem(arvore));
        System.out.println("---------------------");
        System.out.println("Procurar valor 20: " + arvore.procurarValor(20));
        arvore.removerValor(20);
        System.out.println("Procurar valor 20 após removê-lo: " + arvore.procurarValor(20));
    }
}
