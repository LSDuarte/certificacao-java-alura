package br.com.alura.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class TiposDeVariaveis {

	public static void main(String[] args) {

		System.out.println("###### TIPOS DE VARIAVEIS ######");

		int idade; // variavel n�o inicializada - erro de compila��o
		int idade2 = 0; // � necess�rio a inicializa��o de variavel local;

		System.out.println(idade2);

		if (args.length > 10) {
			idade = 15;
		} else {
			System.out.println("fa�a outra coisa");
		}

		// variavel do tipo membro, n�o precisa ser inicializada;
		Carro carro = new Carro();
		System.out.println("Valor Inteiro: " + carro.ano); // inicializa��o padr�o, 0
		System.out.println("Valor Char: " + carro.primeiraLetra); // char � igual == 0, por�m n�o aparece;
		System.out.println(carro.primeiraLetra == 0); // char � igual == 0, por�m n�o aparece; padr�o java, char � um valor numerico. - tudo que � compativel com tipo numerico, padr�o � 0
		System.out.println(carro.usado); // padr�o de inicializa��o da variavel, � FALSE.
		System.out.println(carro.motor); // valor de um referencia no java, por padr�o � NULL
		System.out.println(carro.marca); // String � uma referencia a objeto String, ent�o o valor padr�o tamb�m � NULL
		
		// essas variaveis com inicializa��o padr�o s�o aplicadas em variaveis membros, de instancia, de objetos, padr�o.
		
		// tamb�m padr�o de inicializa��o, 0
		int [] valores = new int[10];
		System.out.println(valores[0]);
		
		// tamb�m padr�o de inicializa��o, false
		boolean [] valoresBoolean = new boolean[10];
		System.out.println(valoresBoolean[0]);
		
		// tamb�m padr�o de inicializa��o, Null
		String [] valoresString = new String[10];
		System.out.println(valoresString[0]);
		
		// ## NEW INT [5] >>> 0
		// ## NEW BOLLEAN [5] >>> FALSE
		// ## NEW OBJECT [5] >>> NULL
	}

}

class Carro {
	int ano;
	char primeiraLetra;
	boolean usado;
	Motor motor;
	String marca;
}

class Motor {
	
}