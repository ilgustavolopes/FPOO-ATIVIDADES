package Sorveteria;
import java.util.ArrayList;
import java.util.Scanner;
public class TesteSorveteria {

	public static void main(String[] args) {
		Sorvete so1 = new Sorvete("chocolate", "mel", 1.99);//instanciando sorvetes
		Sorvete so2 = new Sorvete("morango", "chocolate", 1.99);
		ArrayList<Sorvete> lista_sorvete = new ArrayList<Sorvete>();
		lista_sorvete.add(so1);
		lista_sorvete.add(so2);
		//instanciando sorveteria
		Sorveteria s1 = new Sorveteria(12234, "rua angelo picoles", "Sorveteria Gellatos", "11111", lista_sorvete);//instanciando sorveteria
		//instanciando funcionario e cliente
		Funcionario f1 = new Funcionario(1200,"A");
		Cliente c1 = new Cliente();//String nome, char sexo, int idade, double cpf, int senha
		//entre com seus dados
		Scanner entrada = new Scanner(System.in);
		System.out.println("Seja bem vindo a sorveteria" + s1.getNome());
		System.out.println("digite seu nome:");
		c1.setNome(entrada.next());
		System.out.println("digite seu sexo:");
		c1.setSexo(entrada.next().charAt(0));
		System.out.println("digite sua idade:");
		c1.setIdade(entrada.nextInt());
		System.out.println("digite seu cpf:");
		c1.setCpf(entrada.nextDouble());
		System.out.println("digite sua senha:");
		c1.setSenha(entrada.nextInt());
		//falta implementar o resto
		System.out.println("Cardapio:");
		for (Sorvete sorvetolho : lista_sorvete) {
			System.out.println(sorvetolho.getSabor() + "/" +sorvetolho.getAcompanhamento() + "/" + sorvetolho.getPreco());
		}
		System.out.println("\n");
		//estrutura de escolha
		System.out.println("1-" + so1.getSabor() + "\n2-" + so2.getSabor());
		int key = entrada.nextInt();
		switch (key) {
		case 1:
			System.out.println("Voce escolheu a opcao de sorvete " + so1.getSabor());
			break;
		case 2:
			System.out.println("Voce escolheu a opcao de sorvete " + so2.getSabor());
			break;
		}
	}

}
