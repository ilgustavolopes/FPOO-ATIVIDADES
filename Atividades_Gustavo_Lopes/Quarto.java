package Atividades_Gustavo_Lopes;

public class Quarto extends Comodo {
	//atributos
	private int numeroCamas;
	//met cont default e param
	public Quarto() {
		super();
	}
	public Quarto(int numeroCamas, String nome) {
		this.numeroCamas = numeroCamas;
		super.setNome(nome);
	}
	//met get set
	public int getNumeroCamas() {
		return numeroCamas;
	}
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
}
