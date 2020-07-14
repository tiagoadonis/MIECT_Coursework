package aula04Ex2;

public class Rectangulo extends Figura{
	private double largura;
	private double comprimento;
	private double area;
	private double perimetro;
	
	public Rectangulo (double l, double c){
		super(new Ponto());
		this.largura = l;
		this.comprimento = c;
		this.area = largura * comprimento;
		this.perimetro = (2 * largura)+(2 * comprimento);
	}
	
	public Rectangulo(double x, double y, double l, double c) {
		super(new Ponto(x,y));
		this.largura = l;
		this.comprimento = c;
		this.area = largura * comprimento;
		this.perimetro = (2 * largura)+(2 * comprimento);
	}
	
	public Rectangulo(Rectangulo b) {
		super(b.getCentro());
		this.largura = b.getLargura();
		this.comprimento = b.getComprimento();
		this.area = largura * comprimento;
		this.perimetro = (2 * largura)+(2 * comprimento);
	}
	
	public boolean equals(Rectangulo b) {
		if ( this.getCentro() == b.getCentro()) {
			if ( this.getLargura() == b.getLargura()) {
				if (this.getComprimento() == b.getComprimento()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public double getLargura(){
		return largura;
	}
	public double getComprimento(){
		return comprimento;
	}
	public double area(){
		return area;
	}
	public double perimetro(){
		return perimetro;
	}
	
	@Override
	public String toString() {
		return "Rectangulo de Centro "+super.getCentro()+", altura "+getLargura()+", comprimento "+getComprimento();
	}
}
