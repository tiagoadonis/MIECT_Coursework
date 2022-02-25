package aula11Ex2;

public class Circulo extends Figura{
	private final double raio;
	
	public Circulo(Ponto c, double r){
		super(c);
		raio = r;
	}
	
	public Circulo(Circulo c1) {
		this(c1.centro(),c1.raio());
	}
	
	public Circulo(double r) {
		this(new Ponto(),r);
	}
	
	public Circulo(double x, double y, double r){
		this(new Ponto(x,y),r);
	}
	
	public double raio(){ return raio; }
	public double area(){ return Math.PI * raio * raio; }
	public double perimetro(){ return 2 * Math.PI * raio; }
	
	@Override
	public String toString(){ 
		return "Circulo de centro "+super.centro()+" e de raio "+raio; 
	}
}
