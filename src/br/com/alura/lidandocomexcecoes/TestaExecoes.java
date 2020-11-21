package br.com.alura.lidandocomexcecoes;

public class TestaExecoes {

	public void fazAlgo(int[] idades) {
	//	if (idades.length >= 2 && idades != null) {
			System.out.println(idades[1]);
	//	}
	}

	public static void main(String[] args) {
		new TestaExecoes().fazAlgo(new int[0]);
	}

}