package Sorveteria;

public class Sorvete {
	//atributos
	private String sabor;
	private String acompanhamento;
	private double preco;
	//met get set
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getAcompanhamento() {
		return acompanhamento;
	}
	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	//construtores
	public Sorvete(String sabor, String acompanhamento, double preco) {
		this.sabor = sabor;
		this.acompanhamento = acompanhamento;
		this.preco = preco;
	}
	public Sorvete() {
	}
}
