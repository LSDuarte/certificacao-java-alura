package br.com.alura.tiposdedados;

import br.com.alura.basico.Pessoa;

/**
 * @author LSDuarte
 *
 */
public class ChamadaDeMetodos {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Larissa",23); // invocando método passando argumentos
		
		String nome = pessoa.getNome(); // invocando metodo, pegando informação, devolve algo // referenciar atraves de uma nova variavel
		int idade = pessoa.getIdade();
		
		
		System.out.println("Nome: " + nome + ", Idade: " + idade);
		System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
		
	}

}