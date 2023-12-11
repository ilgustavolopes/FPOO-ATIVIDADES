package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero 1:");
		int n1 = entrada.nextInt();
		System.out.println("Digite o numero 2:");
		int n2 = entrada.nextInt();
		int mmc = calcularMMC(n1, n2);
		System.out.println("O MMC de " + n1 + " e " + n2 + " = " + mmc);
	}//fim main
	//metodo de mmc
    public static int calcularMMC(int n1, int n2) {
    	int maior = Math.max(n1, n2);
    	int mmc = maior;
    	while(true) {
    		if(mmc % n1 == 0 && mmc % n2 == 0) {
    			break;
    		}//fim if
    		mmc = mmc + maior;
    	}//fim while
		return mmc;
    }//fim metodo
    
}//fim class
