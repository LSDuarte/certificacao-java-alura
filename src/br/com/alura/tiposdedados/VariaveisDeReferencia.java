package br.com.alura.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class VariaveisDeReferencia {

	public static void main(String... args) {

		System.out.println("#### Variaveis de Referencia e Variaveis Primitivas ####");
		
		int a = 10;
		int b = a;
		
		a = a + 5; // A PASSA A VALER 15, enquanto B continua com a referencia de 10
		
		// ESTOU COPIANDO O VALOR DE A, E INSERINDO NA VARIAVEL B
		System.out.println(a); 
		System.out.println(b);
	
		System.out.println("------------------------------------------------------");
		
		ObjetoMeu meu = new ObjetoMeu();
		meu.valor = 10;
		ObjetoMeu meu2 = meu;
		
		System.out.println("Variavel Meu: " + meu.valor);
		System.out.println("Variavel Meu2: " + meu2.valor);
		
		meu.valor = meu.valor + 5;
		
		System.out.println("Variavel Meu: " + meu.valor);
		System.out.println("Variavel Meu2: " + meu2.valor);
		
		// REFERENCIAR É CRIAR UMA SETINHA DO OBJETO, DIFERENTE DA ATRIBUIÇÃO DE VALOR DO TIPO PRIMITIVO QUE É COPIAR
		// SÓ TEM UM OBJETO, NO CASO, O VALOR SERÁ O MESMO.
		
		// TIPO PRIMITIVO: COPIA VALOR
		// REFERENCIA: CRIA UMA NOVA REFERENCIA PARA O MESMO ##OBJETO##
		
	}

}

class ObjetoMeu {
	
	int valor;
	
}