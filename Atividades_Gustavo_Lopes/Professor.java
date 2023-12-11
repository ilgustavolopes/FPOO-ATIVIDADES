package Atividades_Gustavo_Lopes;

import Aula_2108.SuperClasse;

public class Professor extends Pessoa {
	
	//atributos
	private String nomeCurso;
	private float salario;
	
	//construtor
	Professor(){
	   super();
	}
	
	Professor(String nomeCurso, float salario){
		
	}
	
	//metodos get e set
	//nome do curso
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	//salario do professor
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
