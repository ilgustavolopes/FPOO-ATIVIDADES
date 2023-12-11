package Sorveteria;

public class Pessoa {
	//atributos
	private String nome;
	private char sexo;
	private int idade;
	private double cpf;
	//construtores
	public Pessoa() {
		
	}
	public Pessoa(String nome, char sexo, int idade, double cpf) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.cpf = cpf;
	}
	//get set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	
	
}
