package guiao11Ex1;

public class Quadrado extends Rectangulo {
	public Quadrado(Ponto p, double w){
		super(p,w,w);		
	}
	
	public Quadrado(Quadrado q) {
		this(q.centro(), q.comprimento());
	}
	
	public Quadrado(double comprimento) {
		this(new Ponto(),comprimento);
	}
	
	public Quadrado(double x, double y,double w){
		this(new Ponto(x,y),w);
	}
	
	public double comprimento(){ return super.comprimento(); }
	public double area(){ return super.comprimento() * super.comprimento(); }
	public double perimetro(){ return 4 * super.comprimento(); }
	public double lado() { return super.comprimento(); }
	
	@Override
	public String toString(){ return "Quadrado de centro "+super.centro()+" e de lado "+super.comprimento(); }
}