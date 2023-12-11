package Atividades_Gustavo_Lopes;

public class Cachorro {
	//atributos
	private String nome;
	private float peso;
	private char sexo;
	private int qtdPatas;
	//metodos construtores
	public Cachorro() {
		
	}
	public Cachorro(String nome, float peso, char sexo, int qtdPatas) {
		this.nome = nome;
		this.peso = peso;
		this.sexo = sexo;
		this.qtdPatas = qtdPatas;
	}
	//metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getQtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}
	//METODOS ESPECIAIS
	public void latir() {
		System.out.println("auauauauau");
	}
	public void correr() {
		System.out.println("correndo......arf.....arf");
	}
	public void dormir() {
		System.out.println("dormindo....zzzz.zzzzzzz");
	}
	public void brincar() {
		System.out.println("brincando....ARF.ARF.ARF.ARF");
	}
}
