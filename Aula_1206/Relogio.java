package Aula_1206;
import java.util.Scanner;
public class Relogio {

	public static void main(String[] args) {
        
        Scanner digi = new Scanner(System.in);
        System.out.println("digite o valor de r\n");
		int r = digi.nextInt();
		System.out.println("digite o valor de f\n");
		int f = digi.nextInt();
		System.out.println("digite o valor de c\n");
		int c = digi.nextInt();
        
        if(f > 3*r || c < 95 ){
        	System.out.println("diminua o ritmo");
        }else if(f < 2*r && c > 97){
        	System.out.println("aumente o ritmo");
        }else
        	System.out.println("mantenha o ritmo");
	}

}
