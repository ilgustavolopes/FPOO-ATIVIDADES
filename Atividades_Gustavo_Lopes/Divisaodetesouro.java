package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Divisaodetesouro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("numero de moedas:");
		int A = entrada.nextInt();
		System.out.println("numero de marinheiros:");
		int N = entrada.nextInt();
		int capitao, divisao;
		capitao = 2;
		divisao = A/(N+capitao);
		
		System.out.println("e o valor do capitao sera: " + 2*divisao);
	}

}
