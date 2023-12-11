package Aula_2308;

public class Gato1 extends Animal1 {
	//met cons
	public Gato1(String nome) {
		super(nome);
	}
	//mets
	@Override // sobrescrita de metodo
	public void emitirSom() {
		System.out.println("miau miau miau");
	}
}
