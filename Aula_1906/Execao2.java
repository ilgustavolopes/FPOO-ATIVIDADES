package Aula_1906;
import java.util.Scanner;
public class Execao2 {

	public static void main(String[] args) {
			int n1, n2;
			
			Scanner entrada = new Scanner(System.in);
		
			try {
				System.out.println("Digite o numero 1:\n");
				n1 = entrada.nextInt();
				System.out.println("Digite o numero 2:\n");
				n2 = entrada.nextInt();		
				System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
			}
			
			catch (Exception e) {
				System.out.println("ERRO: digite um numero inteiro!!!");
			}
			
	}

}
