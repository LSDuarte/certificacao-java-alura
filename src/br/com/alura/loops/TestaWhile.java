package br.com.alura.loops;

public class TestaWhile {

	public static void main(String[] args) {

		int i = 1;
		
		//pode entrar em loop infinito - booleana - primeiro faz verificação da condição  
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		while (i < 10) 
			System.out.println(i++); //APENAS ESSA LINHA DO CÓDIGO É DO WHILE, QUALQUER OUTRA DEPOIS, NÃO PERTENCE.

		
		// entra em loop infinito
	//	final boolean verdadeiro = true;
	//	while (verdadeiro) {
	//		System.out.println(i++);
	//	}
		
		// ### WHILE ###
		// PRIMEIRO EXECUTA A CONDIÇÃO DEPOIS O CÓDIGO
		// ELE PODE ENTRAR EM LOOPING INFINITO
		// AS CHAVES SÃO OPCIONAIS
		// 
		
		
	}

}