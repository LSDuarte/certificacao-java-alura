package br.com.alura.relacoesentreclasses;

public class TestaAbstractEInterface {

	public static void main(String[] args) {
		// metodo e classe abstrata não pode ser instanciada, apenas se ela for herdada.
		// new SemMetodo();
		// new ComMetodoAbstrato();
		
		//Não compila, classe abstrata não se instnacia, apenas se for herdada.
		//CarroAI c = new CarroAutomaticoAI() {}
		
		CarroAI c = new CarroAI();
		c.liga();
		
		System.out.println(A.x);
		//System.out.println(new A().x); não se da NEW em interface, apenas se for herdada;
		System.out.println(new GUIA().x);
	}
}

class GUIA implements A {
	
}


abstract class SemMetodo {
	// classe abstrata vazia, compila
}

//class ComMetodoAbstrato {
abstract class ComMetodoAbstrato {	
	// se a classe tem 1 metodo abstrato, ela precisa ser abstrata, senão não compila.
	abstract void executa();
	// metodo abstrato não tem corpo
}

//abstract class VeiculoAI {
abstract class VeiculoAI {
	abstract void liga();
}

// não compila porque a classe não implementa o metodo abstrato, liga(), classe pai
// class CarroAI extends VeiculoAI {
//abstract class CarroAI extends VeiculoAI {
class CarroAI extends VeiculoAI {
	@Override
	void liga() {
		
	}
}

abstract class CarroAutomaticoAI extends CarroAI {
	
}

class CarroAutomaticoBonito extends CarroAutomaticoAI {
	
}




// classe abstrata:
// 0 ou + métodos abstratos

// 0 ou + métodos abstratos:
// interface ou classe abstrata

// método concreto:
// classe abstrata ou concreto

// ou implementa todos os metodos abstratos, ou torna a classe abstrata.


interface A {
	int x = 10; // é uma constante, ela é publica, statica e final
	public static final int X = 10;
}

interface B extends AA {
	
}

interface C extends B, Runnable {
	
}

// não compila, interface nunca implementa, só extends
//interface D implements C {}
// interfaces não podem ter metodos staticos, não compila
		
