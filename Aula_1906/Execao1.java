package Aula_1906;

public class Execao1 {

	public static void main(String[] args) {
			  try {
				int conta = 10 / 0;
			  } 
			  catch (Exception e) {
				System.out.println(e);
				//so o erro
				System.out.println(e.getMessage());
				//mostre a linha que deu erro
				e.printStackTrace();
			  }
			  System.out.println("continuando meu codigo");
	}

}
