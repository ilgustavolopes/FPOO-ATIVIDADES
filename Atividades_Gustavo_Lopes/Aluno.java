package Atividades_Gustavo_Lopes;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aluno extends Professor {
	
	//atributos
	private String curso;
	private float nota;
	//construtor
	Aluno(){
		super();
	}
	Aluno(String curso, float nota){
		this.curso = curso;
		this.nota = nota;
	}
	//metodos get e set
	//curso
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	//nota
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	//metodos especiais
	public void setCalcularMedia() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("entre com sua primeira nota");
		float n1 = entrada.nextFloat();
		System.out.println("entre com sua segunda nota");
		float n2 = entrada.nextFloat();
		nota = (n1 + n2)/2;
		System.out.println("sua media foi: " + nota);
	}
	public void setSituacaoFinal() {
		if(nota >= 7)
			System.out.println("Voce foi aprovado, parabens");
		else
			System.out.println("voce nao foi aprovado, sinto muito");
	}
	
}
