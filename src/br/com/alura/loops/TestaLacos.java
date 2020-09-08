package br.com.alura.loops;

public class TestaLacos {

	public static void main(String[] args) {

		int i = 9;
		// quando se sabe só a condição de parada;
		while (i < 10) {
			System.out.println("Laço While: " + i);
			i++;
		}

		System.out.println("---------------------------------");

		i = 9;
		do {
			System.out.println("Laço Do While: " + i);
			i++;
		} while (i < 10);

		System.out.println("---------------------------------");

		int[] array1 = new int[10];
		int[] array2 = new int[10];
		// quando quero percorrer algo, incrementando, com condições, então se usa FOR, se usa caso precise remover, ou alterar algo. 
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}

		// percorre tudo, se usa quando não precisa modificar nada no array
		for (int j : array1) {

		}

		for (int j : array2) {

		}
	}

}