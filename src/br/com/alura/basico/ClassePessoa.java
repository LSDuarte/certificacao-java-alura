package br.com.alura.basico;

public class ClassePessoa {

	// variaveis
	String nome;

	// construtor
	public ClassePessoa(String nome) {
		this.nome = nome;
	}
	
	// metodos
	public String getNome() {
		String cursoNome = "Certificação Java";
		return cursoNome;
	}
	
	// variaveis com mesmo nome de Classe
	String ClassePessoa;
	
	// não há conflito com nome de variavel, metodo com o nome da classe.
	
	// POSSIVEL PEGADINHA.
	
	// metodo retorna void, o construtor nada.
	void ClassePessoa(){}
	
	// construtor
	ClassePessoa(){}
	
	// um arquivo java pode ter vários tipos definidos.
	// é permitido apenas 1 classe publica e o nome deve ser igual ao arquivo
	// variaveis
	
	//variaveis de classe, estaticas, apenas 1 variavel
	static int totalDePessoas = 0;
	
	// metodos
	// metodo de instancia, metodo normal, metodo estatico (metodo main)
	
	// construtores
	// não se fala nome de retorno,
	// sempre o mesmo nome que a classe, 
	
	// interfaces
	// possui variaveis e metodos
	// variaveis finais
	
	// se for publico, tem que ter o mesmo nome do arquivo para facilitar ser achado
	
	interface A {
		// variavel por padrão estatica
		public static final int TAMANHO = 5; // independente se for minuscula, continua sendo uma variavel final, não pode ser alterada.
		
		// por padrão é abstrato
		public abstract void autentica(String nome, String senha);
		
		// se não por nada disso a cima, por padrão a variavel é static, e por padrão o método e abstract, também é final 
		// não se pode alterar uma variavel FINAL, não compila (cair em prova)
	}
	
	// posso ter várias classes, várias interfaces dentro de um arquivo JAVA.
	
	
	// ### UM ARQUIVO JAVA, VÁRIOS TIPOS - OK ###
	// ### UM ARQUIVO JAVA, UM ÚNICO PÚBLICO - OK ###
	// ### UM ARQUIVO JAVA, PÚBLICO COM NOME DO ARQUIVO - OK ###
	
	// ### UM ARQUIVO JAVA, VÁRIOS PÚBLICO - ERRADO ###
	// ### UM ARQUIVO JAVA, PÚBLICO NOME DIFERENTE - ERRADO###
	
	
}