package aula05Ex2;

public class BicicletaPolicia extends Bicicleta implements Policia{
	
	private Servico tipo;
	
	public BicicletaPolicia(Color c, int ano, boolean cesto, Servico type) {
		super(c, ano, cesto);
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
		return super.toString()+"/ Bicicleta Polícia -> Serviço de Emergência: "+this.getTipo();
	}
}
