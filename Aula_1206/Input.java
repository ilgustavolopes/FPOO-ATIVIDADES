package Aula_1206;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		//instancia ("criar") de objeto objin
		Scanner objin = new Scanner(System.in);
		System.out.println("digite o valor de a\n");
		int a = objin.nextInt();
		System.out.println("digite o valor de b\n");
		int b = objin.nextInt();
		
		if(a > b) {
			//System.out.printf("%d\n" + a);
			System.out.println("valor de a:" + a );
		}else
			System.out.println("valor de b:" + b);
	    }
	}


