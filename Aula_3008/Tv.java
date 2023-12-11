package Aula_3008;

public class Tv implements ControleRemoto {
	@Override
	public void ligar() {
		System.out.println("ligando");
	}

	@Override
	public void desligar() {
		System.out.println("desligando");
	}

	@Override
	public void volumeMais(int vol) {
		vol = vol + 1;
		System.out.println(vol);
	}

	@Override
	public void volumeMenos(int vol) {
		vol = vol - 1;
		System.out.println(vol);
	}

	@Override
	public String getPolegadas() {
		return "Seu televisor possui 1000polegadas";
	}
	
}
