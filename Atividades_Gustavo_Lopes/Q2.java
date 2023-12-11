package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int menor = 0;//armazena o menor numero digitado pelo usuario
		int numeros;//armazena numeros digitados pelo usuario
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite os numeros:");
		boolean primeiro_numero = true;//confirma qual é o menor numero
		while(true){
				numeros = entrada.nextInt();
				if (numeros == 0) {
					break;
				}
				if(primeiro_numero) {
					menor = numeros;
					primeiro_numero = false;
				}else if(numeros < menor) {
					menor = numeros;
				}	
		}//fim while
		if(primeiro_numero) {
			System.out.println("nenhum numero foi digitado!");
		}else {
			System.out.println("o menor numero digitado foi:" + menor);
		}
	}//fim main
}//fim class
