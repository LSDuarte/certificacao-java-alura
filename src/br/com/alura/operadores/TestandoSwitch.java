package br.com.alura.operadores;

public class TestandoSwitch {

	public static void main(String[] args) {

		int opcao = 1;
		
		switch (opcao) {
		case 1:
			System.out.println("Primeira Opção");
			break;
		case 2:
			System.out.println("Segunda Opção");
			break;	
		case 3:
			System.out.println("Terceira Opção");
			break;	
			
		default:
			break;
		}
		
		//14,76
		int opcao2 = 1;
		// só é aceito variavel no case, se for FINAL 
		final int variavel = 2;
		switch (opcao2) {
		case variavel:
			System.out.println("Primeira Opção");
			break;
		case 1:
			System.out.println("Segunda Opção");
			break;	
		case 3:
			System.out.println("Terceira Opção");
			break;	
			// Não importa a ordem, o default só irá executar se não tiver nenhuma das opções no CASE
		default:
			break;
		}
	}

}