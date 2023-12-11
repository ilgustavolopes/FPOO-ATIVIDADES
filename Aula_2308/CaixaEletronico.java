package Aula_2308;

public class CaixaEletronico {//serviço 24 hr (varios bancos)
	   //atributos
	  //construtores
	 //getters e setters
	//metodo especial
	public void sacar(double valor ) {
		valor = valor + 0.5;//taxa cobrada pela transaçao
		System.out.println("O seu saque no caixa eletronico foi = " + valor );
	}

}
