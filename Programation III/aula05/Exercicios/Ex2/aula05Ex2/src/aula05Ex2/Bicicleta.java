package aula05Ex2;

public class Bicicleta extends Veiculo{
	 
	private int ano;
	private boolean cesto;
	
	public Bicicleta (Color c, int ano, boolean cesto) {
		super(2, c);
		this.ano = ano;
		this.cesto = cesto;
	}
	
	public boolean hasCesto() {
		return this.cesto;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Ano: "+this.getAno()+"/ Tipo -> BICICLETA, Cesto: "+this.hasCesto();
	}
}
