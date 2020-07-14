package aula03Ex1;

public class Estudante extends Pessoa{
	private int NMEC;
	private Data inscricao;
	private static int NMEC_inicial = 100;
	
	public Estudante(String nome, int cc, Data nascimento, Data inscricao) {
		super(nome, cc, nascimento);
		this.NMEC = NMEC_inicial++;
		this.inscricao = inscricao;
	}
	
	public Estudante(String nome, int cc, Data nascimento) {
		super(nome, cc, nascimento);
		this.NMEC = NMEC_inicial++;
		this.inscricao = new Data();
	}
	
	public int getNMEC() {
		return this.NMEC;
	}
	
	public Data getInscricao() {
		return this.inscricao;
	}
	
	@Override
	public String toString() {
		return super.toString()+", NMEC: "+this.NMEC+", inscrito em Data: "+this.inscricao;
	}
}
