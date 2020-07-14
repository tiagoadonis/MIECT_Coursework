package aula05Ex2;

public class Moto extends Motorizado{
	private boolean atrelado;
	
	public Moto(Color c, int a, String m, int cil, int vel, int cv, Combustivel comb, boolean atre) {
		super(2,c,a,m, cil, vel, cv, comb);
		this.atrelado = atre;
	}
	
	public boolean hasAtrelado() {
		return this.atrelado;
	}
	
	@Override
	public String toString() {
		return super.toString()+"/ Tipo -> MOTO, Atrelado: "+this.hasAtrelado();
	}
}
