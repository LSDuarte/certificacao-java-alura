package br.com.alura.tiposdedados;

public class ManipulaDados {

	public static void main(String[] args) {

		// espa�o para colocar uma string dentro // � mutavel, conteudo dentro pode mudar de valor.
		StringBuffer buffer = new StringBuffer(); // sem construtor, devolve string vazia
		System.out.println(buffer.toString());
		
		StringBuffer bufferr = new StringBuffer("JavaCertificacao");
		System.out.println(bufferr.toString());
		
		// adiciona informa��o - string
		bufferr.append(" - ");
		bufferr.append("Ensino e Inova��o");
		System.out.println(bufferr.toString());
		
		System.out.println("------------------------------------------------------------------------");
		
	}

}