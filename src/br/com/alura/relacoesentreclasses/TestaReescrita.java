package br.com.alura.relacoesentreclasses;

public class TestaReescrita {
	
	static void metodo(Veiculo v) {
		v.liga();
	}

	public static void main(String[] args) {

		// em tempo de execução o java vai chamar o metodo do tipo.
		Helicoptero h1 = new Helicoptero();
		h1.liga();
		
		System.out.println("------------------------------------------");
		//polimorfismo >> um objeto do tipo helicoptero é um objeto do tipo veiculo
		//em tempo de compilação, o metodo vai procurar o metodo
		Veiculo h2 = new Helicoptero();
		h1.liga();
		
		System.out.println("------------------------------------------");
		Veiculo h3 = new FabricaDeVeiculo().fabrica();
		h3.liga();
		
		System.out.println("------------------------------------------");
		Veiculo h4 = new FabricaDeHexaDroid().fabrica();
		h4.liga();
		
		System.out.println("------------------------------------------");
		HexaDroid h5 = new FabricaDeHexaDroid().fabrica();
		h5.liga();
		
		System.out.println("------------------------------------------");
		metodo(new HexaDroid());
		metodo(new Veiculo());
		metodo(new Helicoptero());
	}

}

//filho
class Helicoptero extends Veiculo {
	//mesma assintura, é uma reescrita de metodo
	public void liga() {
		System.out.println("ligando o helicoptero!");
	}
}

// pai
class Veiculo {
	public void liga() {
		System.out.println("Veiculo está sendo ligado!");
	}
}

interface A {
	void x();
}

class B implements A {
	//sempre publica, pois TODA INTERFACE OS METODOS SÃO PUBLICAS, QUALQUER OUTRA DEFINIÇÃO, NÃO COMPILA.
	public void x() {
		
	}
}

abstract class Droid extends Veiculo {
	public abstract void liga();
}

class HexaDroid extends Droid {
	// é necessario a sobreescrita, pois o a class é abstract
	@Override
	public void liga() {
		System.out.println("ligando hexadroid!");
	}
}

class FabricaDeVeiculo {
	Veiculo fabrica() {
		return new Veiculo();
	}
}


class FabricaDeHexaDroid extends FabricaDeVeiculo {
	HexaDroid fabrica() {
		return new HexaDroid();
	}
}



class C {
	public void metodo() {
		System.out.println("C");
//		this.metodo2();
	}
//	public void metodo2() {
//		System.out.println("metodo 2 do pai"); //entra em loop
//	}
}

class D extends C {
	public void metodo() {
		System.out.println("D");
		super.metodo();
	}
	
	public void metodo2() {
		System.out.println("E");
		metodo();
		super.metodo();
	}
	
	public static void main(String[] args) {
		new D().metodo2();
	}
}


// ### REGRAS PARA REESCRITA
// ## O NOME DO MÉTODO DEVE SER O MESMO!
// ## TEM QUE SER HERDADA, PAI, MÃE, FILHA
// ## MESMO NOME, ORDEM, TIPOS DE PARAMENTROS
// ## VISIBILIDADE DO PAI É UMA, A DO FILHO DEVE SER IGUAL OU MAIS ABERTA
// ## AS EXCEPTIONS LANÇADAS DEVEM SER A MESMA OU MENOR, LANÇA APENAS AS QUE FORAM DEFINIDAS PELA CLASSE MÃE, PAI, FILHA ETC
// ## METODO FINAL NA CLASSE MAIOR, MÃE, ETC, NÃO PODE SER FINAL, SENÃO NÃO HERDA
// ## RETORNO DO METODO TEM QUE SER IGUAL OU MAIS ESPECIFICO 








