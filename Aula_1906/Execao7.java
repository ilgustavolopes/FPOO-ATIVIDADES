package Aula_1906;
import java.util.Scanner;
public class Execao7 {

	public static void main(String[] args) {
		
		String cpf;//123.456.789-00 valido! senao invalido!
		Scanner entrada = new Scanner(System.in);
		while(true) {
			
			try {
					System.out.println("digite o cpf:");
					cpf = entrada.nextLine();
					if(!validarCPF(cpf)) {
						throw new IllegalArgumentException("CPF invalido!" + "digite novamente!");
					}//fim if
					break;
			}//fim try
			catch(IllegalArgumentException e){
						System.out.println(e.getMessage());
			}//fim catch
			
		}//fim while
		
		System.out.println("CPF valido " + cpf);
		entrada.close();
	}//fim main
		
		//criar metodo(funcao) para validar CPF
		public static boolean validarCPF(String cpf) {//boolean pq ou digitou certo ou errado
			//eliminar caracteres especiais ç ã é
			cpf = cpf.replaceAll("\\D", "");
			//verifica quantidade de caracteres
			if(cpf.length() !=11) {
				return false;
			}//fim if
			//verificar se os digitos sao todos iguais
			if(cpf.matches("\\d\\\1{10}")) {
				return false;
			}//fim if
			return true;
		}//fim metodo cpf
}//fim funçao
