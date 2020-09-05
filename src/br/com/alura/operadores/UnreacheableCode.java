package br.com.alura.operadores;

public class UnreacheableCode {

	public int metodo() {
		return 5;
		//System.out.println("Oi"); Unreachable code
	}
	
	// não pode
	public int metodo2(int x) {
		if (x > 200) {
			return 10;
		}
		throw new RuntimeException();
	}
	
	
	public static void main(String[] args) {

	}

}