package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		
		int valor;
		int acogue;
		int farmacia;
		int padaria;
		int[] cf = {};
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o valor da aposentadoria:");
		valor = entrada.nextInt();
		System.out.println("digite o valor da conta do acogue:");
		acogue = entrada.nextInt();
		System.out.println("digite o valor da conta da farmacia");
		farmacia = entrada.nextInt();
		System.out.println("digite o valor da conta da padaria");
		padaria = entrada.nextInt();
		
		if(valor > acogue){
			cf[0]=1;
		}else {
			cf[0]=0;
		}if (valor > farmacia && farmacia < valor-acogue) {
			cf[1]=1;
		}else {
			cf[1]=0;
		}if (valor > padaria && padaria < valor-acogue-farmacia) {
			cf[2]=1;
		}else {
			cf[2]=0;
		}
		System.out.println("voce pagara: " + (cf[0]+cf[1]+cf[2]) + " contas");
	}
    

}
