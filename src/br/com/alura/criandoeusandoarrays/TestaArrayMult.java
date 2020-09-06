package br.com.alura.criandoeusandoarrays;

public class TestaArrayMult {

	public static void main(String[] args) {

		int [][] tabela; // 2 dimensões
		int [][] cubo[]; // 3 dimensões
		int [][] hipercubo [][]; // 4 dimensões
		
		tabela = new int[10][5]; //10x5 
		cubo = new int[10][][]; // valido
		
		int[][] teste = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] estranho = new int[2][];
		
		estranho[0] = new int[20]; // array com dimensão 20 e 10
		estranho[1] = new int[10];
		
		for (int i = 0; i < estranho.length; i++) {
			System.out.println(estranho[i].length);
		}
		
		
		
	}

}