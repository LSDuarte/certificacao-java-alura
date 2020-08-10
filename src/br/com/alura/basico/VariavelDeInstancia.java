package br.com.alura.basico;

/**
 * @author LSDuarte
 *
 */
public class VariavelDeInstancia {
	
	// nomes: VARIÁVEIS DE INSTANCIA, VARIÁVEIS DE OBEJTOS, ATRIBUTO OU MEMBRO
	
	// Variáveis de instancia não podem ser acessados por métodos staticos 

	// Variável de instancia é declarada na Classe, e pode ser acessada em qualquer lugar dentro do meu objeto, dentro da classe, desde que esteja instanciado.
	String curso = "Variavel de Instancia";  
	
	// Posso referenciar uma variavel de instancia em outra variavel de instancia.
	String cursoCompleto = curso + " | Certificação Java";

	public VariavelDeInstancia() {
		// no construtor só consigo acessar a variável NOME, porque é uma variavel de instancia
		System.out.println(curso); 
	}
	
	private void m1() {
		// só consigo acessar a variável NOME, porque é uma variavel de instancia
		System.out.println(cursoCompleto);
	}
	
	public static void main(String[] args) {
		VariavelDeInstancia instancia = new VariavelDeInstancia();
		instancia.m1();
		
		// Posso também acessar a variável de instancia  atraves da propria INSTANCIA 
		instancia.curso = "Estudando para Certificação";
		System.out.println(instancia.curso);
	}

}