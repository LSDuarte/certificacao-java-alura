package br.com.alura.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class CicloDeVidaObjeto {

	public static void main(String[] args) {

		
		System.out.println("Quantos carros eu criei? " + 2);

		// 0 - nenhum, pois em nenhum momento eu instanciei o objeto. (Para criar um carro, � preciso chamar o construtor)
		Carro carro; 
		
		// 1 - Apenas 1 referencia do Objeto Carro (objeto que est� na memoria) foi colocada na variavel carro2 | s� consigo referenciar atrav�s da variavel carro2
//		Carross carross = new Carross();
		Carro carro2 = new Carro(); 
		
		// new Carro();  � o objeto que est� na memoria
		// Carro carro2 >> � a referencia que est� na variavel
		
		new Carro(); // +1 carro
		
		carro2.ano = 2014;
		carro2.modelo = "Ferrari";
//		carross.c1 = carro2;
		
		// OBJETO ANTERIOR SE TORNOU INACESS�VEL
		carro2 = new Carro(); // foi criado uma nova instancia de carro dentro da variavel anterior, logo a anterior perdeu a referencia e se tornou inacess�vel 
//		carross.c2 = carro2;
		
		
		System.out.println(carro2.ano);
		System.out.println(carro2.modelo);
		
	/*	carro2 = null;
		
		System.out.println(carro2.ano);
		System.out.println(carro2.modelo);
	*/
		
		// s� � acessivel no trecho de c�digo do IF, depois disso se torna inacess�vel
		if (15 > 10) {
			Carro carro3 = new Carro();
			carro3.ano = 2010;
		}
		
		// mesma coisa do for, ser� criado 10 carros, todos inacess�veis fora do escopo do c�digo, trecho...
		for (int i = 0; i < 10; i++) {
			Carro carro4 = new Carro();
		}
		
		// PEGADINHA
		// AINDA EXISTE, FOI DECLARADA FORA, IR� REFERENCIAR O ULTIMO CARRO CRIADO DENTRO DO LOOP (0,1,2...9) - FOI SENDO SUBSTITUINDO.
		Carro carro5;
		for (int i = 0; i < 10; i++) {
			carro5 = new Carro();
		}
		
		
		// ### OBJETO PARA SER CRIADO PRECISA SER CHAMADO O CONSTRUTOR
		
		// ### ACESS�VEL >> ENQUANTO � REFERENCIADO DIRETAMENTE OU INDIRETAMENTE
		
		// ### INACESS�VEL >> SEM REFERENCIAS DIRETAS OU INDIRETAS
		
		// ### GC: GARBAGE COLLECTOR ###
			// >> PODE JOGAR FORA O OBJETO DEPOIS QUE SE TORNAREM INACESSIVEIS
			// >> POR PADR�O, N�O TEM COMO SABER QUANDO ELE VAI RODAR
			// >> SABE-SE QUE ELE JOGA O OBJETO QUANDO ELE SE TORNA ELEGIVEL/INACESS�VEL
			
			// >> QUANTOS OBJETOS FORAM GARBAGE COLETADOS?
			// >> N�O SEI DIZER.
		
			// >> QUANTOS EST�O INACESS�VEIS?
			// >> 2
		
			// >> QUANTOS PODEM SER GARBAGE COLETADOS?
			// >> PODEM SER 2
		
			// >> NA PROVA TEM >>> "N�O TEM COMO SABER"; OBS
		
		// REFERENCIAS PODEM SER DIRETAS OU INDIRETAS!
		
	}

	
	class Carross {
		Carro c1;
		Carro c2;
	}

}