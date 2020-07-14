package aula06Ex2;

public class Circulo extends Figura{
	private double raio;
	private double area;
	private double perimetro;
	
	public Circulo (double r) {
		super(new Ponto());
		this.raio = r;
		this.area = Math.PI * Math.pow(raio,2);
		this.perimetro = 2 * Math.PI * raio;
	}
	
	public Circulo(double x, double y, double r){
		super(new Ponto(x,y));
		raio = r;
		this.area = Math.PI * Math.pow(raio,2);
		this.perimetro = 2 * Math.PI * raio;
	}
	
	public Circulo(Circulo a) {
		super(a.getCentro());
		this.raio = a.getRaio(); 
		this.area = Math.PI * Math.pow(raio,2);
		this.perimetro = 2 * Math.PI * raio;
	}
	
	public boolean equals(Circulo b) {
		if ( this.getCentro() == b.getCentro()) {
			if ( this.getRaio() == b.getRaio()) {
				return true;
			}
		}
		return false;
	}
	
	public double getRaio(){
		return this.raio;
	}
	public double area(){
		return this.area;
	}
	public double perimetro(){
		return this.perimetro;
	}
	
	@Override
	public String toString() {
		return "Circulo de Centro: "+super.getCentro()+" e de raio "+getRaio();
	}	
}
