package Atividades_Gustavo_Lopes;

public class Casa {//🏡
	//atributos
	private String cor;
	private float preco;
	private float metragem;
	private Sala sala;
	private Quarto quarto;
	//met construtor🚧🚧🚧🚧🚧🚧🚧🚧🚧🚧🚧
	public Casa() {
		
	}
	public Casa(String cor, float preco, float metragem, Sala sala, Quarto quarto) {
		this.cor = cor;
		this.preco = preco;
		this.metragem = metragem;
		this.sala = sala;
		this.quarto = quarto;
	}
	public Casa(Sala sala, Quarto quarto) {
		this.sala = sala;
		this.quarto = quarto;
	}
	//met set get
	public String getCor() {
		return cor;
	}
	public void set(String cor) {
		this.cor = cor;
	}
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getMetragem() {
		return metragem;
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	//met special
	public void mostrarDetalhes() {
		System.out.println("Confira os dados de sua casa: ");
		System.out.println("Cor: " + getCor() 
		                               + "\nPreco: " + getPreco() + "mil"
		                               + "\nMetragem: " + getMetragem()
		                               + "\nSala: " + sala.getNome() + " com TV: " + sala.getTemTV()
		                               + "\nQuarto: " + quarto.getNome() + " com "+ quarto.getNumeroCamas() + " camas");
	}
}