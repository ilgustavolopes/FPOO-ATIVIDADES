package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Contas2 {

	public static void main(String[] args) {
		int valor;
		int acogue;
		int farmacia;
		int padaria;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o valor da aposentadoria:");
		valor = entrada.nextInt();
		System.out.println("digite o valor da conta do acogue:");
		acogue = entrada.nextInt();
		System.out.println("digite o valor da conta da farmacia");
		farmacia = entrada.nextInt();
		System.out.println("digite o valor da conta da padaria");
		padaria = entrada.nextInt();
		
		if(valor >= (acogue+farmacia+padaria)) {
			System.out.println("3");
		}else if(valor >= (acogue + farmacia) || valor >= (acogue + padaria)) {
			System.out.println("2");
		}else if (valor >= acogue || valor >= farmacia || valor >= padaria) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}

}
