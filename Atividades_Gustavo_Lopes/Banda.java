package Atividades_Gustavo_Lopes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Banda {
	//atributos
	private String nome;
	private List<MembroBanda> membros = new ArrayList<MembroBanda>();//lista vazia
	//construtores
	public Banda() {
		
	}
	public Banda(String nome, List<MembroBanda>membros) {
		this.nome = nome;
	    this.membros = membros;
	}
	//metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//metodos specials
	public void addMembro() {
	   //so consegui no teste
	}
	public void horaDoShow() {
				System.out.println("TA NA HORA DO SHOWWWW");
	}
}
