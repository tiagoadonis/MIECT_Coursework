package aula05Ex2;

public class Automovel extends Motorizado{
	
	private boolean trancado;
	
	public Automovel(Color c, int a, String m, int cil, int vel, int cv, Combustivel comb, boolean tran) {
		super(4,c,a,m, cil, vel, cv, comb);
		this.trancado = tran;
	}
	
	public boolean isTrancado() {
		return this.trancado;
	}
	
	@Override
	public String toString() {
		return super.toString()+"/ Tipo -> AUTOMÓVEL, Trancado: "+this.isTrancado();
	}
}
