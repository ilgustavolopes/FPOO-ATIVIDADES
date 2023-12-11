package Sorveteria;

public class Funcionario extends Pessoa {
	//atributos
	private float salario;
	private String turno;
	//construtores
	public Funcionario() {
		super();
	}
	public Funcionario(float salario, String turno) {
		this.salario = salario;
		this.turno = turno;
	}
	//mets special
	public void fazerFuncao() {
		System.out.println("Trabalhando.....");
	}
	//get e set
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
}
