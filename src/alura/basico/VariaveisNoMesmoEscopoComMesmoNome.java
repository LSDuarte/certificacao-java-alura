package alura.basico;

/**
 * @author LSDuarte
 *
 */
public class VariaveisNoMesmoEscopoComMesmoNome {
	
	// n�o pode haver uma variavel static e uma variavel de instancia com o mesmo nome.
	
//	static int a;
//	int a;

	public static void main(String[] args) {

		// n�o pode haver duas v�riaveis com mesmo nome no mesmo ESCOPO 
		// (Erro na linha 14 - Exception in thread "main" java.lang.Error: Unresolved compilation problem: Duplicate local variable a"
		
		int a = 1;
//		int a = 10;
		
		// Nome de variavel j� declarada como parametro no m�todo MAIN - public static void main(String[] args)
//		String args[] = null;
		
	}

}