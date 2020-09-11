package br.com.alura.metodoseencapsulamento;

import br.com.alura.testemodificadores.Forma;
import br.com.alura.testemodificadores.Quadrado;

public class TestaModificadoresDeAcessos {

	public static void main(String[] args) {

		System.out.println(" #### MODIFICADORES DE ACESSO ####");

		// public >> (top level) classes, interfaces, membros e classes internas
		// protected >> membros e classes internas
		// default >> (top level) classes, interfaces, mebros e classes internas
		// private >> membros e classes internas (não cai)

		
		Quadrado f = new Quadrado();
		f.getArea();
		f.cor = "azul";
		System.out.println(f.getArea());
		System.out.println("---------------------------------");
		
		Forma ff = new Quadrado();
		ff.getArea();
	}

}