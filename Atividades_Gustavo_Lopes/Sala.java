package Atividades_Gustavo_Lopes;

public class Sala extends Comodo {
	//atributos
		private boolean temTV;
		//met cont default e param
		public Sala() {
			super();
		}
		public Sala(boolean temTV, String nome) {
			this.temTV = temTV;
			super.setNome(nome);
		}
		//met get set
		public boolean getTemTV() {
			return temTV;
		}
		public void setTemTV(boolean temTV) {
			this.temTV = temTV;
		}
}
