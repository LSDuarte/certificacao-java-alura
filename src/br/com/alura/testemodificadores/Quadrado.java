package br.com.alura.testemodificadores;

public class Quadrado extends Forma {
	public String cor = "vermelha";
	
	void imprimeCor() {
		super.imprimeCor();
		System.out.println(cor);
	}
}