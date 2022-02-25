package aula01Ex3;

public class Quadrado {
	private double lado;
	private double area;
	private double perimetro;
	
	public Quadrado (double l){
		lado = l;
		area = l * l;
		perimetro = 4 * l;
	}
	
	public String toString(){
		String descricao = ("Figura: Quadrado\nLado: "+lado+"\nÁrea: "+area+"\nPerímetro: "+perimetro);
		return descricao;
	}
	
	public double lado(){
		return lado;
	}
	public double area(){
		return area;
	}
	public double perimetro(){
		return perimetro;
	}
	
}
