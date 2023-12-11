package Aula_2308;

import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// instancia de objetos
		CaixaEletronico cel = new CaixaEletronico();
		System.out.println("digite seu saque");
		cel.sacar(entrada.nextDouble());
		Caixa cx = new Caixa();
		System.out.println("digite seu saque");
		cx.sacar(entrada.nextDouble());
		Santander st = new Santander();
		System.out.println("digite seu saque");
		st.sacar(entrada.nextDouble());

	}

}
