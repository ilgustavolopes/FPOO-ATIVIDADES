package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Var {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.println("entre com o valor de x");
		int X = entrada.nextInt();
		System.out.println("entre com o valor de y");
		int Y = entrada.nextInt();
		
		if (X < -8 || X > 8 || Y < 0 || Y > 8)
			System.out.println("valido");
		else
			System.out.println("anulado");

	}

}
