package br.com.alura.metodoseencapsulamento;

public class TestaContrutores {

	public static void main(String[] args) {

		// construtor padr�o, vazio.
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
		// inicializa��o j� foi inializada, por isso ele imprime
		System.out.println(i);
	}
	
	private void imprimeNome() {
		System.out.println(nome);
	}

	// construtor vazio - noem do construtor � igual ao nome da classe.
	A() {
		// pode entrar em loop infinito.
		// new A();
	}
	
	int tamanhoDoSobrenome() {
		return sobrenome.length(); // NULL (NullPointerException) � necessario inicializar antes do construtor, a ordem das declara��es fazem diferen�a
	}
	
	/*// se a classe � publica ou default, o construtor tamb�m ser�
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