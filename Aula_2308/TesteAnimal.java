package Aula_2308;

public class TesteAnimal {

	public static void main(String[] args) {
		//instancia de objeto
		System.out.println("---------ANIMAL----------");
		Animal animalUno = new Animal();
		animalUno.nome = "ligeirinho";
		System.out.println("Ciao mi chiamo: " + animalUno.nome);
		//instanciando obj da classe gato
		System.out.println("---------GATO1----------");
		Gato cat1 = new Gato();
		cat1.nome = "Cleiton";
		System.out.println("Ciao mi chiamo:" + cat1.nome);
		cat1.brincar();
		System.out.println("---------GATO2----------");
		Gato cat2 = new Gato("Persa");
		cat2.som();
		System.out.println("---------GATO3----------");
		Gato cat3 = new Gato(2.5f, 1);
	}

}
