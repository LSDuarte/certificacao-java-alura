package br.com.alura.criandoeusandoarrays;

import java.util.ArrayList;

public class TestaArrayList {

	public static void main(String[] args) {

		// não se sabe a qtd de objeto que cabe
		String[] nome = new String[10];
		
		ArrayList nomes = new ArrayList();
		ArrayList<String> nomess = new ArrayList<String>();
		
		nomess.add("Java");
		nomess.add("Ruby");
		nomess.add("JavaScript");
		nomess.add("Java");
		
		// devolve se existe um objeto dentro do Array
		System.out.println(nomess.contains("Java"));
		System.out.println(nomess.contains("c#"));
		System.out.println(nomess.contains("JavaScript"));
		System.out.println(nomess.contains("Java"));
		
		System.out.println("-------------------------------------------");
		
		boolean removido = nomess.remove("JavaScript");
		System.out.println(removido); // remove uma ocorrencia de nome, não todos.
		System.out.println(nomess.contains("JavaScript"));
		System.out.println(nomess.size()); // ver tamanho do array list
		
		// converte em array de Objetos
		Object[] objetos = nomess.toArray();
		
		// copia os elementos do array e inclui no array list como String
		String[] nomeArray = nomess.toArray(new String[nomess.size()]);
		
		// verifica se o array passado tem tamanho suficiente, senão ele cria um novo array do tamanho certo, inclui no array
		String[] nomeArray2 = nomess.toArray(new String[0]);

		System.out.println("-------------------------------------------");
		
		ArrayList<String> paises = new ArrayList<String>();
		paises.add("Brasil");
		paises.add("Correia");
		
		// adiciona o array de paises e de nomess
		ArrayList<String> tudo = new ArrayList<String>();
		tudo.addAll(nomess);
		tudo.addAll(paises);
		
		System.out.println(tudo.size());

		System.out.println("-------------------------------------------");
		
		//consulta o elemento de dentro, passando o indice GET
		System.out.println(nomess.get(0));
		
		nomess.add(0,"PHP");
		System.out.println(nomess.get(0));
		System.out.println(nomess.get(1));
		System.out.println(nomess.get(2));
		
		System.out.println("-------------------------------------------");
		
		nomess.remove(0);
		System.out.println(nomess.get(0));
		
		// troca o elemento por outro
		nomess.set(0, "scala");
		System.out.println(nomess.get(0));
		System.out.println(nomess.get(1));
		System.out.println(nomess.get(2));

		System.out.println(nomess.contains("scala"));
		System.out.println(nomess.indexOf("scala")); // de frente para trás || achar elemento na posição correta
		System.out.println(nomess.lastIndexOf("scala")); //de trás para frente || achar elemento....
	
		System.out.println(nomess.lastIndexOf("php")); // elemento não presente | sempre negativo
	}

}