package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class Postes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//criar variaveis
		int n = entrada.nextInt();
		int substituidos = 0;
		int consertados = 0;
		
		for(int i = 0; i < n; i++) {
			int x = entrada.nextInt();
			if(x < 50) {
				substituidos++;
			}//fim if
			if(50 <= x && x < 85) {
				consertados++;
			}//fim if
			
		}//fim for
       System.out.println(substituidos + "----" + consertados);
	}//fim main

}//fim class
