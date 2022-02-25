package aula05Ex2;

public class CarroPolicia extends Automovel implements Policia{
	
	private Servico tipo;
	
	public CarroPolicia(Color c, int a, String m, int cil, int vel, int cv, Combustivel comb, boolean tran, Servico type) {
		super(c,a,m,cil,vel,cv,comb,tran);
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
		return super.toString()+"/ Carro Polícia -> Serviço de Emergência: "+this.getTipo();
	}
}
