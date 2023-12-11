package Atividades_Gustavo_Lopes;

public class Brinquedo2 {
	//atributos
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	//construtores
	public Brinquedo2() {
		
	}
	public Brinquedo2 (String nome, double alturaMinima,int capacidadeMaxima) {
		this.nome = nome;
		this.alturaMinima = alturaMinima;
		this.capacidadeMaxima = capacidadeMaxima;
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
	//metodo especial
	public void exibirinfo() {
		System.out.println("Brinquedo: " + nome);
		System.out.println("Altura Minima: " + alturaMinima);
		System.out.println("Capacidade Maxima:" + capacidadeMaxima);
	}
}
