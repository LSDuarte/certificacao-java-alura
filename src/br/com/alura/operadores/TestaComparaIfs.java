package br.com.alura.operadores;

public class TestaComparaIfs {

	public static void main(String[] args) {

		boolean autentic = true;
				
		if (autentic) {
			System.out.println("Ok");
		}else {
			System.out.println("Não autorizado");
		}
			
		if ( 1 < 2) {
			System.out.println("Ok");
		}
		
		boolean valor = true;
		
		if (valor == false) {
			System.out.println("false");
		}
		
		if (valor) {
			System.out.println("false");
		}
		
		int a = 0, b =3;
		// tomar cuidado, atribuição = | == comparação
		if (a == b) {
			System.out.println("iguais");
		}
		
		if (valor = false) {
			System.out.println("false");
		}
		
		boolean v = true;
		
		if(v)
			System.out.println("true");
		else if ( valor) {
			System.out.println("false");
		} else if (!valor) {
			System.out.println("false");
		} else {
			System.out.println("so else");
		}
		
		
		if (autentic) 
			System.out.println("Ok");	
		else 
			System.out.println("Falhou");
			System.out.println("Tente novamente"); // não faz parte do else
	
			
		// ficar se olho na identação 	
		int valores = 100;
		if(valores > 200)
		if(valores < 200)	
		if(valores > 300)
			System.out.println("a");
		else
			System.out.println("b");
		else
			System.out.println("c");
	
	}

}