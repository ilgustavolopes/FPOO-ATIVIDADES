package Aula_0409;

import java.util.ArrayList;
import java.util.List;

public class TesteFaculdade {

	public static void main(String[] args) {
		// instancia da classe estudante
		Estudante e1 = new Estudante("Pedro", 1, "DEV");
		Estudante e2 = new Estudante("Tiago", 2, "DEV");
		Estudante e3 = new Estudante("Joao", 3, "DEV");
		Estudante e4 = new Estudante("Lucas", 4, "MED");
		//criando a lista vazia de estudantes
		List<Estudante> dev = new ArrayList<Estudante>();
		//adicionar os alunos criados a lista de dev
		dev.add(e1);
		dev.add(e2);
		dev.add(e3);
		//mostrando alunos que estao na lista
		System.out.println("ESTUDANTES DE DEV");
		int i2 = 0;
		for(Estudante vassoura: dev) {
			System.out.println(i2 + ": " + vassoura.nome + ", " + vassoura.curso + ", " + vassoura.ra);
			i2++;
		}
		//vamos add  os alunos 4 na nova lista ed medicina
		System.out.println("\nESTUDANTES DE MEDICINA");
		List<Estudante> med = new ArrayList<Estudante>();//lista med
		med.add(e4);
		int i3 = 0;
		for(Estudante esfregao: med) {
			System.out.println(i3 + ": " + esfregao.nome + ", " + esfregao.curso + ", " + esfregao.ra);
			i3++;
		}
		//instancia da classe turma
		Turma DEV = new Turma("DEV", dev);
		Turma MED = new Turma("MED", med);
		//agora criei uma lista de turmas p/ adicionar os alunos a ela
		List<Turma> tur = new ArrayList<Turma>();
		tur.add(MED);
		tur.add(DEV);
		//ler a lista das turmas
		System.out.println("\nTURMAS DA FACULDADE");
		for(int i = 0; i < tur.size(); i++) {
			System.out.println("Turma " + tur.get(i).getNome());
		}
		//instancia da classe faculdade
		System.out.println("\nFACULDADE");
		Faculdade dadefacul = new Faculdade("LOPES University", tur);
		System.out.println("Nome da faculdade: " + dadefacul.getNomeFacul());
		System.out.println("total de estudantes na faculdade e: "  + dadefacul.getTotalEstudantes());
		

	}

}
