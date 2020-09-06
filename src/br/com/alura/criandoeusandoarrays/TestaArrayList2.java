package br.com.alura.criandoeusandoarrays;

import java.util.ArrayList;
import java.util.Iterator;

public class TestaArrayList2 {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("java");
		nomes.add("ruby");
		nomes.add("sacala");
		nomes.add("python");

		// um objeto que sabe percorrer todos os elementos da coleção, independente do tipo do objeto
		Iterator<String> it = nomes.iterator();

		// caso ainda tenha elemento, ele continua percorrendo
		while (it.hasNext()) {
			// pega a informação atual
			String atual = it.next();
			System.out.println(atual);

			// remove o elemento
			//it.remove();
		}
		System.out.println("--------------------------------");
		System.out.println(nomes.size());
		
		//percorre a lista e imprime
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("--------------------------------");
		
		Cliente gui = new Cliente();
		gui.nome = "Guilherme";
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(gui);
		System.out.println(gui.nome);
		System.out.println(clientes.get(0).nome);
		
		gui.nome = "Silveira";
		System.out.println(gui.nome);
		System.out.println(clientes.get(0).nome);
	}

}