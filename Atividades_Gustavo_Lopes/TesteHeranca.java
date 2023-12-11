package Atividades_Gustavo_Lopes;

import java.util.Scanner;

public class TesteHeranca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("voce e aluno ou professor: \n" + "professor = 1 \n" + "aluno = 2");
		int escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			//instanciando um professor
			Professor p1 = new Professor();
			System.out.println("digite o nome do professor: ");
			p1.setNome(entrada.next());
			System.out.println("digite o endereco do professor: ");
			p1.setEndereco(entrada.next());
			System.out.println("digite o telefone fixo do professor: ");
			p1.setTelefone(entrada.nextInt());
			System.out.println("digite o cpf do professor: ");
			p1.setCpf(entrada.nextInt());
			System.out.println("digite o telefone celular do professor: ");
			p1.setCelular(entrada.nextInt());
			System.out.println("digite o curso do professor: ");
			p1.setNomeCurso(entrada.next());
			System.out.println("digite o salario do professor: ");
			p1.setSalario(entrada.nextFloat());
			System.out.println("DADOS DO PROFESSOR: \n" + p1.getNome() + "\n" + p1.getEndereco() + "\n" +  p1.getTelefone() + "\n" +  p1.getNomeCurso() + "\n" +  p1.getSalario());
		break;
		case 2:
			//instanciando um aluno
			Aluno a1 = new Aluno();
			System.out.println("digite o nome do aluno: ");
			a1.setNome(entrada.next());
			System.out.println("digite o endereco do aluno: ");
			a1.setEndereco(entrada.next());
			System.out.println("digite o telefone fixo do aluno: ");
			a1.setTelefone(entrada.nextInt());
			System.out.println("digite o cpf do aluno: ");
			a1.setCpf(entrada.nextInt());
			System.out.println("digite o telefone celular do aluno: ");
			a1.setCelular(entrada.nextInt());
			System.out.println("digite o curso do aluno: ");
			a1.setCurso(entrada.next());
			System.out.println("acoes:\n" + "media e aprovacao = 1");
			int escolha2 = entrada.nextInt();
			switch (escolha2) {
			case (1):
				a1.setCalcularMedia();
			    a1.setSituacaoFinal();
			break;
			}
		break;
		}
		
	}

}
