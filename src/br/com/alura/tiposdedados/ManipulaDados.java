package br.com.alura.tiposdedados;

public class ManipulaDados {

	public static void main(String[] args) {

		// espaço para colocar uma string dentro // é mutavel, conteudo dentro pode mudar de valor.
		StringBuffer buffer = new StringBuffer(); // sem construtor, devolve string vazia
		System.out.println(buffer.toString());
		
		StringBuffer buffer2 = new StringBuffer("JavaCertificacao");
		System.out.println(buffer2.toString());
		
		// adiciona informação - string
		buffer2.append(" - ");
		buffer2.append("Ensino e Inovação");
		System.out.println(buffer2.toString());
		
		// pode limitar 
		StringBuffer buffer3 = new StringBuffer(50);
		System.out.println(buffer3);
		
		System.out.println("------------------------------------------------------------------------");
		
		StringBuffer buffer4 = new StringBuffer(buffer2);
		buffer4.append(" e Alura e Casa do Código");
		System.out.println(buffer4);
		buffer4.append('x');
		buffer4.append(buffer2);
		System.out.println(buffer4);
		
		// diferença entre StringBuffer e StringBuilder é que o StringBuffer é de uma versão antiga do java, porém ainda é usada, mais usado o StringBuilder por s
		
		// METODO APPEND >>> CONCATENA STRING
		buffer4.append(new Carros());
		System.out.println(buffer4);
		
		// METODO INSERT >>> INSERE STRING NA POSIÇÃO INFORMADA, 7 (POSIÇÃO) , "Ensino e " String
		StringBuilder builder = new StringBuilder("Java - Certificação");
		builder.insert(7, "Ensino e ");
		System.out.println(builder);
		
		// METODO DELETE >>> DELETA OU REMOVE PARTES DA STRING, PEDINDO POSIÇÃO INICIAL E FINAL
		builder.delete(6, 15);
		System.out.println(builder);
		
		// METODO REVERSE >>> INVERTE AS LETRAS
		System.out.println(new StringBuffer("Larissa").reverse());
		
		// METODO SUBSTRING >> NÃO MODIFICA A STRING, SÓ APRESENTA A POSIÇÃI SOLICITADA
		StringBuilder builder2 = new StringBuilder("Java - Certificação");
		// METODO SUBSTRING E SUBSEQUENCE TEM O MESMO COMPORTAMENTO
		System.out.println(builder2.substring(6,15));
		System.out.println(builder2.subSequence(6,15));
		
	}

}