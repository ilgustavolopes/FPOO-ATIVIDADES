package Atividades_Gustavo_Lopes;
import java.util.Scanner;
import java.time.LocalDate;
public class TesteVoo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// instanciando Voo
	   Voo A = new Voo();
	   A.setNumeroVoo(001);
	   A.setOrigem("Sao Paulo");
	   A.setDestino("Napoli");
	   A.setPreco(15.53);
	  A.setDataIda("06/09/2023");
	  A.setDataVolta("06/09/2024");
	  //instancia de voo2
	  Voo B = new Voo();
	   B.setNumeroVoo(002);
	   B.setOrigem("Sao Paulo");
	   B.setDestino("Rio de Janeiro");
	   B.setPreco(5.53);
	  B.setDataIda("11/09/2023");
	  B.setDataVolta("15/09/2024");

		
	  //instanciando cliente
	  Passageiro p1 = new Passageiro();
	  System.out.println("Seja bem vindo ao sistema de compra de passagem da GusAir");
	  System.out.println("Digite seu email: ");
	  p1.setEmail(entrada.next());
	  System.out.println("Digite seu nome: ");
	  p1.setNome(entrada.next());
	  System.out.println("Digite seu sobrenome: ");
	  p1.setSobreNome(entrada.next());
	  System.out.println("----------" + "LOGADO" + "----------");
	  
	  //estrutura de compra
	  System.out.println("Deseja compra qual passagem:\n" + "1: SP-NAP\n" + "2: SP-RJ");
	  int escolha = entrada.nextInt();
	  switch (escolha) {
	    case 1:
	    	Passagem passagem1 = new Passagem(A,p1,A.getPreco());
	    	System.out.println("voce comprou a passagem 1");
	    	System.out.println("---------Nota Fiscal---------");
	    	passagem1.toStringParaguai();
		break;
	    case 2:
	    	Passagem passagem2 = new Passagem(B,p1,B.getPreco());
	    	System.out.println("voce comprou a passagem 2");
	    	System.out.println("---------Nota Fiscal---------");
	    	passagem2.toStringParaguai();
		break;
	}
	}

}
