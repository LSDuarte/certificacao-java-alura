package br.com.alura.operadores;

public class TestaOperadoresLogicos {
	
	public static boolean metodo(String msg) {
		System.out.println(msg);
		return true;
	}

	public static void main(String[] args) {

		// validar ambos as senten�as
		System.out.println(1 == 1 & 1 > 2); // e
		System.out.println(1 == 1 | 1 > 2); // ou
		System.out.println(1 == 1 ^ 1 > 2); // ou exclusivo  // n�o existe OU EXCLUSIVO EM SHORT CIRCUIT
		System.out.println(!(1 == 1)); // nega a senten��o, se for TRUE >> FALSE
		System.out.println("------------------------------------");
		System.out.println("");
		
		// quando sei o resultado, n�o importa o lado da direita ### short circuit
		System.out.println(1 != 1 && 1 > 2); // e
		System.out.println(1 == 1 || 1 > 2); // ou
		System.out.println("------------------------------------");
		System.out.println("");
		
		// exemplo de && e || = caso a primeira valida��o seja verdadeiro ou false, ele n�o executa a segunda parte
		System.out.println(1 == 1 && metodo("primeiro")); // e
		System.out.println(1 != 1 && metodo("segundo")); // ou
		System.out.println(1 == 1 || metodo("terceiro")); // ou exclusivo
		System.out.println("------------------------------------");
		System.out.println("");
		
		// dessa forma ele valida as duas partes, e imprime ambos 
		System.out.println(1 == 1 & metodo("primeiro")); // e
		System.out.println(1 != 1 & metodo("segundo")); // ou
		System.out.println(1 == 1 | metodo("terceiro")); // ou exclusivo
	}

}