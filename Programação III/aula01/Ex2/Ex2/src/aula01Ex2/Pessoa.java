package aula01Ex2;

public class Pessoa {
	private String nome;
	private String cc;
	private Data nascimento;
	
	public Pessoa(String nome, String cc, Data nascimento) {
		this.nome = nome;
		this.cc = cc;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return nome+", cc=" +cc+ ", "+nascimento;
	}
	
}
