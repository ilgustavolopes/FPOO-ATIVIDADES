package Aula_0409;

public class TesteEmpregado {

	public static void main(String[] args) {
		// instancia de obj
		Pessoa pes1 = new Pessoa("Eletrecista", "Aristoteles-da-Silva", 120);
		Empregado1 emp1 = new Empregado1(1500.01,pes1);//empregado é um tipo de pessoa
		Empregado1 emp2 = new Empregado1();
		System.out.println("cargo: " + pes1.cargo);
		System.out.println("salario: " + emp1.getSalario());
		
	}

}
