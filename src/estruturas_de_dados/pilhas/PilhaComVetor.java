package estruturas_de_dados.pilhas;

import java.util.ArrayList;

public class PilhaComVetor {
    public ArrayList<String> pilhaDeVetor;

    public PilhaComVetor() {
        this.pilhaDeVetor = new ArrayList<>();
    }

    public String olharTopoDaPilha() {
        if (this.pilhaDeVetor.size() > 0) {
            return pilhaDeVetor.get(pilhaDeVetor.size() - 1);
        } else {
            return null;
        }
    }

    public void empilhar(String value) {
        this.pilhaDeVetor.add(value);
    }

    public void desempilhar() {
        this.pilhaDeVetor.remove(pilhaDeVetor.size() - 1);
    }
    
    public void exibePilha() {
    	String pilha = "";
    	pilha += "[ ";
    	for (int i = pilhaDeVetor.size() - 1; i >= 0; i--) {
    		pilha += pilhaDeVetor.get(i) + " ";
    	}
    	pilha += "]";
    	System.out.println(pilha);
    }

    public boolean ehVazio() {
        return pilhaDeVetor.size() == 0;
    }

    public static void main(String[] args) {
        PilhaComVetor pilha = new PilhaComVetor();
        pilha.empilhar("Elias");
        pilha.empilhar("Nepomuceno");
        pilha.empilhar("Souza");
        pilha.exibePilha();
        System.out.println(pilha.olharTopoDaPilha());
        pilha.desempilhar();
        System.out.println(pilha.olharTopoDaPilha());
        System.out.println(pilha.ehVazio());
    }
}
