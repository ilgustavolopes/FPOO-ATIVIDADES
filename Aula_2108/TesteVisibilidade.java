package Aula_2108;

import br.org.sesisp.java.gustavo.ClasseExterna;

public class TesteVisibilidade {

	public static void main(String[] args) {
		//instancia de objetos
		SubClasse1 sub1 = new SubClasse1();
		System.out.println("senha bista pela subclasse1" + sub1.senha);
		
		SubClasse2 sub2 = new SubClasse2();
		System.out.println("senha vista pela subclasse2" + sub2.senha);
		//obj da classe externa
		ClasseExterna cx = new ClasseExterna();
		System.out.println("senha vista da ClasseExterna");

		//instanciando uma classe abstrata
		//ClassePai cp = new ClassePai();
		//NÃO PODE
		
	}

}
