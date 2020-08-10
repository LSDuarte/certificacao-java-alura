package br.com.alura.basico;

/**
 * @author LSDuarte
 *
 */
public class VariavelDeInstancia {
	
	// nomes: VARI�VEIS DE INSTANCIA, VARI�VEIS DE OBEJTOS, ATRIBUTO OU MEMBRO
	
	// Vari�veis de instancia n�o podem ser acessados por m�todos staticos 

	// Vari�vel de instancia � declarada na Classe, e pode ser acessada em qualquer lugar dentro do meu objeto, dentro da classe, desde que esteja instanciado.
	String curso = "Variavel de Instancia";  
	
	// Posso referenciar uma variavel de instancia em outra variavel de instancia.
	String cursoCompleto = curso + " | Certifica��o Java";

	public VariavelDeInstancia() {
		// no construtor s� consigo acessar a vari�vel NOME, porque � uma variavel de instancia
		System.out.println(curso); 
	}
	
	private void m1() {
		// s� consigo acessar a vari�vel NOME, porque � uma variavel de instancia
		System.out.println(cursoCompleto);
	}
	
	public static void main(String[] args) {
		VariavelDeInstancia instancia = new VariavelDeInstancia();
		instancia.m1();
		
		// Posso tamb�m acessar a vari�vel de instancia  atraves da propria INSTANCIA 
		instancia.curso = "Estudando para Certifica��o";
		System.out.println(instancia.curso);
	}

}