package alura.basico;

/**
 * @author LSDuarte
 *
 */
public class VariavelStaticas {

	public static void main(String[] args) {

		// ### VARIÁVEIS ESTÁTICAS PODEM SER ACESSADAS ATRAVÉS DE QUALQUER ESCOPO ###
		
		// ### - NameDoTipo.variável ###
		// ### - instancia.variável ###
		
		// pode acessar uma variavel statica atraves de uma instancia " Pessoa p = new Pessoa(); "
		// existe uma única variavel statica para todos os objetos daquela classe.
		// se eu criar 5 pessoas diferentes, será apenas 1 variavel static ID 
		
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa.id); // pode acessar pela instancia
		System.out.println(Pessoa.id); // pode acessar diretamente da CLASSE por se tratar de uma variavel static 
		
		pessoa.metodo(); // acessando o método da instancia
		Pessoa.metodo(); // acessando o método diretamente da classe.
		
	}

}