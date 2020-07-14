package guiao11Ex1;

public class Rectangulo extends Figura {
	private final double comprimento;
	private final double largura;
	
	public Rectangulo(Ponto p, double w, double h){
		super(p);
		comprimento = w;
		largura = h;
	}
	
	public Rectangulo(Rectangulo r) {
		this(r.centro(),r.comprimento,r.largura);
	}
	
	public Rectangulo(double w, double h) {
		this(new Ponto(),w,h);
	}
	
	public Rectangulo(double x, double y,double w, double h){
		this(new Ponto(x,y),w,h);
	}
	
	public double comprimento(){ return comprimento; }
	public double largura(){ return largura; }
	public double area() { return comprimento * largura; }
	public double perimetro() { return 2 * comprimento + 2 * largura; }
	
	@Override
	public String toString(){ 
		return "Retangulo de centro "+super.centro()+", altura "+largura+", comprimento "+comprimento;
	}
}
