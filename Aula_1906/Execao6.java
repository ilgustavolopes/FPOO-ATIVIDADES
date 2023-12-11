package Aula_1906;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Execao6 {

	public static void main(String[] args) {
		try {
			File arquivo = new File("C:\\Users\\Instrutor\\Desktop\\texto.txt");
			Scanner entrada = new Scanner(arquivo,"UTF-8");
			while(entrada.hasNextLine()) {
				String linha = entrada.nextLine();
				System.out.println("texto do arquivo: " + linha);
			}//fim while
			entrada.close();
		}//fim try
		catch(FileNotFoundException e) {
			System.out.println("o arquivo nao foi encontrado!");
		}//fim catch
		catch(Exception e) {
			System.out.println("ocorreu um erro durante a leitura do arquivo:" +e.getMessage());
		}//fim catch
		System.out.println("o programa foi encerrado!");
	}//fim main
}//fim class
