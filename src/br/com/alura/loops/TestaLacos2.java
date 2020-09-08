package br.com.alura.loops;

public class TestaLacos2 {

	public static void main(String[] args) {

		int i = 0;

		while (i < 10) {
			i++;
			if (i == 5)
				break;
			System.out.println("i = " + i);
		}
		System.out.println("Fora do While - Break");

		System.out.println(" -------------------------------------------");

		int j = 0;

		lacoWhile: while (j < 10) {
			j++;
			if (j == 5)
				continue;
			System.out.println("j = " + j);
		}
		System.out.println("Fora do While - Continue");

		// CASO EM UM WHILE (TRUE) -- SE TIVER UM BREAK, O COMPILADOR ENTENDE E COMPILA.

		System.out.println(" -------------------------------------------");

		for (int k = 1; k < 10; k++) {
			if (k == 8)
				break;
			if (k == 5)
				continue;
			System.out.println(k);
		}
		System.out.println(" -------------------------------------------");

		// da para dar nome no laço - todos os laços podem ter nomes.
		externo: for (int l = 1; l < 10; l++) {
			for (int m = 1; m < 10; l++) {
				System.out.println("Tabuada do " + m);
				if (l * m == 25)
					break externo;
				// if(l*m == 25) continue externo;
				System.out.println(l + " * " + m + " = " + (l * m));
			}
		}

		System.out.println(" -------------------------------------------");

		for (int n = 0; n < 4; n++) {
			System.out.println("Estou antes do switch");
			guilherme: switch (n) {
				case 0:
				case 1:
					System.out.println("Caso 1 " + n);
					for (int k = 0; k < 3; k++) {
						System.out.println(k);
						if (k == 1)
							break guilherme;
					}
				case 2:
					System.out.println("Legal, " + n);
					continue;
				case 3:
					System.out.println("Cheguei no 3");
					break;
			default:
				System.out.println("Estranho.....");
				break;
			}
			System.out.println("Estou apos o switch");
		}

	}

}