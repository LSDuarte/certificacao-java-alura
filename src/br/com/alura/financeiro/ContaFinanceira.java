package br.com.alura.financeiro;

import br.com.alura.modelo.Conta;

public class ContaFinanceira extends Conta {

	@Override
	protected void fecha() {
		System.out.println("Financeira");
	}

}