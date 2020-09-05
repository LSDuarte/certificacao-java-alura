package br.com.alura.criandoeusandoarrays;

public class TestaArray2 {

	public static void main(String[] args) {

		// array com 10 posições
		Cliente[] clientes = new Cliente[10];

		// adiciona 10 marios
		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
			clientes[i].nome = "Mario";
		}

		// percorre e imprime o array
		for (Cliente c : clientes) {
			System.out.println(c.nome);
		}

		// é possivel adicionar subclasses
		Cliente clientes2[] = new Cliente[5];
		clientes2[0] = new Cliente();
		clientes2[1] = new ClienteEspecial();
		
		System.out.println("------------------------------------------");
		
		Cliente guilherme = new Cliente();
		guilherme.nome = "Guilherme";
		
		clientes2[0] = guilherme;
		System.out.println(guilherme.nome);
		System.out.println(clientes2[0].nome);
		
		guilherme.nome = "Silveira";
		
		System.out.println(guilherme.nome);
		System.out.println(clientes2[0].nome);
		
		
		System.out.println("------------------------------------------");
		
		
		int[] valores = new int[10];
		//long[] numeros[] = (long) valores; // não da para fazer CAST
		
		// é possivel fazer o CAST pois são referencias, e String é um objeto derivado de Object
		String[] nomes = {"Mario", "Guilherme"};
		Object[] objetos;
		
		objetos = nomes;
		
		for (Object object : objetos) {
			System.out.println(object);
		}
		
		
	}

}

class Cliente {
	String nome;
}

class ClienteEspecial extends Cliente {
}