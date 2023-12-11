package Atividades_Gustavo_Lopes;

public class Brinquedo {//nome da classe
	
	//atributos
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	
	//construtores
	public Brinquedo() {
		
	}
	public Brinquedo(String nom,double alturaMinim,int capacidadeMaxim) {
		nome = nom;
		alturaMinima = alturaMinim;
		capacidadeMaxima = capacidadeMaxim;
	}
	
	//metodos
	public String getnome() {//metodo get nome
		return nome;
	}
	public void setnome(String n) {//metodo set nome
		this.nome = n;
	}
	public double getalturaMinima() {//metodo get alturaminima
		return alturaMinima;
	}
	public void setalturaMinima(double a) {//metodo set alturaminima
		this.alturaMinima = a;
	}
	public int getcapacidadeMaxima() {//metodo get capacidademaxima
		return capacidadeMaxima;
	}
	public void setcapacidadeMaxima(int c) {//metodo set capacidademaxima
		this.capacidadeMaxima = c;
	}
	
	//metodos especiais
	public void exibirinfo() {
		System.out.println(nome + "\n" + alturaMinima + "\n" + capacidadeMaxima);
	}
	
	
}
