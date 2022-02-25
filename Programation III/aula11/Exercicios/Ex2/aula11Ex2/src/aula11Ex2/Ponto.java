package aula11Ex2;

public class Ponto {
	private double x;
	private double y;
	
	public Ponto (double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Ponto() {
		this.x = 0;
		this.y = 0;
	}
	
	public double distancia(Ponto p){
		return Math.sqrt(Math.pow(p.x() - x,2) + Math.pow(p.y() - y,2));
	}
	
	public double x(){
		return x;
	}
	public double y(){
		return y;
	}
	
	@Override
	public String toString(){ 
		return "x: "+x+", y: "+y; 
	}
}
