package exercicios.vetores;

/*
 * DADO UMA STRING QUALQUER, INVERTER ESSA STRING
 * EX: Elias Nepomuceno
 * SAÍDA: onecumopeN sailE
 */

public class InverterString {

	static String inverter(String palavra) {
		String stringAuxiliar = "";
		for(int i = palavra.length() - 1; i >= 0; i--) {
			stringAuxiliar += palavra.charAt(i);
		}
		return stringAuxiliar;
	}
	
	public static void main(String[] args) {
		String stringNormal = "Elias Nepomuceno";
		System.out.println("String normal: " + stringNormal);
		System.out.println("String invertida: " + inverter(stringNormal));
	}
}
