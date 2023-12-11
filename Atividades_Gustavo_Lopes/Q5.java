package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		int opcao;
		int x;
		int y;
		int soma;
		int subtracao;
		int divisao;  
		int multiplicacao;
		Scanner entrada = new Scanner(System.in);
		do {
			operacoes();//metodo do menu
		    opcao = entrada.nextInt();
			switch(opcao) {
				case 1: 
				System.out.println("digite o primeiro numero de sua adicao:");
				x = entrada.nextInt();
				System.out.println("digite o segundo numero de sua adicao:");
				y = entrada.nextInt();
				soma = x + y;
				System.out.println("o resultado de sua soma e: " + soma);
				break;
				case 2:
				System.out.println("digite o primeiro numero de sua subtracao:");
				x = entrada.nextInt();
				System.out.println("digite o segundo numero de sua subtracao:");
				y = entrada.nextInt();
				subtracao = x - y;
				System.out.println("o resultado de sua subtracao e: " + subtracao);
				break;
				case 3:
					System.out.println("digite o primeiro numero de sua divisao:");
					x = entrada.nextInt();
					System.out.println("digite o segundo numero de sua divisao:");
					y = entrada.nextInt();
					divisao = x / y;
					System.out.println("o resultado de sua divisao e: " + divisao);
					break;
				case 4:
					System.out.println("digite o primeiro numero de sua multiplicacao:");
					x = entrada.nextInt();
					System.out.println("digite o segundo numero de sua multiplicacao:");
					y = entrada.nextInt();
					multiplicacao = x * y;
					System.out.println("o resultado de sua multiplicacao e: " + multiplicacao);
					break;
			}
		}while(opcao != 0);

	}//fim main
    public static void operacoes() {
    	System.out.println("Calculadora ligada escolha uma operacao:");
    	System.out.println("1 - adicao");
    	System.out.println("2 - subtracao");
    	System.out.println("3 - divisao");
    	System.out.println("4 - multiplicacao");
    }//fim operacoes
}//fim class
