package Aula_2308;

public class Caixa extends CaixaEletronico {//BANCO caixa economica federal
	//metodo
	@Override
	public void sacar(double valor ) {
		valor = valor + 0.9;//taxa cobrada pela transaçao
		System.out.println("O seu saque na caixa economica federal foi = " + valor );
	}

}
