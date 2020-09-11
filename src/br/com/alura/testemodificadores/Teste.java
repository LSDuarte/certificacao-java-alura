package br.com.alura.testemodificadores;

public class Teste {

	public static void main(String[] args) {
		System.out.println(" #### MODIFICADORES DE ACESSO ####");
		
		Forma f = new Forma();
		f.lado = 5.5;
		f.getArea();
		System.out.println(f.getArea());
		f.getPerimetro();
		System.out.println(f.getPerimetro());
		f.imprimeCor();
		System.out.println("----------------------------------");
		
		Forma ff = new Quadrado();
		ff.cor = "azul";
		ff.getArea();
		ff.imprimeCor();
	}
}