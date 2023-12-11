package Atividades_Gustavo_Lopes;

public class Guitarrista extends MembroBanda {
	    //metodos construtores
		public Guitarrista() {
			super();
		}
		public Guitarrista(String nome) {
			super.setNome(nome);
		}
		//metodos specials
		@Override
		public void tocar() {
			System.out.println("guitarrista " + getNome() + " tocando: nhiaunnnn nhionnnnnn nhounnhounnhoan");//🎵🎵🎵
		}
}
