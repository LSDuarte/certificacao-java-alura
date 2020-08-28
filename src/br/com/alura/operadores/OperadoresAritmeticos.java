package br.com.alura.operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int dois = 2;
		int dez = 10;
		
		int doze = dez + dois;
		int oito = dez - dois;
		int vinte = dez * dois;
		int cinco = dez / dois;
		int restoDaDivisão = 5 % 2; // MOD >>> resto da divisão
		
		System.out.println("Soma: " + doze);
		System.out.println("Subtração: " + oito);
		System.out.println("Multiplicação: " + vinte);
		System.out.println("Divisão: " + cinco);
		System.out.println("Resto da Divisão: " + restoDaDivisão); 

		
		// DEVOLVE NO MÍNIMO INT ( MAIOR DOS DOIS TIPOS ENVOLVIDOS )
		// INT MAIS INT DEVOLVE INT
		// INT MAIS LONG DEVOLVE LONG PORQUE LONGE É MAIOR
		
		byte doiss = 2;
		byte dezz = 10;
		
		// devolve int por causa da soma aritmetica 
		byte dozee = (byte) (doiss + dezz);
		
		//Lembrar tabela de conversão
		
//		int divZero = 5 / 0; // erro 
//		int divZeero =  (5 / 0.0); // erro - perde precisão
//		double divZeeero = 5.0 / 0; // pode pois é ponto flutuante >> result >> infinity
//		System.out.println("Resto da Divisão: " + divZeeero); 
		
		// Divisão por 0 somente com ponto flutuante, double, float
		
	//	System.out.println("Int" + (dois + 0) / 0); ERRO
		System.out.println("Double: " + (dois + 0.0) / 0); // INFINITY
		
		double positivoInfinito = 5.0 / 0;
		double negativoInfinito = -5.0 / 0;
		
		System.out.println(positivoInfinito + negativoInfinito); // NaN 
		
	}

}