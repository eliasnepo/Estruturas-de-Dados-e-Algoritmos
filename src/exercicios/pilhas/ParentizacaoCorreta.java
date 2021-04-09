package exercicios.pilhas;

import estruturas_de_dados.pilhas.PilhaComListaLigada;

public class ParentizacaoCorreta {

	/*
	 * Escreva um programa que utilize uma pilha para verificar se express�es aritm�ticas est�o com a parentiza��o correta. 
	 * O programa deve verificar express�es para ver se cada �abre par�nteses� tem um �fecha par�nteses� correspondente. 
	 * Ex.: Correto: ( ( ) ) � ( ( )( ) ) � ( ) ( ) 
	 * Incorreto: )( � ( ( ) ( � ) ) ( (
	 */
	
	public static void main(String[] args) {
		String expressaoBalanceada = "(())�(()())�()()";
		String expressaoNaoBalanceada = ")(�(()(�))((";
		
		System.out.println("A primeira express�o � balanceada? " + verificarParentizacao(expressaoBalanceada));
		System.out.println("A segunda express�o � balanceada? " + verificarParentizacao(expressaoNaoBalanceada));
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
