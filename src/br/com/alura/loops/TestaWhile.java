package br.com.alura.loops;

public class TestaWhile {

	public static void main(String[] args) {

		int i = 1;
		
		//pode entrar em loop infinito - booleana - primeiro faz verifica��o da condi��o  
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		while (i < 10) 
			System.out.println(i++); //APENAS ESSA LINHA DO C�DIGO � DO WHILE, QUALQUER OUTRA DEPOIS, N�O PERTENCE.

		
		// entra em loop infinito
	//	final boolean verdadeiro = true;
	//	while (verdadeiro) {
	//		System.out.println(i++);
	//	}
		
		// ### WHILE ###
		// PRIMEIRO EXECUTA A CONDI��O DEPOIS O C�DIGO
		// ELE PODE ENTRAR EM LOOPING INFINITO
		// AS CHAVES S�O OPCIONAIS
		// 
		
		
	}

}