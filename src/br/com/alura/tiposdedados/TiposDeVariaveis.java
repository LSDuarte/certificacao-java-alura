package br.com.alura.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class TiposDeVariaveis {

	public static void main(String[] args) {

		System.out.println("###### TIPOS DE VARIAVEIS ######");

		int idade; // variavel não inicializada - erro de compilação
		int idade2 = 0; // é necessário a inicialização de variavel local;

		System.out.println(idade2);

		if (args.length > 10) {
			idade = 15;
		} else {
			System.out.println("faça outra coisa");
		}

		// variavel do tipo membro, não precisa ser inicializada;
		Carro carro = new Carro();
		System.out.println("Valor Inteiro: " + carro.ano); // inicialização padrão, 0
		System.out.println("Valor Char: " + carro.primeiraLetra); // char é igual == 0, porém não aparece;
		System.out.println(carro.primeiraLetra == 0); // char é igual == 0, porém não aparece; padrão java, char é um valor numerico. - tudo que é compativel com tipo numerico, padrão é 0
		System.out.println(carro.usado); // padrão de inicialização da variavel, é FALSE.
		System.out.println(carro.motor); // valor de um referencia no java, por padrão é NULL
		System.out.println(carro.marca); // String é uma referencia a objeto String, então o valor padrão também é NULL
		
		// essas variaveis com inicialização padrão são aplicadas em variaveis membros, de instancia, de objetos, padrão.
		
		// também padrão de inicialização, 0
		int [] valores = new int[10];
		System.out.println(valores[0]);
		
		// também padrão de inicialização, false
		boolean [] valoresBoolean = new boolean[10];
		System.out.println(valoresBoolean[0]);
		
		// também padrão de inicialização, Null
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