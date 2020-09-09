package br.com.alura.metodoseencapsulamento;

class Moto {
	
	public static int getTotalDeMotos() {
		return Moto.totalDeMotos;
	}
	
	// variavel de classe, não de objeto. | não preciso criar um objeto para acessa-lo | coisas staticas só podem acessar coisas estaticas
	public static final int PADRAO_TOTAL_DE_MOTOS = 8;
	public static int totalDeMotos = PADRAO_TOTAL_DE_MOTOS;
	
	static int b = getMetodos();
	public static int getMetodos() {
		return a;
	}

	static int a = 15;
	String marca;

}


class MotocileteDupla extends Moto {

	
}

public class TestaStatic {

	public static void main(String[] args) {
		//Moto.setTotalDeMotos(15);
		System.out.println(Moto.b);
		System.out.println(Moto.a);
		
		// metodo chamado pela variavel da classe
		System.out.println(Moto.getTotalDeMotos());
		System.out.println(MotocileteDupla.getTotalDeMotos());
		
		
		// metodo chamado pelo objeto
		Moto m = new Moto();
		Moto mm = new MotocileteDupla();
		
		System.out.println(m.getTotalDeMotos());
		System.out.println(mm.getTotalDeMotos());
	}

}