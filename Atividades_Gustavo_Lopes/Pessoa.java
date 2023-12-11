package Atividades_Gustavo_Lopes;

public abstract class Pessoa {
	//atributos
	private String nome;
	private String endereco;
	private int telefone;
	private int cpf;
	private int celular;
	//construtor default e com parametros
	Pessoa(){
		
	}
	Pessoa (String nome, String endereco, int telefone, int cpf, int celular){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.celular = celular;
	}
	//metodos get e set
	//nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//endereco
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//telefone
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	//cpf
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	//celular
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
}
