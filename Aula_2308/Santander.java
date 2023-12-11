package Aula_2308;

public class Santander extends CaixaEletronico{
	@Override
	public void sacar(double valor ) {
		valor = valor + 3.2;//taxa cobrada pela transaçao
		System.out.println("O seu saque no Santander foi = " + valor );
	}
}
