package br.com.alura.relacoesentreclasses;

public class TestaConstrutores3 {
   public static void main(String[] args) {
	   new Filha3(567);
   }
}

//compila
class Mae {
	// construtor padrão vazio - sem código dentro
	Mae() {
		super();
	}

}

//compila
class Filha extends Maes {

	Filha() {
		super(); // primeira instrução sempre
	}

}


class Mae2 {
	Mae2(String s){
	}
}

//não compila pois o construtor vazio deixou de existir.
/*class Filha2 extends Mae2 {

	Filha2(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
}
*/

// se o contrutor PAI for private nenhuma classe filha pode acessar, então não compila.


class Mae3 {
	long numeroGrande;
	Mae3() {}
	Mae3(String s) {System.out.println("mae");}
	Mae3(int i) {}
}

class Filha3 extends Mae3 {
	Filha3 (int i){
		this("numero:" + i);
		i = 3; // variavel local, acessivel
//		this.i = 3; // variavel não existe, só local.
		numeroGrande = 33; //pode acessar porque extend 
		this.s = "larissa"; //this opcional
		System.out.println("fim do construtor com numero");
	}
	String s; //variavel membro
	 
	Filha3 (String s) {
		super(s);
		this.s = s;  // acessa variavel membro - this obrigatorio
		System.out.println(s);
	}
}