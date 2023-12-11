package Sorveteria;

import java.util.ArrayList;

public class Sorveteria {
	//atributos
	private double cnpj;
	private String endereco;
	private String nome;
	private String telefone;
	private ArrayList<Sorvete> lista_sorvetes;
	//construtores
	public Sorveteria() {
		
	}
	public Sorveteria(double cnpj, String endereco, String nome, String telefone, ArrayList<Sorvete> lista_sorvetes) {
		super();
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
		this.lista_sorvetes = lista_sorvetes;
	}
	//met get e set
	public ArrayList<Sorvete> getLista_sorvetes() {
		return lista_sorvetes;
	}
	public void setLista_sorvetes(ArrayList<Sorvete> lista_sorvetes) {
		this.lista_sorvetes = lista_sorvetes;
	}
	public double getCnpj() {
		return cnpj;
	}
	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	//mets special
	public void produzirSorvete() {
		System.out.println("produzindo...");
	}
	public void venderSorvete() {
		System.out.println("vendendo...");
	}
	
	
}
