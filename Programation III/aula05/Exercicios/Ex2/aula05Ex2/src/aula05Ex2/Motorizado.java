package aula05Ex2;

public class Motorizado extends Veiculo{
	private int ano;
	private String matricula;
	private int cilindrada;
	private int velocMax;
	private int cv;
	private Combustivel comb;
	private double kilometros;
	private double litros;
	
	public Motorizado(int rodas, Color c, int a, String matri, int cil, int vel, int cavalos, Combustivel comb) {
		super(rodas,c);
		this.ano = a;
		this.matricula = matri;
		this.cilindrada = cil;
		this.velocMax = vel;
		this.cv = cavalos;
		this.comb = comb;
	}
	
	public void dadosComsumo(double kms, double l) {
		this.kilometros = kms;
		this.litros = l;
	}
	
	public double getPotencia() {
		return  (double) (this.cv / 1.36) ;
	}
	
	public double getConsumo() {
		return ( (this.litros / this.kilometros) * 100);
	}
	
	public String getCombustivel() {
		return this.comb.name();
	}
	
	public int getAno() {
		return this.ano;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Ano: "+this.ano+", Matricula: "+this.matricula+", Cilindrada: "+this.cilindrada+
			   ", Veloc.Máx.: "+this.velocMax+", Cavalos: "+this.cv;
	}
}
