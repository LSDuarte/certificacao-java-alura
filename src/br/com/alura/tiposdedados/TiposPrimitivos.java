package br.com.alura.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class TiposPrimitivos {

	public static void main(String[] args) {

		System.out.println("#### TIPOS PRIMITIVOS NO JAVA ####");

		// ### tipos primitivos que n�o s�o referencias no Java
		byte a = 0;
		short b = 0;
		char c = 0;
		int i = 0;
		long e = 0;

		float f = 0;
		double g = 0;

		// ### � o unico tipo primitivo que n�o � considerado num�rico
		boolean h = true;

		// ### pontos flutuante | os demais acima s�o inteiro.
		float ff = 0; // >> +/- infinito
		double gg = 0;

		// todos s�o positivos, e negativos.
		// ex: byte >>> -128 a +127

		// ## DECORAR S� O BYTE >>> -128 A + 127
		// ## CHAR = 0 ou + >>> sempre positivo

		// ## VALORES LITERAIS ##
		// ## int ano = 1993;
		// ## s� tipos primitivos

		// VALOR LITERAL EX: BOOLEAN >> true OU false para palavra chaves, sempre
		// minusculo.

		long l = 13;
		long ll = 13L; // falar que o valor literal � Long, incluindo a letra L ou l ap�s o valor
		long lll = 13l;

		double d = 13.1;
		double dd = 13.1D;
		double ddd = 13.1d;

		float fff = 13.1f;
		float ffff = 13.1F;

		// D, L & F... .DOUBLE, LONG OU FLOAT
		int ii = 0761; // representa��o OCTAL, na base 8 >> iniciando com o 0
		
		// valores corretos na base octal 0 � 7, 8 � invalido
		
		int ex = 0x55; // numero EXADECIMAL, 0 � 9, A,B,C,D,E,F >>> A = 10, A = 11; MAIUSCULO E MINUSCULO
		
		// VALOES BINARIOS
		int binario = 0b1;  // 0B minusculo ou maiusculo, s� pode vir 0 ou 1

		// nota��o cienticia
		double d2 = 3.1E2;
		
		//PARA FLOAT PRECISA TER F 
		float f2 = 2e3f;
		
		long x2 = 1_234_567_891_234l; // undercor sempre entre numeros, "representando" uma conta bancaria, long pois int n�o cabe. entre os dois lados do _ � necess�rio ter um n�mero nos dois lados.
		
		// 18min42s retornar video.
		
		int xx = 0xF_F; // pode ter "_" por que 0xFF � 255, se da um valor real, ent�o pode.
	
		char ch = 66; // B  >>> 65 � "A"
		System.out.println(ch);
		
		// valor numero e caracter n�o � o mesmo
		char sete = 7;
		System.out.println(sete + " << -- aqui o valor");
		
		// carater unicod \ u 
		char omega = '\u03A9';
		System.out.println(omega + " << -- aqui o valor");
		
		// PALAVRAS RESERVADAS QUE N�O PODEM SER USADAS.
		
		// public, system, true, boolean, out, char, int, etc
		
		// VALORES LITERAIS QUE N�O PODEM USAR
		
		// true, false, e null >>> toda palavra reservada do JAVA � minuscula >>> DECORAR
	
		boolean bonit�o = true; // � pode!
		boolean ric�o$$$; // pode
		boolean bonito_e_rico = false; // pode
		boolean bonitoERico;  // pode
		
		boolean _valor;
		boolean $valor; // valido
		
		// n�o � recomendado e nem usal, mas pode!
		
		// numero n�o pode!
		// boolean 8valor; 
		
		// case sensitive - Diferencia Maiusculo de Minusculo
		
		// variaveis distintas.
		int idade = 1;
		int IDADE = 2;
		int Idade = 3;
		
		// # n�o pode
		// int idade#preco = 1;
	}

}