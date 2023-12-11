package Sorveteria;

public class Cliente extends Pessoa {
	//atributos 
	private int senha;
	//construtores
	public Cliente(){
		super();
	}
	public Cliente(String nome, char sexo, int idade, double cpf, int senha) {
		super.setNome(nome);
		super.setSexo(sexo);
		super.setIdade(idade);
		super.setCpf(cpf);
		this.senha = senha;
	}
	//get set
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
