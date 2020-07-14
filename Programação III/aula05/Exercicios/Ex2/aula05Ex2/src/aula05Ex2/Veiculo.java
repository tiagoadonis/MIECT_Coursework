package aula05Ex2;

abstract public class Veiculo implements Comparable<Veiculo> {
	private static int VEICULO_ID = 1;
	private int numRodas;
	private Color cor;
	private int id;
	
	public Veiculo(int rodas, Color c) {
		numRodas = rodas;
		cor = c;
		this.id = VEICULO_ID++;
	}
	
	public int getID() {
		return this.id;
	}
	
	public abstract int getAno();
	
	// negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object
	@Override
	public int compareTo(Veiculo v) {
		if (this.getAno() < v.getAno()) {
			return -1;
		}
		else if (this.getAno() > v.getAno()) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Veículo - Num.Rodas: "+this.numRodas+", Cor: "+this.cor;
	}
}
