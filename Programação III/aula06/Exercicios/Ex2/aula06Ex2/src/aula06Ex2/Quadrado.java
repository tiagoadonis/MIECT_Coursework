package aula06Ex2;

public class Quadrado extends Figura{
	private double lado;
	private double area;
	private double perimetro;
	
	public Quadrado (double l){
		super(new Ponto());
		this.lado = l;
		this.area = lado * lado;
		this.perimetro = 4 * lado;
	}
	
	public Quadrado(double x, double y, double l) {
		super(new Ponto(x,y));
		this.lado = l;
		this.area = lado * lado;
		this.perimetro = 4 * lado;
	}
	
	public Quadrado(Quadrado b) {
		super(b.getCentro());
		this.lado = b.getLado();
		this.area = lado * lado;
		this.perimetro = 4 * lado;
	}
	
	public boolean equals(Quadrado b) {
		if ( this.getCentro() == b.getCentro()) {
			if ( this.getLado() == b.getLado()) {
				return true;
			}
		}
		return false;
	}
	
	public double getLado(){
		return this.lado;
	}
	public double area(){
		return this.area;
	}
	public double perimetro(){
		return this.perimetro;
	}
	
	@Override
	public String toString() {
		return "Quadrado de Centro "+super.getCentro()+" e de lado "+getLado();
	}
	
}
