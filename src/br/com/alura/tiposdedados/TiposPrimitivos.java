package br.com.alura.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class TiposPrimitivos {

	public static void main(String[] args) {

		System.out.println("#### TIPOS PRIMITIVOS NO JAVA ####");

		// ### tipos primitivos que não são referencias no Java
		byte a = 0;
		short b = 0;
		char c = 0;
		int i = 0;
		long e = 0;

		float f = 0;
		double g = 0;

		// ### é o unico tipo primitivo que não é considerado numérico
		boolean h = true;

		// ### pontos flutuante | os demais acima são inteiro.
		float ff = 0; // >> +/- infinito
		double gg = 0;

		// todos são positivos, e negativos.
		// ex: byte >>> -128 a +127

		// ## DECORAR SÓ O BYTE >>> -128 A + 127
		// ## CHAR = 0 ou + >>> sempre positivo

		// ## VALORES LITERAIS ##
		// ## int ano = 1993;
		// ## só tipos primitivos

		// VALOR LITERAL EX: BOOLEAN >> true OU false para palavra chaves, sempre
		// minusculo.

		long l = 13;
		long ll = 13L; // falar que o valor literal é Long, incluindo a letra L ou l após o valor
		long lll = 13l;

		double d = 13.1;
		double dd = 13.1D;
		double ddd = 13.1d;

		float fff = 13.1f;
		float ffff = 13.1F;

		// D, L & F... .DOUBLE, LONG OU FLOAT
		int ii = 0761; // representação OCTAL, na base 8 >> iniciando com o 0
		
		// valores corretos na base octal 0 à 7, 8 é invalido
		
		int ex = 0x55; // numero EXADECIMAL, 0 à 9, A,B,C,D,E,F >>> A = 10, A = 11; MAIUSCULO E MINUSCULO
		
		// VALOES BINARIOS
		int binario = 0b1;  // 0B minusculo ou maiusculo, só pode vir 0 ou 1

		// notação cienticia
		double d2 = 3.1E2;
		
		//PARA FLOAT PRECISA TER F 
		float f2 = 2e3f;
		
		long x2 = 1_234_567_891_234l; // undercor sempre entre numeros, "representando" uma conta bancaria, long pois int não cabe. entre os dois lados do _ é necessário ter um número nos dois lados.
		
		// 18min42s retornar video.
		
		int xx = 0xF_F; // pode ter "_" por que 0xFF é 255, se da um valor real, então pode.
	
		char ch = 66; // B  >>> 65 é "A"
		System.out.println(ch);
		
		// valor numero e caracter não é o mesmo
		char sete = 7;
		System.out.println(sete + " << -- aqui o valor");
		
		// carater unicod \ u 
		char omega = '\u03A9';
		System.out.println(omega + " << -- aqui o valor");
		
		// PALAVRAS RESERVADAS QUE NÃO PODEM SER USADAS.
		
		// public, system, true, boolean, out, char, int, etc
		
		// VALORES LITERAIS QUE NÃO PODEM USAR
		
		// true, false, e null >>> toda palavra reservada do JAVA é minuscula >>> DECORAR
	
		boolean bonitão = true; // ã pode!
		boolean ricão$$$; // pode
		boolean bonito_e_rico = false; // pode
		boolean bonitoERico;  // pode
		
		boolean _valor;
		boolean $valor; // valido
		
		// não é recomendado e nem usal, mas pode!
		
		// numero não pode!
		// boolean 8valor; 
		
		// case sensitive - Diferencia Maiusculo de Minusculo
		
		// variaveis distintas.
		int idade = 1;
		int IDADE = 2;
		int Idade = 3;
		
		// # não pode
		// int idade#preco = 1;
	}

}