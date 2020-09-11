package br.com.alura.relacoesentreclasses;

import br.com.alura.basico.Endereco;

public class TestaHeranca {

	public static void main(String[] args) {

		Y y = new Y();
		y.x = 15;
		y.y();
		
		System.out.println("-----------------------------------");
		
		W.metodo();
		Z.metodo();
		
		System.out.println("-----------------------------------");
		
		Z z = new Z();
		z.metodo();
		
		W w = new Z();
		w.metodo();
		
		System.out.println("-----------------------------------");
		Gato g = new Gato();
		g.corDosOlhos = "Castanhos";
		System.out.println(g.toString());
		System.out.println(g);
		System.out.println("Estou com um: " + g);
	}

}

class Mae {

}

class Filha extends Mae {

}

class Neta extends Filha {

}

class Avenida extends Endereco {

}

class X {
	int x;

	public void y() {
		System.out.println("Invocando y em um objeto");
	}
}

class Y extends X {

}

class W {
	public static void metodo() {
		System.out.println("invocando o metodo estatico que foi definido em W");
	}
}

class Z extends W {
	public static void metodo() {
		System.out.println("invocando o metodo estatico que foi definido em Z");
	}
}

class Gato {
	String corDosOlhos;
	
	public String toString() {
		return "[GATO " + corDosOlhos + "]";
	}
}
