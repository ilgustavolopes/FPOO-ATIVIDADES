package Aula_2308;

public class Animal1 {
	//atributos
	private String nome;
	//construtor
	public Animal1(String nome) {
		this.nome = nome;
	}
	//metodos
	public void emitirSom() {
		System.out.println("O animal esta fazendo um som");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
