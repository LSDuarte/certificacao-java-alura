package br.com.alura.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class LendoEscrevendoCamposObjetos {

	public static void main(String[] args) {
	
		Carro carro = new Carro();
		
		// . serve para acessar algum membro
		carro.modelo = "Palio";
		carro.setModelo("Palio 2");
		System.out.println(carro.getDadosDeImpressao());
		System.out.println(carro.ano);
		System.out.println(carro.modelo.length()); // pode dar um NullPointerException caso algum metodo esteja NULL
		
		// QUANDO QUERO ACESSAR VARIAVEIS (CAMOS, MENBROS, DE OBJETOS, DE INSTANCIA) DENTRO DE OBJETO.
		
		// THIS.VARIAVELMENBRO ( ACESSP EXPLÍCITO )
	}

}