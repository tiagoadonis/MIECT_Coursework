package aula09Ex2;

public class Topping extends GeladoDecorator{

	private String sabor;
	
	public Topping(Gelado g, String sabor) {
		super(g);
		this.sabor = sabor;
	}
	
	public void base(int numBolas) {
		gelado.base(numBolas);
		System.out.print(" com "+sabor);
	}
	
}
