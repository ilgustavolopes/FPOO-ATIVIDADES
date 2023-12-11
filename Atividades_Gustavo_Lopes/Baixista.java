package Atividades_Gustavo_Lopes;

public class Baixista extends MembroBanda {
	    //metodos construtores
		public Baixista() {
			super();
		}
		public Baixista(String nome) {
			super.setNome(nome);
		}
		//metodos specials
		@Override
		public void tocar() {
			System.out.println("baixista " + getNome() + " tocando: tom tom tom tom tom");//🎵🎵🎵
		}
}
