package br.com.alura.operadores;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LSDuarte
 *
 */
public class TestaOperadores {

	public static void main(String[] args) {

		int i = 15;
		long idade = 15;
		
		// ###  "=" operadores de atribuição
		// byte >> short >> int >> long
		// float >> double
		// char >> int
	
		int a = 10;
		long b = 20;
		short c = 3;
		byte d = 4;
		
		double e = 30.0;
		float f = 40.3f;
		
		double g = 40.3f;
		f = a;
		f = b;
		f = c;
		f = d;
		
		
		List<String> lista = new ArrayList<String>();
		List<String> lista2 = lista;
		
	}

}