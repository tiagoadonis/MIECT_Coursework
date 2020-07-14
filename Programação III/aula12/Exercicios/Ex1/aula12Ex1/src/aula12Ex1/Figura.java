package aula12Ex1;

abstract class Figura implements Comparable<Figura>{
	private Ponto oCentro;
	
	public Figura(Ponto centro) {
		this.oCentro = centro;
	}
	
	public Ponto getCentro() {
		return this.oCentro;
	}
	
	public abstract double area();
	public abstract double perimetro();
	
	// negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object
	@Override
	public int compareTo(Figura f) {
		if (this.area() < f.area()) {
			return -1;
		}
		else if(this.area() > f.area()) {
			return 1;
		}
		return 0;
	}
}
