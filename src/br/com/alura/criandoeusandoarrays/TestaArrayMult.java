package br.com.alura.criandoeusandoarrays;

public class TestaArrayMult {

	public static void main(String[] args) {

		int [][] tabela; // 2 dimens�es
		int [][] cubo[]; // 3 dimens�es
		int [][] hipercubo [][]; // 4 dimens�es
		
		tabela = new int[10][5]; //10x5 
		cubo = new int[10][][]; // valido
		
		int[][] teste = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] estranho = new int[2][];
		
		estranho[0] = new int[20]; // array com dimens�o 20 e 10
		estranho[1] = new int[10];
		
		for (int i = 0; i < estranho.length; i++) {
			System.out.println(estranho[i].length);
		}
		
		
		
	}

}