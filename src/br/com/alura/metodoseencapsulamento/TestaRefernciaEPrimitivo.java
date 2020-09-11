package br.com.alura.metodoseencapsulamento;

public class TestaRefernciaEPrimitivo {

	public static void main(String[] args) {

		System.out.println(" ### PILHA ###");
		
		int i = 2; // cria um espaço na memoria.
		teste(i);
		System.out.println(i);
		
		System.out.println("-------------------------");
		int ii = 2;
		ii = teste2(ii);
		System.out.println(ii);
		
		System.out.println("-------------------------");
		
		Prova prova = new Prova();
		prova.tempo = 100;
		teste(prova);
		System.out.println(prova.tempo);
		
		System.out.println("-------------------------");
		teste2(prova);
		System.out.println(prova.tempo);
	}

	//metodo static
	static void teste(int i) {
		i = 5;
		System.out.println(i);
	}
	
	static int teste2(int i) {
		i = 5;
		System.out.println(i);
		return i;
	}
	
	// copiando a referencia
	static void teste(Prova prova) {
		prova.tempo = 210;
	}
	
	static void teste2(Prova prova) {
		prova = new Prova();
		prova.tempo = 520;
	}
	
}

class Prova {
	int tempo;
}