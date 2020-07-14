package aula09Ex2;

public class Cone extends GeladoDecorator{
	
	public Cone(Gelado gelado) {
		super(gelado);
	}
	
	public void base(int numBolas) {
		gelado.base(numBolas);
		System.out.print(" em cone");
	}

}
