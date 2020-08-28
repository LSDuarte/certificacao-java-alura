package br.com.alura.operadores;

public class TestaComparacao {

	public static void main(String[] args) {
		
		System.out.println(" ### TRUE E FALSE ####");
		System.out.println(true == true);
		System.out.println(true != false);
		System.out.println("");
		
		System.out.println(" ### IGUAL OU DIFERENTE ####");
		System.out.println(1.0f == 1.0d);
		System.out.println(1.0f != 1l);
		System.out.println("");

		System.out.println(" ### MAIOR IGUAL OU MENOR IGUAL ####");
		System.out.println(2 >= 1);
		System.out.println(2 <= 1);
		System.out.println("");

		System.out.println(" ### MAIOR OU MENOR ####");
		System.out.println(2 > 1);
		System.out.println(2 < 1);
		
		System.out.println(" ### REFERENCIAS E COMPARAÇÕES ####");
		int idade = 25;
		System.out.println(idade);
		System.out.println(idade == 25);
		System.out.println("");
		
		boolean mentira = false;
		System.out.println(mentira = true);
		System.out.println(mentira == true);
	}

}