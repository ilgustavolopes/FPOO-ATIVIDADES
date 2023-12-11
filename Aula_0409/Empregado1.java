package Aula_0409;

public class Empregado1 {
		//atributos
		private double salario;
		private Pessoa funcionario; //composiçao
		//cons
		public Empregado1() {
			
		}
		public Empregado1(double salario, Pessoa funcionario) {
			this.salario = salario;
			this.funcionario = funcionario;
		}
		//mets sets e gets
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public Pessoa getFuncionario() {
			return funcionario;
		}
		public void setFuncionario(Pessoa funcionario) {
			this.funcionario = funcionario;
		}
}
