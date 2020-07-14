package aula10Ex1;

public class Pessoa {
	private String nome;
	private int cc;
	private Data nascimento;
	
	public Pessoa(String nome, int cc, Data nascimento) {
		this.nome = nome;
		this.cc = cc;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public int getCc() {
		return cc;
	}

	public Data getNascimento() {
		return nascimento;
	}

	@Override
	public String toString() {
		return nome+", BI: " +this.cc+ ", Nascido na Data: "+this.nascimento;
	}
}
