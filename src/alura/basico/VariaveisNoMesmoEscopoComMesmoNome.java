package alura.basico;

/**
 * @author LSDuarte
 *
 */
public class VariaveisNoMesmoEscopoComMesmoNome {
	
	// não pode haver uma variavel static e uma variavel de instancia com o mesmo nome.
	
//	static int a;
//	int a;

	public static void main(String[] args) {

		// não pode haver duas váriaveis com mesmo nome no mesmo ESCOPO 
		// (Erro na linha 14 - Exception in thread "main" java.lang.Error: Unresolved compilation problem: Duplicate local variable a"
		
		int a = 1;
//		int a = 10;
		
		// Nome de variavel já declarada como parametro no método MAIN - public static void main(String[] args)
//		String args[] = null;
		
	}

}