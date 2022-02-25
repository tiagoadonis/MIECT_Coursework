package aula04Ex2;

abstract class Figura {
	private Ponto oCentro;
	
	public Figura(Ponto centro) {
		this.oCentro = centro;
	}
	
	public Ponto getCentro() {
		return this.oCentro;
	}
	
	public abstract double area();
	
}
