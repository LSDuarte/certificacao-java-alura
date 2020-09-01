package br.com.alura.operadores;

public class TestaIncrementos {

	public static void main(String[] args) {

		int i = 5;
		System.out.println(i);
		System.out.println(i--); // vai aplicar o -- depois de imprimir 5 (PÓS INCREMENTO)
		System.out.println(--i); // aplica antes pois o -- está antes (PRÉ INCREMENTO)
		i--;
		System.out.println(i); // tira 1
		
		System.out.println("------------------------------------------------------------------");
		int ii = 5;
		System.out.println(ii);
		System.out.println(ii++); // vai aplicar o ++ depois de imprimir 6
		System.out.println(++ii); // aplica antes pois o ++ está antes 
		ii++;
		System.out.println(ii); // adiciona 1
		
		System.out.println("------------------------------------------------------------------");
		//outras formas de incremento
		int iii = 5;
		iii = iii + 2;
		iii += 2;
		System.out.println(iii);
		iii = iii - 2;
		iii -= 2;
		System.out.println(iii);
		
		System.out.println("------------------------------------------------------------------");
		int iiii = 5;
		iiii = iiii * 2;
		iiii *= 2;
		System.out.println(iii);
		iiii /= 2;
		System.out.println(iiii);
		
		System.out.println("------------------------------------------------------------------");
		int iiiii = 5;
		iiiii = iiiii % 2;
		iiiii %= 2;
		System.out.println(iiiii);
		
		System.out.println("------------------------------------------------------------------");
		
		int a = 10;
		a += ++a + a + ++a;
		
		//a = 10 ++a + a + ++a;
		//a = 10 + 11 + a + ++a;
		//a = 10 + 11 + 11 + ++a;
		//a = 10 + 11 + 11 + 12;
		//a = 44;
		
		System.out.println(a);
		
		
		
		
		
	}

}