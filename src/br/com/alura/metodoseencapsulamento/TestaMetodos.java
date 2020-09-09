package br.com.alura.metodoseencapsulamento;

public class TestaMetodos {

	public static void main(String[] args) {

		Param p = new Param();
		int a = 1;
		p.referencia(new Object());
		p.referencia("Java");
		p.primitivo(a);
		p.primitivo('Z');
		p.teste(1, 2);
		System.out.println(p.getTexto(46));
		String resultado = p.getTexto(423);

		//metodo void não da para utilizar em outras coisas, pois ele não retorna nada.
	}

}

class ClasseComMetodos {
	// metodo tem assinatura, e corpo - fora as classes abstratas

	// assinatura - regra de identificadores, o tipo de retorno é obrigatorio
	int getNumero() {
		return 5; // corpo
	}
}

class Param {

	String getTexto(int a) {
		if (a > 0)
			return "maior";
		else if (a < 0)
			return "menor";
		else if (a==0) return "";
		throw new RuntimeException("jogando exception resolve problema");
	}

	// variavel final não pode ter o valor trocado.
	void teste(final int a, int b) {
		b = 10;
	}

	// void não retorna nada
	void primitivo(double a) {
		return;
	}

	void referencia(Object o) {

	}
}