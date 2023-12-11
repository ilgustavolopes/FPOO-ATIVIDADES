package Aula_1906;

public class Execao4 {

	public static void main(String[] args) {
		int vet[] = {10,20,30,40};
		System.out.println("oi 1");
		try {
			int v = vet[0];
			System.out.println("ultimo elemento e:" + v);
		} catch (Exception e) {
			System.out.println("nao exceda o tamanho do array" + e);
		}
		System.out.println("oi 2");
		System.out.println("oi 3");
	}

}
