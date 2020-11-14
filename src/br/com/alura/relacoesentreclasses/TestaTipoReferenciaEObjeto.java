package br.com.alura.relacoesentreclasses;

import java.util.ArrayList;
import java.util.List;

public class TestaTipoReferenciaEObjeto {

	public static void main(String[] args) {

		Conta c = new ContaJurida();
		c.id = 15;
		//c.cnpj = "66666"; não compila, pois a variavel é tipo conta, e nem toda conta possui cnpj
		
		(new ContaJurida()).id = 15;
		(new ContaJurida()).cnpj = "666666";
		//ContaJurida d = c; não compila.
		c.liga();
		//c.fecha(); não compila 
		
		List lista = new ArrayList();
	}

}


class Conta {
	int id;
	void liga() {}
}

class ContaJurida extends Conta {
	String cnpj;
	void fecha() {}
}

class ContaFisica extends Conta {
	String cpf;
	void fecha() {}
}