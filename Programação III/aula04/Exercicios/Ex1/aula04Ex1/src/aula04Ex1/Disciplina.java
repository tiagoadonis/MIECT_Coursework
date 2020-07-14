package aula04Ex1;
import java.util.*;

public class Disciplina {
	private String nome, area;
	private int ECTS;
	private Professor responsavel;
	private List<Estudante> alunos;
	
	public Disciplina(String nome, String area, int ECTS, Professor responsavel) {
		this.nome = nome;
		this.area = area;
		this.ECTS = ECTS;
		this.responsavel = responsavel;
		this.alunos = new ArrayList<>();
	}
	
	public boolean addAluno(Estudante est) {
		if (alunoInscrito(est.nMec())) {
			return false;
		}
		return alunos.add(est);
	}
	
	public boolean delAluno(int nMec) {
		for (Estudante a : alunos) {
			if (a.nMec() == nMec) {
				return alunos.remove(a);
			}
		}
		return false;
	}
	
	public boolean alunoInscrito(int nMec) {
		for (Estudante a : alunos) {
			if (a.nMec() == nMec) {
				return true;
			}
		}
		return false;
	}
	
	public int numAlunos() {
		return alunos.size();
	}
	
	public Estudante[] getAlunos() {
		return this.alunos.toArray(new Estudante[0]);
	}
	
	public Estudante[] getAlunos(String tipo) {
		List<Estudante> tmp = new ArrayList<>();
		for(Estudante a : getAlunos()) {
			if (a.getClass().toString().contains(tipo)) {
				tmp.add(a);
			}
		}
		return tmp.toArray(new Estudante[0]);
	}
	
	@Override
	public String toString() {
		return "Disciplina: "+this.nome+" ("+this.ECTS+" ECTS) da Area de "+this.area;
	}
}
