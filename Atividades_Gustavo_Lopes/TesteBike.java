package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class TesteBike {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//instanciando bike speed
		System.out.println("SPEED BIKE");
		SpeedBike spb1 = new SpeedBike();
		System.out.println("Digite o nome da sua bike:");
		spb1.setNome(entrada.next());
		System.out.println("Digite a velocidade da sua bike:");
		spb1.setVelocidade(entrada.nextInt());
		System.out.println("Digite quantas marchas possui a bike:");
		spb1.setMarcha(entrada.nextInt());
		
		//instanciando bike mountain
		System.out.println("MOUNTAIN BIKE");
		MountainBike mb1 = new MountainBike();
		System.out.println("Digite o nome da sua bike:");
		mb1.setNome(entrada.next());
		System.out.println("Digite a velocidade da sua bike:");
		mb1.setVelocidade(entrada.nextInt());
		System.out.println("Digite quantas marchas possui a bike:");
		mb1.setMarcha(entrada.nextInt());
		
		//fazendo os ragazzos comprarem as bikes
		System.out.println("DONOS DAS BIKES");
		PessoaBike pb1 = new PessoaBike("Paulo");
		PessoaBike pb2 = new PessoaBike("Apolo");
	
		System.out.println("A pessoa " + pb1.nome + " comprou a bike " + spb1.nome + " que possui " + spb1.marcha 
				+ " marchas e velocidade de " + spb1.velocidade + "km/h");
		System.out.println("A pessoa " + pb2.nome + " comprou a bike " + mb1.nome + " que possui " + mb1.marcha 
				+ " marchas e velocidade de " + mb1.velocidade + "km/h");
		
		//fazendo-os andarem nas bikes

		System.out.println( pb1.nome + " subiu na " + spb1.nome + " e esta pedalando");
		spb1.mudarMarcha();
		spb1.acelerar();
		spb1.acelerar();
		spb1.frear();
		System.out.println("cansou");
		
		System.out.println( pb2.nome + " subiu na" + mb1.nome + " e esta pedalando");
		mb1.mudarMarcha();
		mb1.acelerar();
		mb1.acelerar();
		mb1.frear();
		System.out.println("cansou");
		
	}

}
