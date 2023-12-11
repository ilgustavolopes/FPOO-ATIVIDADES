package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Leilao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    System.out.println("Numero de lances:");
	    int numero = entrada.nextInt();
	    int v=0;
	    int[] n = {v};
	    String c= null; //variavel vazia
	    String []n1 = {c};
	    
	    for(int i = 0; i < numero; i++) {
	    	System.out.println("escreva o nome:");
	    	String c1= entrada.next();
	    	System.out.println("escreva o lance:");
	    	int lance= entrada.nextInt();
	    	if(lance > n[0]) {//condiçao para add no vetor
	    		n[0] = lance;
	    		n1[0] = c1;
	    	}
	    }
	    System.out.println(n1[0]);
	    System.out.println(n[0]);
    }
}