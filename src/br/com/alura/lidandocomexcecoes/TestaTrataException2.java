package br.com.alura.lidandocomexcecoes;

import java.io.IOException;

public class TestaTrataException2 {

	public static void metodo1() {
		System.out.println("primeiro antes");
		try {
			metodo2();
			System.out.println("primeiro depois");
		} catch (Exception e) {
			System.out.println("tratei");
		}
		System.out.println("fim do metodo 1");
	}

	public static void metodo2() {
		String s = null;
		System.out.println("segundo antes");
		s.length();
		System.out.println("segundo depois");
	}

	public static void main(String[] args) {
		metodo1();
	}

}

class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}

class ContaDoBem {
	double saldo = 100;

	void saca(double quantidade) throws SaldoInsuficienteException {
		if (this.saldo < quantidade) {
			throw new SaldoInsuficienteException("Saldo insuficiente " + saldo + " para sacar " + quantidade);
		//	throw new java.io.IOException("Saldo insuficiente " + saldo + " para sacar " + quantidade);
		}
		saldo -= quantidade;
	}
}

class TestaTrataException3 {
		
	public static void metodo1() {
		try {
			new ContaDoBem().saca(500);
		} catch (NullPointerException ex) {
			System.out.println("tratei nullpointert");
		} catch (SaldoInsuficienteException e) {
			System.out.println("tratei saldo");
		}
	}
	
	public static void main(String[] args) {
		metodo1();
	}
	
}