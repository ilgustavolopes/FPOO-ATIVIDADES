package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int num_aleatorio = (int)(Math.random()*30)+1;
        int tentativas = 0;
        int numero;
        
        System.out.println("Seja bem vindo ao jogo tente adivinhar o numero sorteado:");
         do{
        	numero = entrada.nextInt();
        	tentativas++;
        	if(numero < num_aleatorio) {
        		System.out.println("numero esta um pouco acima");
        	}else if(numero > num_aleatorio) {
        		System.out.println("numero esta um pouco menor");
        	}else if(numero == num_aleatorio) {
            	System.out.println("voce acertou!!!");
        		break;
            }
        }while(numero != num_aleatorio);//enquanto
         System.out.println("Jogo concluido seu numero sorteado foi " + num_aleatorio + " jogue novamente");
	}//fim main

}//fim class
