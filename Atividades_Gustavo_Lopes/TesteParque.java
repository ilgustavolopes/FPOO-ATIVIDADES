package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class TesteParque {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//instanciando o brinquedo com construtor com parametros 1
		System.out.println("Qual brinquedo deseja ir:");
		Brinquedo b1 = new Brinquedo(entrada.nextLine(), entrada.nextDouble(), entrada.nextInt());
		
		//instanciando o visitante 1
		System.out.println("digite seus dados:");
		Visitante v1 = new Visitante(entrada.next(), entrada.nextInt(), entrada.nextDouble());
		
		//estrutura para escolher os metodos
		System.out.println("digite oque voce deseja fazer: \n" + "0:  exibir informacoes \n" + "1:  posso andar no brinquedo");
		int escolha = entrada.nextInt();
		switch (escolha) {
		    
			case (0):
				b1.exibirinfo();//exibir infomaçoes
			break;
			
			case (1):
				v1.PodeAndarNoBrinquedo();//saber se pode andar no brinquedo
			break;
			
		}//fim switch

	}//fim main

}//fim class
