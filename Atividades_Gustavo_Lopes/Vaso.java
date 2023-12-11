package Atividades_Gustavo_Lopes;

public class Vaso {
	//atributos
	private String cor;
	private double tamanho;
	private String material;
	//construtor
	Vaso(){
		
	}
	Vaso(String cor, double tamanho, String material){
		this.cor = cor;
		this.tamanho = tamanho;
		this.material = material;
		System.out.println("Fui criado e sou um Vaso com tamanho: " + this.tamanho + "; cor: "
			    + this.cor + "; material: " + this.material + ";");
	}
	//metodos
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor =  cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho =  tamanho;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material =  material;
	}
	//metodos especiais
	public void exibir() {
		System.out.println("\nSeus dados: \n" + "Cor: " + this.cor + "\n" + "Tamanho: " 
	    + this.tamanho + "\n" + "Material: " + this.material);
	}
}
