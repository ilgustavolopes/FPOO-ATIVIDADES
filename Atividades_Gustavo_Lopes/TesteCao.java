package Atividades_Gustavo_Lopes;

public class TesteCao {

	public static void main(String[] args) {
		// instanciando cachorros
		Cachorro c1 = new Cachorro("chulinho", 14.06f, 'M', 4);
		Cachorro c2 = new Cachorro("mickey", 12.00f, 'M', 4);
		Cachorro c3 = new Cachorro("dogao", 13.05f, 'M', 4);
	
		System.out.println("CACHORRO 1: ");
		System.out.println("nome: " + c1.getNome());
		System.out.println("peso: " + c1.getPeso());
		System.out.println("sexo: " + c1.getSexo());
		System.out.println("Patas: " + c1.getQtdPatas());
		c1.latir();
		
		System.out.println("CACHORRO 2: ");
		System.out.println("nome: " + c2.getNome());
		System.out.println("peso: " + c2.getPeso());
		System.out.println("sexo: " + c2.getSexo());
		System.out.println("Patas: " + c2.getQtdPatas());
		c2.latir();
		
		System.out.println("CACHORRO 3: ");
		System.out.println("nome: " + c3.getNome());
		System.out.println("peso: " + c3.getPeso());
		System.out.println("sexo: " + c3.getSexo());
		System.out.println("Patas: " + c3.getQtdPatas());
		c2.latir();
	}

}
