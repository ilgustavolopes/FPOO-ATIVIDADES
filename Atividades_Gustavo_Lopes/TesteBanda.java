package Atividades_Gustavo_Lopes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TesteBanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// instanciando membros da banda
		System.out.println("Nome do Vocalista:");
		Vocalista v1 = new Vocalista(entrada.next());
		System.out.println("Nome do baixista:");
		Baixista b1 = new Baixista(entrada.next());
		System.out.println("Nome do baterista");
		Baterista ba1 = new Baterista(entrada.next());
		System.out.println("Nome do guitarrista:");
		Guitarrista g1 = new Guitarrista(entrada.next());
		//criando a lista vazia de membros da banda
	    List <MembroBanda> lista = new ArrayList<MembroBanda>();
		lista.add(v1);
		lista.add(b1);
		lista.add(ba1);
		lista.add(g1);
		//instanciando a banda
		System.out.println("Digite o nome da sua banda:");
		Banda banda = new Banda(entrada.next(),  lista);
		//lendo a lista de membros
		System.out.println("Membros da banda:");
		for(MembroBanda vassoura : lista) {
			System.out.println(vassoura.getNome());
		}
		banda.horaDoShow();
		System.out.println("Deseja entra no Show: Sim ou Nao");
		String escolha = entrada.next();
		switch (escolha) {
			case "Sim":
				v1.tocar();
				b1.tocar();
				ba1.tocar();
				g1.tocar();
			break;
			case "Nao":
				System.out.println("Proximo show dia 20 de outubro");
			break;
		}
		
	}

}
