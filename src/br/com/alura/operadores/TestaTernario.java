package br.com.alura.operadores;

public class TestaTernario {

	public static void main(String[] args) {

		// (condicao) ? caso_verdadeiro : caso_falso
		int i = 5;
		
		int resultado = (i==5) ? 100 : 0;
		
		System.out.println(resultado);
		System.out.println( i == 5 ? 100 : 0);
		
		System.out.println( i == 5 ? "100" : 0);
		
	}

}