package Aula_1906;

public class Execao5 {

	public static void main(String[] args) {
		String frase = "senai";
		String nova_frase = null;
		try {
			nova_frase = frase.toUpperCase();
		}//fim do try
		catch (Exception e) {
			System.out.println("frase inicial esta nula, por isso possui um valor default");
			System.out.println(e.getMessage());
			e.printStackTrace();
			frase = "frase vazia";
		}//fim catch
        finally {
        	nova_frase = frase.toUpperCase();
        }//fim finally
		System.out.println("frase antiga: " + frase + " minusculo");
		System.out.println("frase antiga: " + nova_frase + " MAIUSCULO");
	}//fim main
}//fim class
