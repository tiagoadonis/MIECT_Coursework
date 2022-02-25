package guiao11Ex1;

public abstract class Figura implements Comparable<Figura>{
	private Ponto centro;
	
	public Figura(Ponto c) {
		centro = c;
	}
	
	public Ponto centro() {
		return centro;
	}
	public abstract double area();
	public abstract double perimetro();
	
	public int compareTo(Figura figura){
		return (int)(this.area()-figura.area());
	}
}

