package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
		//Scanner entrada
		Scanner entrada = new Scanner(System.in);
		// instanciando os obsjetos
		System.out.println("CRIANDO CASA 1: ");
		//instanciando obj quarto e sala da casa 1
		System.out.println("Quarto da casa: " + "\nDigite quantas camas seu quarto possuira");
		Quarto q1 = new Quarto();
		q1.setNumeroCamas(entrada.nextInt());
		System.out.println("Digite o nome do quarto");
		q1.setNome(entrada.next());
		System.out.println("Sala da Casa: " + "\nDigite se a sala tera TV ou nao");
		Sala s1 = new Sala();
		s1.setTemTV(entrada.nextBoolean());
		System.out.println("Digite o nome da sala");
		s1.setNome(entrada.next());
		//instanciando a casa
		Casa c1 = new Casa( s1, q1 );//objs sala e quarto foram coloscasdos aqui
		System.out.println("Casa: " + "\nDigite a cor da casa");
		c1.set(entrada.next());
		System.out.println("Digite o preco da casa");
		c1.setPreco(entrada.nextFloat());
		System.out.println("Digite a metragem da casa");
		c1.setMetragem(entrada.nextFloat());
		//chamando metodo de exibir infos da casa
		c1.mostrarDetalhes();
	}

}
