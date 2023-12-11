package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Testeparque2 {

	public static void main(String[] args) {
        //Scanner e System (permite entrada de dados)
		Scanner entrada = new Scanner(System.in);
		//instanciando objetos
		System.out.println("informe os dados do brinquedo 1");
		System.out.println("Nome: ");
		String nomeMontanhaRussa = entrada.nextLine();//pega a linha inteira da String
		System.out.println("Altura Minima: (em metros)");
		double alturaMinimaMontanhaRussa = entrada.nextDouble();
		System.out.println("Capacidade maxima: ");
		int capacidadeMaximaMontanhaRussa = entrada.nextInt();
		//agora estamos instanciando obj da classe Brinquedo
		Brinquedo2 montanhaRussa = new Brinquedo2(nomeMontanhaRussa, alturaMinimaMontanhaRussa, capacidadeMaximaMontanhaRussa);
		
		
		System.out.println("informe os dados do visitante 1: ");
		System.out.println("Nome: ");
		String nomeVisitante1 = entrada.next();
		System.out.println("Idade: ");
		int idadeVisitante1 = entrada.nextInt();
		System.out.println("Altura: ");
		double alturaVisitante1 = entrada.nextDouble();
		Visitante2 visitante1 = new Visitante2(nomeVisitante1, idadeVisitante1, alturaVisitante1);
		System.out.println("informacoes do brinquedo: ");
		montanhaRussa.exibirinfo();
		System.out.println("informacoes do visitante: ");
		visitante1.exibirinfo();
		
		//vamos verificar se o visitante pode ou nao andar no brinquedo
		System.out.println("pode andar no brinquedo" + (visitante1.podeAndarNoBrinquedo() ? "sim" : "nao"));
		
	}

}
