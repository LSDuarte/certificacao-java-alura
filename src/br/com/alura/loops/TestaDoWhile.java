package br.com.alura.loops;

public class TestaDoWhile {

	public static void main(String[] args) {

		int i =1;
		while ( i < 20) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------------------------------");
		
		int j = 1;
		do {
			System.out.println(j); //executa pelo menos 1 vez
			j++;
		} while (j < 20); //precisa do ;
				
		
		// ### Do While
		// ### executa pelo menos 1 vez
		// ### chaves opcionais
	}

}