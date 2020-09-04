package br.com.alura.operadores;

public class TestaComparacaoString2 {

	public static void main(String[] args) {

		String ab = "a" + "b"; // concatenado literal da um literal
		System.out.println(ab == "ab"); // 
		
		String c = "c"; 
		String abc = "a" + "b" + c; //envolve referencia de C, vai gerar um novo objeto
		System.out.println(abc == "abc"); // resultado falso, pois são objetos diferentes na memoria.
		
		System.out.println(abc.equals("abc")); // forma correta.
		
		String texto = "um texto qualquer";
		String txt = texto.substring(3,8); // texto - result do substring
		System.out.println(txt == "texto");
		
		System.out.println(txt.equals("texto"));
		System.out.println(texto.toLowerCase() == texto); // java percebe que não foi alterado o objeto, então ele devolve o mesmo objeto.
		System.out.println(texto.toString() == texto); // toString transforma para String, porém está comparando com uma string, então é TRUE
		
		
		
	}

}