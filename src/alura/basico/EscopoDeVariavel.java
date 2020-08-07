package alura.basico;

/**
 * @author LSDuarte
 *
 */
public class EscopoDeVariavel {

	// EXEMPLO METODO 1
	public void m1() {
		// variavel local dentro do m�todo, consigo imprimir pois est� no corpo do bloco de c�digo.
		int x = 10; 

		if (x >= 10) {
			int y = 50;
			// variavel y s� existe dentro do bloco "IF", caso eu tente imprimir fora desse bloco, o sistema dar� erro.
			System.out.println(y); 
		}
		System.out.println(x);
			
		// erro aqui pois a v�riavel Y s� existe dentro bloco IF acima.
//		System.out.println(y); 
		
		
		for (int i = 0, j = 0; i <= 10; i++)
			j++; //essa linha � o escopo do FOR
		// System.out.println(i); // variaveis s� disposiveis dentro do FOR (PEGADINHA)
		// System.out.println(j); // mesmo sem as chaves, e est�o implicitamente 
		}

	// EXEMPLO METODO 2
	public void m2(String nome) {
		// parametros tamb�m s�o variaveis locais. "String nome";
		System.out.println(nome);
	}
	
	// EXEMPLO METODO 3
	public void m3() {
		// variavel "NOME" n�o pode ser acessada porque ela fica visivel somente no bloco que foi definida.
		// System.out.println(nome); 
	}
	
	// EXEMPLO METODO 4
	public void m4(String nome) {
		System.out.println(nome);
		m3();
		System.out.println(nome);
	}	
	
	// EXEMPLO CONTRUTOR
	public EscopoDeVariavel(String nome) {
		System.out.println(nome);
		m3();
		System.out.println(nome);
	}	

	public static void main(String[] args) {
		//EscopoDeVariavel variavel = new EscopoDeVariavel();
		EscopoDeVariavel variavel = new EscopoDeVariavel("Teste");
		variavel.m1();
		variavel.m2("Certifica��o Java");
		variavel.m3();
		variavel.m4("Java Certifica��o");
	}

}