package br.com.alura.operadores;

public class TestandoSwitch {

	public static void main(String[] args) {

		int opcao = 1;
		
		switch (opcao) {
		case 1:
			System.out.println("Primeira Op��o");
			break;
		case 2:
			System.out.println("Segunda Op��o");
			break;	
		case 3:
			System.out.println("Terceira Op��o");
			break;	
			
		default:
			break;
		}
		
		//14,76
		int opcao2 = 1;
		// s� � aceito variavel no case, se for FINAL 
		final int variavel = 2;
		switch (opcao2) {
		case variavel:
			System.out.println("Primeira Op��o");
			break;
		case 1:
			System.out.println("Segunda Op��o");
			break;	
		case 3:
			System.out.println("Terceira Op��o");
			break;	
			// N�o importa a ordem, o default s� ir� executar se n�o tiver nenhuma das op��es no CASE
		default:
			break;
		}
	}

}