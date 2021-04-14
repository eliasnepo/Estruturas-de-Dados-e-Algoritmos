package exercicios.deque;

import estruturas_de_dados.filas.Deque;
import estruturas_de_dados.filas.NoDuplo;

public class VerificaSimetria {

	/*
	 * 	Considere um deque que mantém uma lista de caracteres. Implemente um método ehSimétrico() 
	 * 	que retorna verdadeiro caso as duas metades dessa lista sejam simétricas.
	 * 	Exemplos:
	 * 	A B A A B A -> verdadeiro
	 * 	A B C X Y A -> falso
	 * 	X Y Z Y X 	-> falso
	 */
	
	public static void main(String[] args) {
		Deque deque = new Deque();
		deque.enfileirar("A");
		deque.enfileirar("B");
		deque.enfileirar("A");
		deque.enfileirar("A");
		deque.enfileirar("B");
		deque.enfileirar("A");
		
		Deque deque2 = new Deque();
		deque2.enfileirar("A");
		deque2.enfileirar("B");
		deque2.enfileirar("C");
		deque2.enfileirar("X");
		deque2.enfileirar("Y");
		deque2.enfileirar("A");
		
		Deque deque3 = new Deque();
		deque3.enfileirar("X");
		deque3.enfileirar("Y");
		deque3.enfileirar("Z");
		deque3.enfileirar("Y");
		deque3.enfileirar("X");
		
		System.out.println("É simétrica? " + ehSimetrico(deque));  // deve retornar true
		System.out.println("É simétrica? " + ehSimetrico(deque2)); // deve retornar false
		System.out.println("É simétrica? " + ehSimetrico(deque3)); // deve retornar true
	}
	
	static boolean ehSimetrico(Deque deque) {
		NoDuplo noDireto = new NoDuplo();
		noDireto = deque.primeiro;
		
		NoDuplo noInverso = new NoDuplo();
		noInverso = deque.ultimo;
		
		String ordemDireta = "";
		while (noDireto != null) {
			ordemDireta += noDireto.valor;
			noDireto = noDireto.proximo;
		}
		
		String ordemIndireta = "";
		while (noInverso != null) {
			ordemIndireta += noInverso.valor;
			noInverso = noInverso.anterior;
		}
		
		if (ordemDireta.equals(ordemIndireta)) {
			return true;
		} else {
			return false;
		}
	}

}
