package alura.basico;

/**
 * @author LSDuarte
 *
 */
public class VariavelStaticas {

	public static void main(String[] args) {

		// ### VARI�VEIS EST�TICAS PODEM SER ACESSADAS ATRAV�S DE QUALQUER ESCOPO ###
		
		// ### - NameDoTipo.vari�vel ###
		// ### - instancia.vari�vel ###
		
		// pode acessar uma variavel statica atraves de uma instancia " Pessoa p = new Pessoa(); "
		// existe uma �nica variavel statica para todos os objetos daquela classe.
		// se eu criar 5 pessoas diferentes, ser� apenas 1 variavel static ID 
		
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa.id); // pode acessar pela instancia
		System.out.println(Pessoa.id); // pode acessar diretamente da CLASSE por se tratar de uma variavel static 
		
		pessoa.metodo(); // acessando o m�todo da instancia
		Pessoa.metodo(); // acessando o m�todo diretamente da classe.
		
	}

}