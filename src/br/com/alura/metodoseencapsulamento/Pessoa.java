package br.com.alura.metodoseencapsulamento;

class Pessoa {

	// encapsular é esconder o que faço com minhas coisas
	private String nome; // variavel membro precisa ser private para ninguém acessar | esconder a variavel, e deixar disponivel apenas os metodos de acesso;
	
	// informacion raidon ou encapsulacion

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome == null) nome = "";
		this.nome = nome;
	}

}