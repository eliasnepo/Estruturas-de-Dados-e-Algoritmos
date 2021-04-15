package estruturas_de_dados.grafos;


import java.util.ArrayList;
import java.util.Hashtable;

public class Grafo {
    int numeroDeNos = 0;
    Hashtable<Integer, ArrayList<Integer>> listaAdjascente = new Hashtable<>();

    public void adicionarVertice(int no) {
        listaAdjascente.put(no, new ArrayList<>());
        numeroDeNos++;
    }

    public void adicionarAresta(int no1, int no2) {
        listaAdjascente.get(no1).add(no2);
        listaAdjascente.get(no2).add(no1);
    }

    public void mostrarConexoes() {
        Object[] chaves = listaAdjascente.keySet().toArray();
        for (Object chave : chaves) {
            System.out.println(chave + " ---> " + listaAdjascente.get(Integer.parseInt(chave.toString())));
        }
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        //		1
        //     / 
        //	  2 - 3
        //	       \
        //			4
        grafo.adicionarVertice(1);
        grafo.adicionarVertice(2);
        grafo.adicionarVertice(3);
        grafo.adicionarVertice(4);
        grafo.adicionarAresta(1,2);
        grafo.adicionarAresta(2,3);
        grafo.adicionarAresta(3,4);
        grafo.mostrarConexoes();
    }
}


