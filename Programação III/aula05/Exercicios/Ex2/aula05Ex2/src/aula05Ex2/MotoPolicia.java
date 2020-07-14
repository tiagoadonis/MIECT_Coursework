package aula05Ex2;

public class MotoPolicia extends Moto implements Policia{
	private Servico tipo;
	
	public MotoPolicia(Color c, int a, String m, int cil, int vel, int cv, Combustivel comb, boolean atre, Servico type){
		super(c,a,m,cil,vel,cv,comb,atre);
		this.tipo = type;
	}
	
	public String getTipo() {
		return this.tipo.name();
	}
	
	public int getID() {
		return super.getID();
	}
	
	@Override
	public String toString() {
		return super.toString()+"/ Moto Polícia -> Serviço de Emergência: "+this.getTipo();
	}
}
