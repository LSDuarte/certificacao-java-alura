package br.com.alura.modelo;

import br.com.alura.financeiro.ContaFinanceira;

public class TestaContaHeranca {

	public static void main(String[] args) {
		Conta c = new ContaFinanceira();
		c.fecha();
	}

}