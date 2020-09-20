package br.com.alura.operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int dois = 2;
		int dez = 10;
		
		int doze = dez + dois;
		int oito = dez - dois;
		int vinte = dez * dois;
		int cinco = dez / dois;
		int restoDaDivisao = 5 % 2; // MOD >>> resto da divis�o
		
		System.out.println("Soma: " + doze);
		System.out.println("Subtra��o: " + oito);
		System.out.println("Multiplica��o: " + vinte);
		System.out.println("Divis�o: " + cinco);
		System.out.println("Resto da Divis�o: " + restoDaDivisao); 

		
		// DEVOLVE NO M�NIMO INT ( MAIOR DOS DOIS TIPOS ENVOLVIDOS )
		// INT MAIS INT DEVOLVE INT
		// INT MAIS LONG DEVOLVE LONG PORQUE LONGE � MAIOR
		
		byte doiss = 2;
		byte dezz = 10;
		
		// devolve int por causa da soma aritmetica 
		byte dozee = (byte) (doiss + dezz);
		
		//Lembrar tabela de convers�o
		
//		int divZero = 5 / 0; // erro 
//		int divZeero =  (5 / 0.0); // erro - perde precis�o
//		double divZeeero = 5.0 / 0; // pode pois � ponto flutuante >> result >> infinity
//		System.out.println("Resto da Divis�o: " + divZeeero); 
		
		// Divis�o por 0 somente com ponto flutuante, double, float
		
	//	System.out.println("Int" + (dois + 0) / 0); ERRO
		System.out.println("Double: " + (dois + 0.0) / 0); // INFINITY
		
		double positivoInfinito = 5.0 / 0;
		double negativoInfinito = -5.0 / 0;
		
		System.out.println(positivoInfinito + negativoInfinito); // NaN 
		
	}

}