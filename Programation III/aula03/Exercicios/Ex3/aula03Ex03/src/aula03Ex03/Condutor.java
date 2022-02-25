package aula03Ex03;

public class Condutor extends Pessoa{
	private Carta carta;
	
	public Condutor(String nome, int cc, Data nascimento, Carta carta) {
		super(nome, cc, nascimento);
		this.carta = carta;
	}
	
	public Carta getCarta() {
		return this.carta;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Carta: "+this.getCarta();
	}
}
