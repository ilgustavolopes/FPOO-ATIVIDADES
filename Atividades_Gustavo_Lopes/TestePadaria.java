package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("BUONGIORNO SEJA BEM-VINDO A PADARIA NOI SIAMO ITALIANNI");
			//instanciando cliente
			ClientePadaria c1 = new ClientePadaria();
			System.out.println("digite seu nome:");
			c1.setNome(entrada.next());
		
		    System.out.println("Escolha seu produto: \n Bolo \n Doce \n Pao");
		    String escolhas = entrada.next();
			switch (escolhas) {
					case ("Bolo"):
								//instancia de bolo
								Bolo b1 = new Bolo();
						        System.out.println("digite o nome do seu bolo:");
						        b1.setNome(entrada.next());
						        System.out.println("digite o preco do seu bolo:");
						        b1.setPreco(entrada.nextDouble());
						        System.out.println("Voce selecionou um " + b1.getNome());
						        System.out.println("Total da compra: " + (b1.getPreco()));
						        System.out.println("voce chegou em casa, deseja guardar seu produto na geladeira ou comer");
						        String escolhas2 = entrada.next();
						        switch (escolhas2) {
									case ("guardar"):
										System.out.print("guardado na geladeira");
									break;
									case("comer"):
										System.out.println("voce comeu o bolo");
									break;
								}
				        
					break;
		
					case("Doce"):
									//instancia de doce
									Doce d1 = new Doce();
							    	System.out.println("digite o nome do seu doce:");
							    	d1.setNome(entrada.next());
							    	System.out.println("digite o preco do seu doce:");
							    	d1.setPreco(entrada.nextDouble());
							    	System.out.println("Voce selecionou um " + d1.getNome());
							        System.out.println("Total da compra: " + (d1.getPreco()));
							        System.out.println("voce chegou em casa, deseja guardar seu produto na geladeira ou comer");
							        String escolhas3 = entrada.next();
							        switch (escolhas3) {
										case ("guardar"):
											System.out.println("guardado na geladeira");
										break;
										case("comer"):
											System.out.println("voce comeu o bolo");
										break;
									}
					break;
					case("Pao"):
									//instancia de pao
									Pao p1 = new Pao();
							    		System.out.println("digite o nome  do seu pao:");
							    		p1.setNome(entrada.next());
							    		System.out.println("digite o preco do seu pao:");
							    		p1.setPreco(entrada.nextDouble());
							    		System.out.println("Voce selecionou um " + p1.getNome());
								        System.out.println("Total da compra: " + (p1.getPreco()));
								        System.out.println("voce chegou em casa, deseja guardar seu produto na geladeira ou comer");
								        String escolhas4 = entrada.next();
								        switch (escolhas4) {
											case ("guardar"):
												System.out.println("guardado na geladeira");
											break;
											case("comer"):
												System.out.println("voce comeu o bolo");
											break;
										}
					break;
			}//fim switch
	}//fim main
}//fim classe
