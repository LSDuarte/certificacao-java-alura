package br.com.alura.conteudoalemdaprova;

import java.util.Date;

import br.com.alura.basico.Endereco;
import br.com.alura.basico.Pessoa;
import static br.com.alura.basico.Util.TAMANHO;
import static br.com.alura.basico.Util.maior;
/**
 * @author LSDuarte
 *
 */
public class Pedido {

	// UMA CLASSE COM VISIBILIDADE DEFAULT SÓ PODE SER ACESSADA DENTRO DO MESMO	PACOTE.

	// alura.basico.Pessoa cliente;
	Pessoa cliente;
	Endereco endereco;
	Date dataDeCriacao;
	java.sql.Date dataDeFinalizacao; // dessa forma consigo utilizar tanto o date do util.date, quanto java.sql.Date
	
	public Pessoa getCliente() {
		return cliente;
	}
	
	public void calculaTudo() {
		int t = TAMANHO;
		maior(10, 5);
	}
}