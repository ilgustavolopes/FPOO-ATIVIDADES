package Aula_2108;

public abstract class ClassePai {
	//atributos
	public String senha = "123";
	protected String nome = "Rock";
	private int idade = 50;
	//construtor
	public ClassePai() {
		System.out.println("construtor padrao da ClassePai   " + nome);
	}
	//metodo especial
	public void metodoImprimir() {
		System.out.println("imprimir na ClassePai");
	}
	//metodos
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return senha;
	}
	
	
	
	
}
