package Aula_0409;

public class Pessoa {
	//atributos
	public String cargo;
	public String nome;
	public int idade;
	//construtores sem e c/parametros
	public Pessoa() {
		/////////
		////////////
		//0///0//////                           
		////c/////////
		///----///////
		///////////
	}
	public Pessoa(String cargo,String nome,int idade) {
		this.cargo = cargo;
		this.nome = nome;
		this.idade = idade;
	}
	//metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
