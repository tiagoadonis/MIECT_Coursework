package aula09Ex2;

public abstract class GeladoDecorator implements Gelado{
	protected Gelado gelado;
	
	GeladoDecorator(Gelado gelado){
		this.gelado = gelado;
	}
}
