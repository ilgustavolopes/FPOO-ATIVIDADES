package Aula_1906;
import java.util.Scanner;
public class Execao3 {
	//minha senha
    public static final String minha_senha = "123";//final vira constante
    
	public static void main(String[] args) {
		boolean senha_correta = false;
		while(!senha_correta) {
			try {
					Scanner entrada = new Scanner(System.in);
					System.out.println("Digite sua senha:");
					String senha_digitada = entrada.nextLine();
						if(!senha_digitada.equals(minha_senha)) {
							throw new Exception("Senha invalida!");
						}//fim if
					System.out.println("senha correta...");
					senha_correta = true;
			}
			catch(Exception e){
				System.out.println(e.getLocalizedMessage());
			}
		}//fim while
	}//fim main
}//fim class
