package br.com.alura.metodoseencapsulamento;

public class TestaSobreCargaConstrutores {

	public static void main(String[] args) {

		Livro l = new Livro();
		Livro ll = new Livro(258);
		Livro lll = new Livro("J","A","V","A");
		
	}

}

class Livro {
	
	// posso ter varios contrutores, porém com assinatura diferente
	// sobrecarga
	Livro(){
		System.out.println("Sem Argumentos");
	}
	
	Livro (int i) {
		// chamando construtor vazio ^
		this(valor()); // deve ser o primeiro a ser chamado, não pode ter 2;
		System.out.println("Construtor com Int");
	}
	
	Livro (String... s) {
		this();
		System.out.println("Com Strings");
	}
	
	static String valor() {
		return "xpto";
	}
	
	
}