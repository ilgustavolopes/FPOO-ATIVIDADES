package Aula_0208;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		
		do {
			exibirMenu();//metodo (acao) construido fora do main
			
		    opcao = entrada.nextInt();//opcao recebe entrada
			
			switch(opcao) {
				case 1: System.out.println("opcao 1 selecionada");
				break;
				case 2: System.out.println("opcao 2 selecionada");
				break;
				case 3: System.out.println("opcao 3 selecionada");
				break;
				default: System.out.println("escolha as opcoes de 1 a 3");
				break;
			}//fim switch
			
		}while(opcao != 0);//fim do
		
	}//fim main
	
	//metodo para exibir menu de opcoes (fora do main)
		public static void exibirMenu() {
			System.out.println("Selecione uma opcao:");
			System.out.println("1 - lanches");
			System.out.println("2 - bebidas");
			System.out.println("3 - sobremesas");
			System.out.println("0 - sair");
		}//fim exibir menu

}//fim class
