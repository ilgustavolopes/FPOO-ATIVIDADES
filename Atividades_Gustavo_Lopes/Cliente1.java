package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Cliente1 {
	public static void main(String[] args) {
		
		//instanciei um novo cliente e darei valor a seus atributos
		Cliente C1 = new Cliente();
		//dei um CPF ao cliente
		C1.CPF = "11111111";
		//dei um nome ao cliente
		C1.Nome = "Gustavo";
		//dei um telefone ao cliente
		C1.Telefone = 1932114000;
		//dei uma idade a este cliente
		C1.Idade = 19;
		//dei uma altura ao cliente
		C1.Altura = 1.92;
		//dei um peso ao cliente
		C1.Peso = 60.00;
		
		//criando estrutura de escolha
		Scanner entrada = new Scanner(System.in);
		int escolha = entrada.nextInt();
		
		switch (escolha) {
		case (1):
			//calcular imc
			C1.calcularIMC();
		break;
		case (2):
			//calcula pd
			C1.calcularpd();
		break;
		case (3):
			//exibir dados
			C1.exibirdados();
		break;
		}
		
	}// fim main
}//fim class
