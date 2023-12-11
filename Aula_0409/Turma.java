package Aula_0409;
import java.util.List;
public class Turma {
	//atributos
	public String nome;
	private List <Estudante>  estudantes;//agregacao
	//construtor
	public Turma() {
		
	}
	public Turma(String nome, List <Estudante> estudantes) {
		this.estudantes = estudantes;
		this.nome = nome;
	}
	//met set e get
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List <Estudante> getEstudantes() {
		return estudantes;
	}
	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}
}
