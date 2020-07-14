package aula04Ex3;
@SuppressWarnings("all")

public class Estudante extends Cliente{
	private int numMec;
	private String curso;
	
	public Estudante (String nome, int cc, Data nascimento, int numMec, String curso) {
		super (nome, cc, nascimento);
		this.numMec = numMec;
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "NMEC: "+this.numMec+" Curso: "+this.curso;
	}
}
