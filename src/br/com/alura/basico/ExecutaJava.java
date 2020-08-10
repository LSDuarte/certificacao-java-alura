package br.com.alura.basico;

/**
 * @author LSDuarte
 *
 */
public class ExecutaJava {

	// Toda classe chamada na linha de comando deve possuir o m�todo main

	// JAVAC Nome_do_Arquivo.java  >> JAVAC PARA COMPILAR
	// JAVA Nome_da_Classe		  >> JAVA (metodo main)
	
	// O m�todo MAIN deve ser PUBLIC STATIC VOID MAIN, sen�o da erro pois o arquivo n�o � achado
	// TEM QUE SER PUBLIC
	// TEM QUE SER STATIC
	// TEM QUE TER RETORNO VOID
	// TEM QUE SER UM ARRAY DE STRING  (STRING[] ARGS) OU (STRING... ARGS) *VAR ARGS
	
	// NOME DA VARIAVEL DE PARAMETRO PODE SER ALTERADA, N�O INFLUENCIA NA CHAMADA DO M�TODO.
	
									//args
	public static void main(String[] params) {

		System.out.println("rodando programa");
		System.out.println(params.length); // tamanho do arrays
		
		for (int i = 0; i < params.length; i++) {
			System.out.println(i + " >= " + params[i]);
		}
	}

}