package exercicios.pilhas;

import estruturas_de_dados.pilhas.PilhaComListaLigada;

public class ConverteNumeros {

	/*
	 * A convers�o de n�meros inteiros, na base 10, para outras bases num�ricas se d� atrav�s 
	 * de sucessivas divis�es de um dado valor n pelo valor da base na qual se queira converter. 
	 * Escreva um programa para obter a convers�o num�rica, de acordo com a op��o do usu�rio, 
	 * utilizando uma pilha: 
	 * (a) Decimal para Bin�rio. 
	 * (b) Decimal para Octal. 
	 * (c) Decimal para Hexadecimal
	 */
	
	public static void main(String[] args) {
		System.out.println("N�mero 32 para bin�rio: " + decimalParaBaseEscolhida(32, 2));
		System.out.println("N�mero  3 para bin�rio: " + decimalParaBaseEscolhida(3, 2));
		System.out.println("N�mero 32 para octal: " + decimalParaBaseEscolhida(32, 8));
		System.out.println("N�mero 64 para octal: " + decimalParaBaseEscolhida(64, 8));
		System.out.println("N�mero 32 para hexadecimal: " + decimalParaBaseEscolhida(32, 16));
		System.out.println("N�mero 64 para hexadecimal: " + decimalParaBaseEscolhida(64, 16));
	}

	static String decimalParaBaseEscolhida(int numero, int base) {
		PilhaComListaLigada pilha = new PilhaComListaLigada();
		String numeroNaBaseEscolhida = "";
		int resto;

		while (numero > 0) {
			resto = numero % base;
			pilha.empilhar(Integer.toString(resto));
			numero /= base;
		}

		while (!pilha.ehVazio()) {
			String valorAInserir = pilha.olharTopoDaPilha();
			
			// SWITCH PARA BASE HEXADECIMAL
			switch (valorAInserir) {
			case "10":
				valorAInserir = "A";
				break;
			case "11":
				valorAInserir = "B";
				break;
			case "12":
				valorAInserir = "C";
				break;
			case "13":
				valorAInserir = "D";
				break;
			case "14":
				valorAInserir = "E";
				break;
			case "15":
				valorAInserir = "F";
				break;
			}
			
			numeroNaBaseEscolhida += valorAInserir;
			pilha.desempilhar();
		}

		return numeroNaBaseEscolhida;
	}

}
