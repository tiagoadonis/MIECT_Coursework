package aula03Ex03;

public class Motociclo extends Veiculo{
	private boolean atrelado;
	
	public Motociclo(Condutor c, boolean atrelado) {
		super(c, new Carta("A"), atrelado?2:1, 125, 11, 3000);
		this.atrelado = atrelado;
	}
	
	public Motociclo(Condutor c) {
		this(c,false);
	}
	
	public boolean temAtrelado() {
		return atrelado;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAtrelado - > "+(this.atrelado?"Sim":"Não");
	}
}
