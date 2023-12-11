package Aula_0409;

public class TesteBanco {

	public static void main(String[] args) {
		//teste associaçao
		//instanciando objs
		Banco b1 = new Banco("Caixa");
		Empregado e1 = new Empregado("Democrito");
		//testando som a e ..... 1,2,2,1....som..e...e...e....o....o.
		System.out.println("O empregado " + e1.getNome() + " trabalha no Banco " + b1.getNome());

	}

}
