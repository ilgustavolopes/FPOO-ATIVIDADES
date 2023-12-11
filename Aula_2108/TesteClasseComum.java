package Aula_2108;

public class TesteClasseComum {

	public static void main(String[] args) {
		// instanciar um obj
		ClasseComum obj1 = new ClasseComum();
		obj1.numero = 100;
		ClasseComum obj2 = new ClasseComum(20);
		obj2.idade = 200;
		System.out.println("teste obj1: " + obj1.numero + " " + obj1.idade + "\n");
		System.out.println("teste obj2: " + obj2.numero + " " + obj2.idade + "\n");
		

	}

}
