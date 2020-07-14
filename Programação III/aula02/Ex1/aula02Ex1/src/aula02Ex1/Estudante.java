package aula02Ex1;
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
		return super.getNumSocio()+") "+super.getNome()+" cc: "+super.getCC()+" ("
				+super.getDataNascimento()+") NMEC: "+this.numMec+" Curso: "+this.curso;
	}
}
