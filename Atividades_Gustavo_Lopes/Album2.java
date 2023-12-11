package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class Album2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();//qtdade de espaços no album
		int m = entrada.nextInt();//qtdade de figurinhas compradas
		//variavel booleana para verificar se tem ou nao a figurinha
		Boolean[] ja_tenho = new Boolean[n];
		int x = 0;//fig compradas
		//varrendo o vetor
		for(int i = 0; i < n; i++)
			ja_tenho[i] = false;
		//fig que ja temos!!
		for(int i = 0; i < n; i++) {
			x = entrada.nextInt();
			ja_tenho[x] = true;
		}
		int repetidas = 0;
		//vamos marcar as repetidas agora
		for(int i = 0; i < m; i++)
			if(ja_tenho[i])
				repetidas++;
        //vamos contar a qtdade de fig repetidas
		System.out.println("repetidas =" + (n - repetidas));
		System.out.println("repetidas =" + repetidas);
		System.out.println("tamanho album =" + n);
		System.out.println("quatidade de figurinhas =" + m);
		
	}

}
