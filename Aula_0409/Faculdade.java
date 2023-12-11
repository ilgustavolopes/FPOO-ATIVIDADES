package Aula_0409;

import java.util.List;

public class Faculdade {
	//faculdade
	public String nomeFacul;
	private List<Turma> cursos;
	//construtor
	public Faculdade() {
		
	}
	public Faculdade(String nomeFacul, List<Turma> cursos) {
		this.cursos = cursos;
		this.nomeFacul = nomeFacul;
	}
	//met get e set
	public String getNomeFacul() {
		return nomeFacul;
	}
	public void setNomeFacul(String nomeFacul) {
		this.nomeFacul = nomeFacul;
	}
	public  List<Turma> getCursos(){
		return cursos;
	}
	public void setCursos(List<Turma> cursos) {
		this.cursos = cursos;
	}

	//metodos specials]
	public int getTotalEstudantes() {
		int nEstudantes = 0;
		List<Estudante> estudante;
		for(Turma vassoura : cursos) {
			estudante = vassoura.getEstudantes();
			for(Estudante espanador : estudante) {
				nEstudantes++;
			}
		}
		return nEstudantes;
	}
	
}
