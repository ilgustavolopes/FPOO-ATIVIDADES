package Atividades_Gustavo_Lopes;

public class Baterista extends MembroBanda {
	    //metodos construtores
		public Baterista() {
			super();
		}
		public Baterista(String nome) {
			super.setNome(nome);
		}
		//metodos specials
		@Override
		public void tocar() {
			System.out.println("baterista " + getNome() + " tocando: papapapapapaptu");//🎵🎵🎵
		}
}
