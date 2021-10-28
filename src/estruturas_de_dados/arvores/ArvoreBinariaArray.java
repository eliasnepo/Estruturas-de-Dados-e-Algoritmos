package estruturas_de_dados.arvores;

public class ArvoreBinariaArray {

	Integer altura;
	static String[] str;
	
	public ArvoreBinariaArray(Integer altura) {
		this.altura = altura;
		str = new String[(int) Math.pow(2.0, Double.parseDouble(altura.toString())) - 1];
	}

	
	// Métodos par inserir e imprimir a árvore
	public void inserirRaiz(String key) {
		str[0] = key;
	}

	public void inserirEsquerda(String key, int indiceRaiz) {
		if (str[indiceRaiz] == null) {
			System.out.println("Não foi possível encontrar o índice " + indiceRaiz);
			return;
		}
		
		int t = (indiceRaiz * 2) + 1;
		str[t] = key;
	}

	public void inserirDireita(String key, int indiceRaiz) {
		if (str[indiceRaiz] == null) {
			System.out.println("Não foi possível encontrar o índice " + indiceRaiz);
			return;
		}
		
		int t = (indiceRaiz * 2) + 2;
		str[t] = key;
	}

	public void printarArvore() {
		for (int i = 0; i < str.length; i++) {
			if (str[i] == null) {
				System.out.print("-");
			} else {
				System.out.print(str[i]);
			}
		}
	}

	public static void main(String[] args) {
		// Define a altura e o vetor terá como tamanho o máximo de elementos que poderá receber. 
		ArvoreBinariaArray obj = new ArvoreBinariaArray(3);

		obj.inserirRaiz("A");
		obj.inserirDireita("C", 0);
		obj.inserirEsquerda("D", 1);
		obj.inserirDireita("E", 3);
		obj.inserirEsquerda("F", 2);
		obj.printarArvore();
	}
}
