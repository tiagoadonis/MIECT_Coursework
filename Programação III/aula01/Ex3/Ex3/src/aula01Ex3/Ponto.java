package aula01Ex3;

public class Ponto {
	private double x;
	private double y;
	
	public Ponto (double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double distancia(Ponto p){
		return Math.sqrt(Math.pow(p.x() - x,2) + Math.pow(p.y() - y,2));
	}
	
	public String toString(){ 
		return "("+x+","+y+")"; 
	}
	
	public double x(){
		return x;
	}
	public double y(){
		return y;
	}
}
