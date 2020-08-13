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
		// this >> estou acessando o membro da instancia, n�o � necess�rio pois n�o h� outra variavel com o mesmo nome.
		ano = 2014;
	}

	public String getDadosDeImpressao() {
		return modelo + "::" + ano;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}