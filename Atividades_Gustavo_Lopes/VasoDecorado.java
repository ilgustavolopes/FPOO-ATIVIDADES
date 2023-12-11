package Atividades_Gustavo_Lopes;

public class VasoDecorado extends Vaso {
	//atributos
	private String decoracao;
	//construtores
	VasoDecorado(){
		super();
	}
	VasoDecorado(String decoracao, String cor, double tamanho, String material){
		super();
		this.decoracao = decoracao;
		super.setCor(cor);
		super.setTamanho(tamanho);
		super.setMaterial(material);
		System.out.println("Fui criado e sou um Vaso com a decoracao de: " + this.decoracao + " cor: " + cor + "tamanho:" + tamanho + "material: " + material);
	}
	//metodos
	public String getDecoracao() {
		return decoracao;
	}
	public void setDecoracao(String decoracao) {
		this.decoracao =  decoracao;
	}
	//metodosespeciais
	public void exibir() {
		System.out.println("\nSeus dados: \n" + "Cor: " + super.getCor() + "\n" + "Tamanho: " 
			    + super.getTamanho() + "\n" + "Material: " + super.getMaterial() + "\nDecoracao: " + this.getDecoracao());
	}
}
