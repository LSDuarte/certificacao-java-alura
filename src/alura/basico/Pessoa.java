package alura.basico;

public class Pessoa {

	// variável estatica
	static int id = 1;

	// método estatico
	static void metodo() {
		System.out.println(id);
	}

	// posso ter uma variavel STATIC com o mesmo nome de variavel de um parametro de método
	static int x = 0;
	public static void setX(int x) {
		Pessoa.x = x;
	}
	
	// posso ter uma variavel de instancia com o mesmo nome de variavel de um parametro  
	int y = 0;
	public void setY(int y) {
		this.y=y;
	}
	
	// ## variavel local >>> variavel membro - CERTO
	// ## variavel local >>> variavel instancia - CERTO
	
	// ## variavel local >>> variavel local - ERRADO
	// ## variavel membro >>> variavel instancia - ERRADO

	// ## SHADOWING >> ACESSA A VARIÁVEL LOCAL NUNCA A DE INSTANCIA E DE CLASSE;
	// ## SHADOWING >> CASO QUEIRA ACESSAR A VARIAVEL DE INSTANCIA EU USO  THIS. Ex(this.y=y;)
	// ## SHADOWING >> CASO QUEIRA ACESSAR A VARIAVEL DE CLASSE EU USO  NOMECLASSE. Ex(Pessoa.x = x;)
}