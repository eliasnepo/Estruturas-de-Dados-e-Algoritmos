package exercicios.pilhas;

import estruturas_de_dados.pilhas.PilhaComListaLigada;

public class ParentizacaoCorreta {

	/*
	 * Escreva um programa que utilize uma pilha para verificar se expressões aritméticas estão com a parentização correta. 
	 * O programa deve verificar expressões para ver se cada “abre parênteses” tem um “fecha parênteses” correspondente. 
	 * Ex.: Correto: ( ( ) ) – ( ( )( ) ) – ( ) ( ) 
	 * Incorreto: )( – ( ( ) ( – ) ) ( (
	 */
	
	public static void main(String[] args) {
		String expressaoBalanceada = "(())–(()())–()()";
		String expressaoNaoBalanceada = ")(–(()(–))((";
		
		System.out.println("A primeira expressão é balanceada? " + verificarParentizacao(expressaoBalanceada));
		System.out.println("A segunda expressão é balanceada? " + verificarParentizacao(expressaoNaoBalanceada));
	}

	static boolean verificarParentizacao(String expressao) {
		if (expressao.charAt(0) == ')') {
			return false;
		} 
		PilhaComListaLigada pilhaVerificadora = new PilhaComListaLigada();
		for (int i = 0; i < expressao.length(); i++) {
			if (expressao.charAt(i) == '(') {
				pilhaVerificadora.empilhar("(");
			} else if (expressao.charAt(i) == ')' && !pilhaVerificadora.ehVazio()) {
				pilhaVerificadora.desempilhar();
			}
		}
		if (pilhaVerificadora.ehVazio()) {
			return true;
		} else {
			return false;
		}
	}

}
