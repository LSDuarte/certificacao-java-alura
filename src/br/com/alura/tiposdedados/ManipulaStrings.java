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
		
		String nomeDaProva = "Certificação" + " " + "Java";
		String nomeDaProvaComNulo = nomeDaProva + " " + nomeNulo;
		System.out.println(nomeDaProva);
		System.out.println(nomeDaProvaComNulo); // transforma 
		
		//System.out.println(nomeNulo.toString()); // erro, nullpointer
		System.out.println(" -------------------------------------------------  ");
		// concatena numeros
		System.out.println("Certificação " + 1500);
		System.out.println(1500 + " Certificação");	// cancatenação
		System.out.println(15 + 00 + " Certificação"); // primeiro a soma, depois concatenação
		System.out.println(1 + 500 + " Certificação"); // soma depois concatena
		
		System.out.println(" -------------------------------------------------  ");
		
		System.out.println(15 + (00 + " Certificação")); // é necessario () para separar as ordem de prioridade
		System.out.println(1 + (500 + " Certificação")); // 
		
		System.out.println(15 + (0 + (0 + " Certificação"))); // é necessario () para separar as ordem de prioridade
		
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
		// verifica a posição do array, string
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		//System.out.println(s.charAt(4)); // não existe, posição invalida
		
		System.out.println(" -------------------------------------------------  ");
		
		System.out.println(s.length()); // metodo length() informa o tamanho do array
		System.out.println(s.isEmpty()); // metodo retorna se é vazio, true ou false

		System.out.println(" -------------------------------------------------  ");
		
		System.out.println("     Certificação Java     "); // varios espaços
		System.out.println("     Certificação Java     ".trim()); // metodo tira os espaços da esquerda e direita
		
		System.out.println(" -------------------------------------------------  ");
	
		s = s.toUpperCase();
		System.out.println(s.replace('V', 'C')); // substitui a letra por outra, lembrando que ele devolve uma nova string, não modifica a original.
		System.out.println(s.replace("JA", "VA")); // substitui  string
		
		System.out.println(" -------------------------------------------------  ");
		
		String parseado1 = "     quero tirar um certificado oficial java!    ";
		String parseado2 = "     quero tirar um certificado oficial java!    ".toUpperCase().trim();
		System.out.println(parseado1);
		System.out.println(parseado2);
		
		System.out.println(" -------------------------------------------------  ");
		
		String java = "Java";
		System.out.println(java.substring(1)); // devolve partes da string, dependnedo da posição que você escolhe 0,1,2,3
		System.out.println(java.substring(2));
		System.out.println(java.substring(3));
		System.out.println(java.substring(0));
		
		System.out.println(" -------------------------------------------------  ");
		
		System.out.println("Java".equals("java")); // compara caracter por caracter se é igual >>> false
		System.out.println("Java".equalsIgnoreCase("java")); // ignorar maiusculo de minusculo >>> true
		
		System.out.println(" -------------------------------------------------  ");
		
		System.out.println("Certificação".compareTo("Arnaldo")); // verifica posição do alfabeto, se é antes, positivo, se depois do "C" negativo
		System.out.println("Certificação".compareTo("Certificação")); // devolve 0 se for a mesma coisa
		System.out.println("Certificação".compareTo("Beneficio")); // devolve positivo se for antes do que está comparando
		System.out.println("Certificação".compareTo("Grécia")); // devolve nagativo se estiver vindo depois do que está comparando.
		System.out.println("");
		
		System.out.println("Certificação".compareTo("certificação")); // comparando se são iguais  >>> minusculo vem antes de maiusculo
		System.out.println("Certificação".compareToIgnoreCase("certificação")); // comparando se são iguais com ignorecase (maiusculo de minusculo)
		
		
		System.out.println(" -------------------------------------------------  ");
		
		// informa a localização da posição do texto
		
		String texto = "Pretendo fazer a prova de certificação de Java";
		System.out.println(texto.indexOf("Pretendo"));
		System.out.println(texto.indexOf("Java"));
		System.out.println(texto.indexOf("certificação"));
		System.out.println(texto.indexOf("a"));
		System.out.println(texto.indexOf("fazer"));
		System.out.println(texto.indexOf("de"));
		System.out.println("");
		
		System.out.println(texto.indexOf("Pretendo")); // se existe devolve positivo
		System.out.println(texto.indexOf("Pretendia")); // se não existe devolve negativo
		System.out.println("");
		
		System.out.println(texto.lastIndexOf("a")); // antes
		System.out.println(texto.lastIndexOf("Pretendia")); // retorna -1 pois não existe
		
		System.out.println(texto.indexOf("e",7)); 
		
		System.out.println(texto.startsWith("Pretendia"));
		System.out.println(texto.startsWith("Pretendo"));
		System.out.println("");
		
		System.out.println(texto.endsWith("Jave"));
		System.out.println(texto.endsWith("Java"));
	}

}