package br.com.alura.operadores;

public class TestaComparacaoString2 {

	public static void main(String[] args) {

		String ab = "a" + "b"; // concatenado literal da um literal
		System.out.println(ab == "ab"); // 
		
		String c = "c"; 
		String abc = "a" + "b" + c; //envolve referencia de C, vai gerar um novo objeto
		System.out.println(abc == "abc"); // resultado falso, pois s�o objetos diferentes na memoria.
		
		System.out.println(abc.equals("abc")); // forma correta.
		
		String texto = "um texto qualquer";
		String txt = texto.substring(3,8); // texto - result do substring
		System.out.println(txt == "texto");
		
		System.out.println(txt.equals("texto"));
		System.out.println(texto.toLowerCase() == texto); // java percebe que n�o foi alterado o objeto, ent�o ele devolve o mesmo objeto.
		System.out.println(texto.toString() == texto); // toString transforma para String, por�m est� comparando com uma string, ent�o � TRUE
		
		
		
	}

}