package aula03Ex03;

public class Ligeiro extends Veiculo{
	private String cor;
	
	public Ligeiro(Condutor c, String cor) {
		super(c, new Carta("B"), 5, 30, 400, 4000);
		this.cor = cor;
	}
	
	public void pintarCarro(String novaCor) {
		this.cor = novaCor;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCor - > " +this.cor;
	}
}
