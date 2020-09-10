package br.com.alura.metodoseencapsulamento;

public class TestaContrutores {

	public static void main(String[] args) {

		// construtor padrão, vazio.
		A a = new A();

		// compila
		A b = new A("Java");
		System.out.println(b.i);
		
		B c = new B("Java");
		
	}

}

class A {

	int i = 15;
	String nome;
	String sobrenome = "Silveira";
	int tamanho = tamanhoDoSobrenome();
	
	//construtor com argumento
	A(String nome) {
		imprimeNome(); // delicado chamar metodo dentro de construtor pois ele pode ser sobreescrito por outras classes.
		this.nome = nome;
		// inicialização já foi inializada, por isso ele imprime
		System.out.println(i);
	}
	
	private void imprimeNome() {
		System.out.println(nome);
	}

	// construtor vazio - noem do construtor é igual ao nome da classe.
	A() {
		// pode entrar em loop infinito.
		// new A();
	}
	
	int tamanhoDoSobrenome() {
		return sobrenome.length(); // NULL (NullPointerException) é necessario inicializar antes do construtor, a ordem das declarações fazem diferença
	}
	
	/*// se a classe é publica ou default, o construtor também será
	A() {
		// erdada do Object
		super();
	}*/

}


class B extends A {
	B(String s) {
		super(s);
	}

	void imprimeNome() {
		System.out.println(nome.length());
	}
}