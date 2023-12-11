package Aula_2308;

public class TesteSobreCarga {

	public static void main(String[] args) {
		// instancia de obj
		SobreCarga sob = new SobreCarga();
		System.out.println(sob.soma(1.5, 2.8));
		System.out.println(sob.soma(5, 9));
		System.out.println(sob.soma("Ciao ", "Giuseppe tutto bene, grazie mille per pollo"));
		sob.soma(1, 2, 3);
	}

}
