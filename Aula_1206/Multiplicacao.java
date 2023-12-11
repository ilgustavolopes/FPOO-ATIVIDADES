package Aula_1206;

import javax.swing.JOptionPane;

public class Multiplicacao {
  public static void main(String []args) {
	  String primeiroNumero;
	  String segundoNumero;
	  
	  float numero1;
	  float numero2;
	  float multiplicacao;
	  
	  primeiroNumero = JOptionPane.showInputDialog("Entre com o 1° número:");
	  segundoNumero = JOptionPane.showInputDialog("Entre com o 2° número:");
	  
	  numero1 = Float.parseFloat(primeiroNumero);
	  numero2 = Float.parseFloat(segundoNumero);
	  
	  multiplicacao = numero1 * numero2;
	  
	  JOptionPane.showMessageDialog(null, "A multiplicação é " + multiplicacao);
	  System.out.println("A multiplicção é:" + multiplicacao);
  }
}
