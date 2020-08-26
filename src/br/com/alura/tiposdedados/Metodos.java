package br.com.alura.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class Metodos {

	public static void main(String[] args) {

		Calculadora c = new Calculadora();
		System.out.println("Soma: " + c.soma(3,5));
		System.out.println("Subtra��o: " + c.subtracao(3,5));
		System.out.println("Multiplica��o: " + c.multi(3,5));
		System.out.println("Divis�o: " + c.div(3,5));
		
		System.out.println("Somar varias: " + c.somar(3,5,5,6,3,8,0,10,25));
		System.out.println("Somar varias: Sem argumentos: " + c.somar());
		
		System.out.println("Somar varias: " + c.somarENome("Larissa",3,5,5,6,3,8,0,10,25));
	}

}

class Calculadora {
	
	public int soma(int n1, int n2) {
		return n1 + n2;
	}
	
	public int subtracao(int n1, int n2) {
		return n1 - n2;
	}
	
	public int multi(int n1, int n2) {
		return n1 * n2;
	}
	
	public int div(int n1, int n2) {
		return n1 / n2;
	}
	
	// v�rios valores para soma
	public int somar(int... numeros ) { //� um array
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}
	
	// os argumentos devem ser antes da Array, n�o depois
	public int somarENome(String nome, int... numeros ) { //� um array
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}
	
	
}