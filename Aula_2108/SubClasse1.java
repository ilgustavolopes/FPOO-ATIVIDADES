package Aula_2108;

public class SubClasse1 extends ClassePai {
	
	//constructor
	public SubClasse1() {
		super();
		nome = super.nome;
		System.out.println("imprima na subclasse1");
		super.metodoImprimir();//esse metodo esta na ClassePai
	}
	
}
