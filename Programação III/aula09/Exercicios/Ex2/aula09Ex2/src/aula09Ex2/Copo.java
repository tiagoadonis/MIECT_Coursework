package aula09Ex2;

public class Copo extends GeladoDecorator{
	
	private final String sabor;
	
	public Copo(Gelado gelado) {
		super(gelado);
		this.sabor = null;
	}

	public Copo(Gelado gelado, String sabor) {
		super(gelado);
		this.sabor = sabor;
	}
	
	public void base(int numBolas) {
		gelado.base(numBolas);
		System.out.print(" em copo"+(sabor==null?"":" com "+sabor+"\n"));
	}
	
}
