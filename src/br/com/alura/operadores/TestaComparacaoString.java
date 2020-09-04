package br.com.alura.operadores;

public class TestaComparacaoString {

	public static void main(String[] args) {

		String nome1 = new String("Java");
		String nome2 = new String("Java");
		
		System.out.println(nome1 == nome2); // falso porque == ir� comparar se as duas referencias s�o iguais, objetos, mesmo objetos
		
		String nome3 = "Java";
		String nome4 = "Java";
		
		System.out.println(nome3 == nome4); // o java aponta para o mesmo lugar, apenas 1 string criada na memoria. "" | com new ele cria um novo objeto na memoria
		System.out.println(nome3 == nome1);
		
		System.out.println(nome1.equals(nome3)); // forma correta de compara��o de string
	}

}