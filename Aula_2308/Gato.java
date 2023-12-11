package Aula_2308;

public class Gato extends Animal {// herança
	//atributos
	public String raca;
	public float peso;
	public int idade;
	//metodo construtor
	public Gato() {
		super();
		System.out.println("acabei de nascer e sou um gato sem caracteristicas");
	}
	public Gato(String raca) {//met construtor com parametros
		super();
		this.raca = raca;
		System.out.println("\nacabei de nascer e sou um gato da raca: " + this.raca);
	}
	public Gato(float peso, int idade) {
		super();
		this.peso = peso;
		this.idade = idade;
		System.out.println("\nacabei de nascer e sou um gato de peso: "
		       + this.peso + "kg " + "e idade de: " + this.idade + " anos");
	}
	//metodos
	public void som() {
		System.out.println("som da classe Gato");
		super.som();//som da classe animal
	}
}//fim classe
