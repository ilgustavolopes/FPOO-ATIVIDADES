package Atividades_Gustavo_Lopes;

public class Visitante {
	
	//atributos
	private String nome;
	private int idade;
	private double altura;
	
	//construtores
	public Visitante() {	
		
	}
	public Visitante(String nom,int idad,double altu) {
		nome = nom;
		idade = idad;
		altura = altu;
	}
	
	//metodos
	public String getNome() {//metodo get nome
		return nome;
	}
	public void setNome(String n) {//metodo set nome
		this.nome = n;
	}
	public int getidade() {//metodo get Idade
		return idade;
	}
	public void setidade(int i) {//metodo set Idade
		this.idade = i;
	}
	public double getaltura() {//metodo get Altura
		return altura;
	}
	public void setaltura(double a) {//metodo set Altura
		this.altura = a;
	}
	
	//metodos especiais
	public boolean PodeAndarNoBrinquedo() {
		if(altura >= 1.55 && idade >= 16) {
			System.out.println("voce pode andar no brinquedo");
		}else {
			System.out.println("voce nao pode andar no brinquedo");
		}
		return false;
	}
}
