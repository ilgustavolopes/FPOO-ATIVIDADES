package Atividades_Gustavo_Lopes;
import java.util.Scanner;
public class Cliente {//nome da classe
   //atributos
   public String CPF;
   public String Nome;
   public int Telefone;
   public int Idade;
   public double Altura;
   public double Peso;
   //metodos especiais
   //metodo calcular imc
   public double calcularIMC() {
		double IMC = Peso/(Altura * Altura);
		if(IMC < 18.5) {
			System.out.println("magreza");
		}else if(IMC < 25.0 && IMC > 18.4) {
			System.out.println("normal");
		}else if(IMC > 24.9 && IMC < 30.0) {
			System.out.println("sobrepeso");
		}
		return IMC;
   }
   ///metodo peso desejado
   public double calcularpd() {
	   Scanner entrada = new Scanner(System.in);
	   System.out.println("digite seu peso desejado:");
	   double pesodesejado = entrada.nextInt();
	   if(pesodesejado > Peso) {
		   double ganhar = pesodesejado - Peso;
		   System.out.println("voce precisa ganhar " + ganhar + "kg");
	   }else if(pesodesejado < Peso) {
		   double perder = Peso-pesodesejado;
		   System.out.println("voce precisa perder " + perder + "kg");
	   }else {
		   System.out.println("sua meta ja foi alcançada");
	   }
	return pesodesejado;
   }
   //metodo de exibir dados
   public void exibirdados() {
	   System.out.println("CPF:" + CPF);
	   System.out.println("Nome:" + Nome);
	   System.out.println("Telefone:" + Telefone);
	   System.out.println("Idade:" + Idade);
	   System.out.println("Altura:" + Altura);
	   System.out.println("Peso:" + Peso);
	   
   }
}
