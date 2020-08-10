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
		String cursoNome = "Certifica��o Java";
		return cursoNome;
	}
	
	// variaveis com mesmo nome de Classe
	String ClassePessoa;
	
	// n�o h� conflito com nome de variavel, metodo com o nome da classe.
	
	// POSSIVEL PEGADINHA.
	
	// metodo retorna void, o construtor nada.
	void ClassePessoa(){}
	
	// construtor
	ClassePessoa(){}
	
	// um arquivo java pode ter v�rios tipos definidos.
	// � permitido apenas 1 classe publica e o nome deve ser igual ao arquivo
	// variaveis
	
	//variaveis de classe, estaticas, apenas 1 variavel
	static int totalDePessoas = 0;
	
	// metodos
	// metodo de instancia, metodo normal, metodo estatico (metodo main)
	
	// construtores
	// n�o se fala nome de retorno,
	// sempre o mesmo nome que a classe, 
	
	// interfaces
	// possui variaveis e metodos
	// variaveis finais
	
	// se for publico, tem que ter o mesmo nome do arquivo para facilitar ser achado
	
	interface A {
		// variavel por padr�o estatica
		public static final int TAMANHO = 5; // independente se for minuscula, continua sendo uma variavel final, n�o pode ser alterada.
		
		// por padr�o � abstrato
		public abstract void autentica(String nome, String senha);
		
		// se n�o por nada disso a cima, por padr�o a variavel � static, e por padr�o o m�todo e abstract, tamb�m � final 
		// n�o se pode alterar uma variavel FINAL, n�o compila (cair em prova)
	}
	
	// posso ter v�rias classes, v�rias interfaces dentro de um arquivo JAVA.
	
	
	// ### UM ARQUIVO JAVA, V�RIOS TIPOS - OK ###
	// ### UM ARQUIVO JAVA, UM �NICO P�BLICO - OK ###
	// ### UM ARQUIVO JAVA, P�BLICO COM NOME DO ARQUIVO - OK ###
	
	// ### UM ARQUIVO JAVA, V�RIOS P�BLICO - ERRADO ###
	// ### UM ARQUIVO JAVA, P�BLICO NOME DIFERENTE - ERRADO###
	
	
}