package br.com.alura.criandoeusandoarrays;

public class TestaArray {

	public static void main(String[] args) {

		// maneiras de declarar arrays
		// 4 
		long[]tamanhos = new long[] {1,2,3,4,5,6,7};
		
		// 1 
		int[] idades = new int[10];
		System.out.println(idades[0]);
		System.out.println(idades.length);
		
		// 2
		double pesos[] = new double[] {0,2,4,6,8};
		System.out.println(pesos[1]);
		System.out.println(pesos.length);
		
		// 3 -- declarando e inicializando o array numa unica linha, não da para fazer separado
		long []numeros = {0,2,3,4,6,8,9};
		
		// long []numeros;
		// numeros = {0,2,3,4,6,8,9}
		// numeros = new long[]{0,2,3,4,6,8,9}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("--------------------------------------");
		// foreach > não possui indice, não pode parar em um lugar ou indice. 
		for (long i : tamanhos) {
			System.out.println(i);
		}
	}

}