package br.com.alura.testemodificadores;

public class Forma {

	// public
	protected double lado;
	public double getArea() {
		return lado;
	}
	
	//default - sem modificador
	double getPerimetro() {
		return 10;
	}
	
	String cor = "azul";
	void imprimeCor() {
		System.out.println(cor);
	}
}

class Forma2 {
	void metodo() {
		Forma f = new Forma();
		// f.cor = "azul";
	}
}