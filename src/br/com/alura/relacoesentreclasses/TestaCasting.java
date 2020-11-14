package br.com.alura.relacoesentreclasses;

public class TestaCasting {

	public static void main(String[] args) {

		Object[] objetos = new Object[100];
		String s = "certicacao";
		objetos[0] = s;

		// casting só é realizado quando faz sentido, ou seja, sei que aquele valor é do tipo que quero realizar o casting.
		String recuperada = (String) objetos[0];
		System.out.println(recuperada);
		
		//Veiculo v = new Carro();
		//Moto m = v; - não compila, nem todo veiculo é moto.
		
		//casting
	//	Moto m = (Moto) v; // da erro de execução
		
		Carro c = new Carro();
		//Moto m2 = (Moto) c; // nem compila - carro não é moto e nem vice e versa.
		
		String larissa = "larissa";
		String nome = (String) larissa; //compila, é uma string
		Object nome2 = (String) nome; // compila, é uma string - herança
		Object nome3 = (Object) nome; // compila também, mesmo tipo

		//Casting é obrigatório qunado estou indo do tipo mais generico para o mais especifico
		
		CarroAutomatico ca = new CarroAutomatico();
		Carro c2 = ca; // compila, todo carro automatico é um carro, polimorfismo.
		Automatico a = (Automatico) ca;
		
		boolean tipoAutomatico = c2 instanceof Automatico;
		if (c2 instanceof Automatico) {
			System.out.println("eh automatico!");
		}
		
		// tomar cuidado com o not (!) é necessário (), ali no caso, c2 não é boolean.
		if (!(c2 instanceof Automatico)) {
			System.out.println("eh automatico!");
		}
		
		//Moto m2 = new Moto();
		//Automatico a2 = m2; não compila, moto não implementa automatico
		//Automatico a2 = (Automatico) m2; 

	}

}

interface Automatico {}
class Moto extends Veiculo {}
class Veiculo {}
class Carro extends Veiculo {}
class CarroAutomatico extends Carro implements Automatico {}