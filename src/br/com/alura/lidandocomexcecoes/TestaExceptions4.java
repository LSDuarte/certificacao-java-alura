package br.com.alura.lidandocomexcecoes;

import java.util.ArrayList;
import java.util.Date;

public class TestaExceptions4 {

	public static void main(String[] args) {
		
		/*
		posição invalida
		java.lang.IndexOutOfBoundsException
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("larissa");
		lista.add("michelli");
		
		lista.get(2);
	
	*/
		//java.lang.ArrayIndexOutOfBoundsException
/*		int[] x = new int[56]; 
		x[56] = 13; // invalido
		x[-56] = 13; // invalido
*/		
		
/*		//java.lang.NullPointerException
		String s = null;
		s.length();
		// variavel não inicializada nem compila, com NULL da uma exception
*/
		
/*		//java.lang.ClassCastException:
		Object l = "larissa";
		Date data = (Date) l;
*/
		//numero não valido
		//java.lang.NumberFormatException
/*		String numero1 = "1a";
		int n = Integer.parseInt(numero1);
		System.out.println(n);
*/
		
		//java.lang.IllegalArgumentException
//		new NovaConta().saca(300);
		
		//java.lang.IllegalStateException
/*		Tarefa f = new Tarefa();
		f.start();
		f.start();
*/		
		new BlocoEstatico();
	}
}

class Tarefa {
	boolean rodando = false;
	void start() {
		if (rodando) {
			throw new IllegalStateException();
		}
		rodando = true;
	}
	void top() {
		rodando = false;
	}
}

class NovaConta {
	double saldo = 100;
	
	public void saca(double valor) {
		if (saldo < valor) {
			throw new IllegalArgumentException();
		}
		saldo -= valor;
	}
}

class BlocoEstatico {
	static {
		
	}
}