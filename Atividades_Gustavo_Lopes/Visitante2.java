package Atividades_Gustavo_Lopes;

public class Visitante2 {
	//atributos
	private String nome;
	private int idade;
	private double altura;
	//construtores
	public Visitante2(){
		
	}
	public Visitante2(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	//metodos
	//nome
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	//idade
	public int getidade() {
		return idade;
	}
	public void setidade(int idade) {
		this.idade = idade;
	}
	//altura
	public double getaltura() {
		return altura;
	}
	public void setaltura(double altura) {
		this.altura = altura;
	}
	//metodo especial
	public boolean podeAndarNoBrinquedo() {
		if(idade >= 10 && altura > 1.2) {
			return true;
		}else
			return false;
	}
	public void exibirinfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
	}
}
