package br.com.alura.lidandocomexcecoes;

public class TestaTrataException {

	public static void main(String[] args) {
		String nome = null;
		// muda o fluxo do programa.
		try {
			nome.toLowerCase();
			System.out.println("linha seguinte"); // nunca executa
		} catch (NullPointerException ex) {
		//} catch (RuntimeException ex) {
		//} catch (IndexOutOfBoundsException ex) {
			System.out.println("Peguei a exception: " + ex);
		}
		System.out.println("terminei");
	}

}