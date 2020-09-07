package br.com.alura.loops;

import java.util.ArrayList;

public class TestaForEForeach {

	public static void main(String[] args) {

		// também pode cair em loop infinito
		//  opcional / opcional / opcional - caso não haja nenhum, entra em loop
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------");
		for (int i = 0, j =10; i < 10; i++, j--) {
			System.out.println(i+ " - " + j);
		}
		
		System.out.println("-------------------------------------");
		int i;
		long j;
		
		for (i = 0, j =10; i < 10; i++, j--, System.out.println("oi")) {
			System.out.println(i+ " - " + j);
		}
		
		System.out.println("-------------------------------------");
		for (i = 0, j =10; i < 10; i++, j--, System.out.println(i+ " - " + j)) 
			System.out.println("mensagem");
	
		System.out.println("-------------------------------------");
		for (i = 0, j =10; i < 10; i++, j--, System.out.println(i+ " - " + j));
		
		System.out.println("-------------------------------------");
		int[] numeros = {1,2,3,4,5,6};
		for (int k = 0; k < numeros.length; k++) {
			int numero = numeros[k];
			System.out.println(numero);
		}
		
		System.out.println("-------------------------------------");
		// forech -- ; opcional, e chaves, opcional
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("-------------------------------------");
		ArrayList<String> nomes  = new ArrayList<String>();
		nomes.add("guilherme");
		nomes.add("mario");
		
		// passa em todos os elementos | não há contador
		for (String nome: nomes) {
			System.out.println(nome);
		}
		System.out.println(nomes);
	}

}