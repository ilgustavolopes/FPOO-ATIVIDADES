package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Cobra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int n;
		int[] cobra =new int [4];
		
		cobra[0] = entrada.nextInt();
		cobra[1] = entrada.nextInt();
		cobra[2] = entrada.nextInt();
		cobra[3] = entrada.nextInt();
		
		
			if(cobra[0] == cobra[2] || cobra[1] == cobra[3]) {
				System.out.println("V");
			}else {
				System.out.println("F");
			}
		
		
		
	}

}
