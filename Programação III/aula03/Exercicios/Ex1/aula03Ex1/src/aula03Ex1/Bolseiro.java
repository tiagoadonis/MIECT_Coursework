package aula03Ex1;

public class Bolseiro extends Estudante{
	private int bolsa;
	
	public Bolseiro(String nome, int cc, Data nascimento, Data inscricao) {
		super (nome, cc, nascimento, inscricao);
	}
	
	public Bolseiro(String nome, int cc, Data nascimento) {
		super (nome, cc, nascimento);
	}
	
	public int getBolsa() {
		return this.bolsa;
	}
	
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	@Override
	public String toString() {
		return super.toString()+" / Bolsa: "+this.bolsa+"€";
	}
}
