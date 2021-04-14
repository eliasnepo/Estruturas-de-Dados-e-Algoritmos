package exercicios.deque;

import estruturas_de_dados.filas.Deque;
import estruturas_de_dados.filas.NoDuplo;

public class VerificaSeTemValor {

	/*
	 *	Escreva uma função que retorne VERDADEIRO se existe um elemento com valor igual a val. 
	 *	A função deve receber val como parâmetro e retornar um valor booleano. 
	 */
	
	public static void main(String[] args) {
		Deque deque = new Deque();
		deque.enfileirar("1");
		deque.enfileirar("2");
		deque.enfileirar("3");
		deque.enfileirar("4");
		System.out.print("Deque: ");
		deque.exibeDeque();
		
		System.out.println("Tem o valor 3? " + verificaSeTemValor("3", deque));
		System.out.println("Tem o valor 5? " + verificaSeTemValor("5", deque));
	}
	
	static boolean verificaSeTemValor(String valor, Deque deque) {
		NoDuplo novoNo = new NoDuplo();
		novoNo = deque.primeiro;
		while (novoNo != null) {
			if (novoNo.valor.equals(valor)) {
				return true;
			}
			novoNo = novoNo.proximo;
		}
		return false;
	}

}
