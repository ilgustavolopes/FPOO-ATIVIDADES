package Aula_1206;

public class Switch1 {

	public static void main(String[] args) {
		    int idade = 70;
			switch (idade) {
			case (10):
				System.out.println("Voce e menor de idade");
			break;
			case (18):
				System.out.println("Voce e maior de idade");
			break;
			case (70):
				System.out.println("Experiente!");
			break;
			default:
				System.out.println("Nenhuma idade valida!");
			break;
			}
	}

}
