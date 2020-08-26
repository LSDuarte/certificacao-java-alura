package br.com.alura.tiposdedados;

public class ManipulaDados {

	public static void main(String[] args) {

		// espa�o para colocar uma string dentro // � mutavel, conteudo dentro pode mudar de valor.
		StringBuffer buffer = new StringBuffer(); // sem construtor, devolve string vazia
		System.out.println(buffer.toString());
		
		StringBuffer buffer2 = new StringBuffer("JavaCertificacao");
		System.out.println(buffer2.toString());
		
		// adiciona informa��o - string
		buffer2.append(" - ");
		buffer2.append("Ensino e Inova��o");
		System.out.println(buffer2.toString());
		
		// pode limitar 
		StringBuffer buffer3 = new StringBuffer(50);
		System.out.println(buffer3);
		
		System.out.println("------------------------------------------------------------------------");
		
		StringBuffer buffer4 = new StringBuffer(buffer2);
		buffer4.append(" e Alura e Casa do C�digo");
		System.out.println(buffer4);
		buffer4.append('x');
		buffer4.append(buffer2);
		System.out.println(buffer4);
		
		// diferen�a entre StringBuffer e StringBuilder � que o StringBuffer � de uma vers�o antiga do java, por�m ainda � usada, mais usado o StringBuilder por s
		
		// METODO APPEND >>> CONCATENA STRING
		buffer4.append(new Carros());
		System.out.println(buffer4);
		
		// METODO INSERT >>> INSERE STRING NA POSI��O INFORMADA, 7 (POSI��O) , "Ensino e " String
		StringBuilder builder = new StringBuilder("Java - Certifica��o");
		builder.insert(7, "Ensino e ");
		System.out.println(builder);
		
		// METODO DELETE >>> DELETA OU REMOVE PARTES DA STRING, PEDINDO POSI��O INICIAL E FINAL
		builder.delete(6, 15);
		System.out.println(builder);
		
		// METODO REVERSE >>> INVERTE AS LETRAS
		System.out.println(new StringBuffer("Larissa").reverse());
		
		// METODO SUBSTRING >> N�O MODIFICA A STRING, S� APRESENTA A POSI��I SOLICITADA
		StringBuilder builder2 = new StringBuilder("Java - Certifica��o");
		// METODO SUBSTRING E SUBSEQUENCE TEM O MESMO COMPORTAMENTO
		System.out.println(builder2.substring(6,15));
		System.out.println(builder2.subSequence(6,15));
		
	}

}