package br.com.alura.operadores;

public class TestaCasting {

	public static void main(String[] args) {

		double d = 15.3d;
		double dd = 15.3d;
	//	int a = d; // perda de precis�o, necess�rio realizar um cast
		
		int a = (int) d; // cast
		System.out.println(a); // n�o ir� imprimir 15.3 e sim 15!!!
		System.out.println(dd);
		
		System.out.println("------------------------------------------");
		
		double ddd = 0.99999999999;
		int i = (int) d; // cast
		System.out.println(i);
		
		System.out.println("------------------------------------------");
		long l = 1515151515151515l; // literal, deve colocar l ap�s 
		int ii = (int) l;
		System.out.println(ii);
		
	}

}