package br.com.alura.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class Carro {

	String modelo;
	int ano;

	// construtor
	Carro() {
		ano = 2014;
	}

	// metodo
	void reseta() {
		// this >> estou acessando o membro da instancia, não é necessário pois não há outra variavel com o mesmo nome.
		ano = 2014;
	}

	public String getDadosDeImpressao() {
		return modelo + "::" + ano;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}