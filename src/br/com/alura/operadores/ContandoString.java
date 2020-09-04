package br.com.alura.operadores;

public class ContandoString {

	public static void main(String[] args) {
	
		String h = new String("hello "); // 2 String criadas ( 1: NEW | Usando literal ("hello ") ) - apenas 1 foi para o POOL
		String h1 = "hello "; // J� existe no POOL, n�o se cria objeto, se faz referencia ao objeto criado acima - 0
		String w = "world"; // 1 criado novo objeto | colocado no POOL
		
		System.out.println("hello"); // j� existe no POOL, � reutilizado
		System.out.println(h1 + "world"); // 1 - concatena��o gera um novo objeto, literal "world" + variavel, cria-se uma nova String, e n�o vai no POOL
		System.out.println("Hello " == h1); // 1- Hello com H maiusculo, ent�o, se cria novo objeto, "FALSO" n�o � o mesmo objeto
		
		// TOTAL 5 OBJETOS STRING 
		
	}

}