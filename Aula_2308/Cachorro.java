package Aula_2308;

public class Cachorro extends Animal1 {
	//met construtor
	public Cachorro(String nome) {
		super(nome);//pegando atributo nome da super classe Animal1
	}
	//metodo
	@Override // sobrescrita de metodo
	public void emitirSom() {
		System.out.println("AU AU AU AU AU");
	}
}
