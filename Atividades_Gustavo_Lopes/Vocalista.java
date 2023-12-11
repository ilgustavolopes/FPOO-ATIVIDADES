package Atividades_Gustavo_Lopes;

public class Vocalista extends MembroBanda {
	//metodos construtores
	public Vocalista() {
		super();
	}
	public Vocalista(String nome) {
		super.setNome(nome);
	}
	//metodos specials
	@Override
	public void tocar() {
		System.out.println("Vocalista " + getNome() + " cantando: " + " nos arrumamos a casa perfumamos ela todaaaa ");//🎵🎵🎵
	}
}
