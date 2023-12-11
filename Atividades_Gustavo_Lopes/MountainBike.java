package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class MountainBike implements Veiculo {
	//atributos
	public int velocidade;
	public int marcha;
	public String nome;
	//construtores
	public MountainBike() {
		
	}
	public MountainBike(String nome, int velocidade, int marcha) {
		this.velocidade = velocidade;
		this.marcha = marcha;
	}
     //metodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public  int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	//metodos especiais
		@Override
		public void mudarMarcha() {
		   /* switch (marcha) {
					case (1):
						int correntes [] = {1};
					break;
					case(2):
						int correntes2 [] = {1,2};
					break;
					case(3):
						int correntes3 [] = {1,2,3};
					break;
					case(4):
						int correntes4 [] = {1,2,3,4};
					break;
					case(5):
						int correntes5 [] = {1,2,3,4,5};
					
					break;
			}*/
			Scanner entrada = new Scanner(System.in);
			String escolha = entrada.next();
			switch (escolha) {
					case ("+"):
						System.out.println("aumentando a marcha");
					break;
					case("-"):
						System.out.println("diminuindo a marcha");
					break;
					
	        }
		}

		@Override
		public void acelerar() {
			velocidade = velocidade + 1;
			System.out.println(velocidade);
		}

		@Override
		public void frear() {
			velocidade = velocidade - velocidade;
			System.out.println("frrrrrrrrrr......");
		}
}
