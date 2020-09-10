package br.com.alura.metodoseencapsulamento;

import br.com.alura.tiposdedados.Carro;

public class TestaOverload {

	public static void main(String[] args) {
		System.out.println("#### OVERLOAD | SOBRECARGA DE METODOS ####");
		System.out.println();
		
		// SOBRECARGA, metodos com mesmo nome, mais argumentos diferentes
		new Overload().metodo();
		new Overload().metodo(423);
		new Overload().metodo(12.4);
		new Overload().metodo((short) 123);
		new Overload().metodo((float) 123);
		
		System.out.println("---------------------------------------------------");
		new Overload().metodo2("Guilherme");
		new Overload().metodo2((Object)"Guilherme"); // trato como objetc
		new Overload().metodo2(new Object());
		
		System.out.println("---------------------------------------------------");
		new Overload().metodo3("Java", 8);
		new Overload().metodo3(8, "Java");
		
		System.out.println("---------------------------------------------------");
		new Overload().metodo4(2.4, 8);
		new Overload().metodo4(8, 2.4);
		
		new Overload().metodo4( (double) 8, 24);
		
		System.out.println("---------------------------------------------------");
		new Overload().metodo5(new Object(), "Java Certificação");
		new Overload().metodo5("Java Certificação", new Object());
		
		System.out.println("---------------------------------------------------");
		new Overload().metodo6(new Object(), new Object());
		new Overload().metodo6(new Carro(), new Carro());
		new Overload().metodo6("Java Certificação", "Sei lá");
		new Overload().metodo6(new Object(), "Java Java");
	}

}

class Overload {
	
	public void metodo() {
		System.out.println("Sem Nada");
	}
	
	public void metodo(int a) {
		System.out.println("Com Int");
	}
	
	public void metodo(double a) {
		System.out.println("Com Double");
	}

	public void metodo2(String s) {
		System.out.println("Com String");
	}
	
	public void metodo2(Object o) {
		System.out.println("Com Object");
	}
	
	public void metodo3(String a, int b) {
		System.out.println("Com String & Int");
	}
	
	// sobrecarga valida
	public void metodo3(int b, String a) {
		System.out.println("Com Int & String");
	}
	
	
	public void metodo4(double a, int b) {
		System.out.println("Com Double & Int");
	}
	
	public void metodo4(int b, double a) {
		System.out.println("Com Int & Double");
	}
	
	
	public void metodo5(String a, Object b) {
		System.out.println("Com String & Objetc");
	}
	
	public void metodo5(Object b, String a) {
		System.out.println("Com Object & String");
	}
	
	public void metodo6(Object b, Object a) {
		System.out.println("Com Object & Object");
	}
	
	public void metodo6(String b, String a) {
		System.out.println("Com String & String");
	}
	
	// cria um novo metodo, com o msmo nome
	/*public int metodo() {
		return 1;
	}*/
}