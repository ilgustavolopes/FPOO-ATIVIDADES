package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		System.out.println("digite os numeros:");
		while(true){
				int numero = entrada.nextInt();
				if (numero <=0) {
					break;
				}
				 soma = soma + numero;
		}
		System.out.println("resultado da soma: " + soma);
	}
}
