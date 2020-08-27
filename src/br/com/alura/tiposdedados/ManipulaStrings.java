package br.com.alura.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class ManipulaStrings {

	public static void main(String[] args) {

		String nomeDireto = "Java";
		String nomeIndireto = new String("Java");
		
		char[] nome = new char[] {'J','a','v','a','b','c','e'};
		String nome1 = new String(nome);
		
		StringBuilder sb1 = new StringBuilder("Java");
		String nome2 = new String(sb1);
		
		
		String nomeNulo = null;
		
		String nomeDaProva = "Certifica��o" + " " + "Java";
		String nomeDaProvaComNulo = nomeDaProva + " " + nomeNulo;
		System.out.println(nomeDaProva);
		System.out.println(nomeDaProvaComNulo); // transforma 
		
		//System.out.println(nomeNulo.toString()); // erro, nullpointer
		System.out.println(" -------------------------------------------------  ");
		// concatena numeros
		System.out.println("Certifica��o " + 1500);
		System.out.println(1500 + " Certifica��o");	// cancatena��o
		System.out.println(15 + 00 + " Certifica��o"); // primeiro a soma, depois concatena��o
		System.out.println(1 + 500 + " Certifica��o"); // soma depois concatena
		
		System.out.println(" -------------------------------------------------  ");
		
		System.out.println(15 + (00 + " Certifica��o")); // � necessario () para separar as ordem de prioridade
		System.out.println(1 + (500 + " Certifica��o")); // 
		
		System.out.println(15 + (0 + (0 + " Certifica��o"))); // � necessario () para separar as ordem de prioridade
		
		System.out.println(" -------------------------------------------------  ");
		
		
		String s = "java";
		s.toUpperCase();
		System.out.println(s);
		
		System.out.println(s.toUpperCase());
		s = s.toUpperCase(); // atualizou a referencia
		System.out.println(s);
		
		s = s.toLowerCase(); // atualizou a referencia
		System.out.println(s);
		
		System.out.println(" -------------------------------------------------  ");	
		// verifica a posi��o do array, string
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		//System.out.println(s.charAt(4)); // n�o existe, posi��o invalida
		
		System.out.println(" -------------------------------------------------  ");
		
		System.out.println(s.length()); // metodo length() informa o tamanho do array
		System.out.println(s.isEmpty()); // metodo retorna se � vazio, true ou false

		System.out.println(" -------------------------------------------------  ");
		
		System.out.println("     Certifica��o Java     "); // varios espa�os
		System.out.println("     Certifica��o Java     ".trim()); // metodo tira os espa�os da esquerda e direita
		
		System.out.println(" -------------------------------------------------  ");
	
		s = s.toUpperCase();
		System.out.println(s.replace('V', 'C')); // substitui a letra por outra, lembrando que ele devolve uma nova string, n�o modifica a original.
		System.out.println(s.replace("JA", "VA")); // substitui  string
		
		System.out.println(" -------------------------------------------------  ");
		
		String parseado1 = "     quero tirar um certificado oficial java!    ";
		String parseado2 = "     quero tirar um certificado oficial java!    ".toUpperCase().trim();
		System.out.println(parseado1);
		System.out.println(parseado2);
		
		System.out.println(" -------------------------------------------------  ");
		
		String java = "Java";
		System.out.println(java.substring(1)); // devolve partes da string, dependnedo da posi��o que voc� escolhe 0,1,2,3
		System.out.println(java.substring(2));
		System.out.println(java.substring(3));
		System.out.println(java.substring(0));
		
		System.out.println(" -------------------------------------------------  ");
		
		System.out.println("Java".equals("java")); // compara caracter por caracter se � igual >>> false
		System.out.println("Java".equalsIgnoreCase("java")); // ignorar maiusculo de minusculo >>> true
		
		System.out.println(" -------------------------------------------------  ");
		
		System.out.println("Certifica��o".compareTo("Arnaldo")); // verifica posi��o do alfabeto, se � antes, positivo, se depois do "C" negativo
		System.out.println("Certifica��o".compareTo("Certifica��o")); // devolve 0 se for a mesma coisa
		System.out.println("Certifica��o".compareTo("Beneficio")); // devolve positivo se for antes do que est� comparando
		System.out.println("Certifica��o".compareTo("Gr�cia")); // devolve nagativo se estiver vindo depois do que est� comparando.
		System.out.println("");
		
		System.out.println("Certifica��o".compareTo("certifica��o")); // comparando se s�o iguais  >>> minusculo vem antes de maiusculo
		System.out.println("Certifica��o".compareToIgnoreCase("certifica��o")); // comparando se s�o iguais com ignorecase (maiusculo de minusculo)
		
		
		System.out.println(" -------------------------------------------------  ");
		
		// informa a localiza��o da posi��o do texto
		
		String texto = "Pretendo fazer a prova de certifica��o de Java";
		System.out.println(texto.indexOf("Pretendo"));
		System.out.println(texto.indexOf("Java"));
		System.out.println(texto.indexOf("certifica��o"));
		System.out.println(texto.indexOf("a"));
		System.out.println(texto.indexOf("fazer"));
		System.out.println(texto.indexOf("de"));
		System.out.println("");
		
		System.out.println(texto.indexOf("Pretendo")); // se existe devolve positivo
		System.out.println(texto.indexOf("Pretendia")); // se n�o existe devolve negativo
		System.out.println("");
		
		System.out.println(texto.lastIndexOf("a")); // antes
		System.out.println(texto.lastIndexOf("Pretendia")); // retorna -1 pois n�o existe
		
		System.out.println(texto.indexOf("e",7)); 
		
		System.out.println(texto.startsWith("Pretendia"));
		System.out.println(texto.startsWith("Pretendo"));
		System.out.println("");
		
		System.out.println(texto.endsWith("Jave"));
		System.out.println(texto.endsWith("Java"));
	}

}