package Aula_1406;
import java.util.Scanner;
public class Exarray {

	public static void main(String[] args) {
	  //instanciar(criar) o vetor de notas sem os valores
	  int [] notas = new int[2];
	  int i;
	  //instanciar (criar) um obj para pegar os valores digitados
	  Scanner entrada = new Scanner(System.in);
	  //receber(escrever) as 2 notas que estao vindo do obj de entrada
	  for(i = 0; i < 2; i++) {
		  System.out.println("entre com a nota" + (i+1) + ":");
		  notas[i] = entrada.nextInt();
	  }//fim for
     //exibir(ler) os valores que estao no vetor
	  for(i = 0; i < 2; i++) {
		  System.out.printf("numero %d --> nota armazenada: %d\n", (i+1)
				  , notas[i]);
	  }
	  //exibir a media simples
	  int soma = 0;
	  for(i = 0; i < 2; i++) {
         soma = soma + notas[i];
	  }
	  int media = soma/2;// int media = soma / notas.length;
	  System.out.println("Sua media e:\n" + media);
	}//fim main

}//fim class
