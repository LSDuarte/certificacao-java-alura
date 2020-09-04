package br.com.alura.operadores;

public class ContandoString {

	public static void main(String[] args) {
	
		String h = new String("hello "); // 2 String criadas ( 1: NEW | Usando literal ("hello ") ) - apenas 1 foi para o POOL
		String h1 = "hello "; // Já existe no POOL, não se cria objeto, se faz referencia ao objeto criado acima - 0
		String w = "world"; // 1 criado novo objeto | colocado no POOL
		
		System.out.println("hello"); // já existe no POOL, é reutilizado
		System.out.println(h1 + "world"); // 1 - concatenação gera um novo objeto, literal "world" + variavel, cria-se uma nova String, e não vai no POOL
		System.out.println("Hello " == h1); // 1- Hello com H maiusculo, então, se cria novo objeto, "FALSO" não é o mesmo objeto
		
		// TOTAL 5 OBJETOS STRING 
		
	}

}