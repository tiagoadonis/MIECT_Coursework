package aula01Ex3;

public class Rectangulo {
	private double largura;
	private double comprimento;
	private double area;
	private double perimetro;
	
	public Rectangulo (double l, double c){
		largura = l;
		comprimento = c;
		area = largura * comprimento;
		perimetro = (2 * largura)+(2 * comprimento);
	}
	
	public String toString(){
		String descricao = ("Figura: Rect�ngulo\nLargura: "+largura+"\nComprimento: "+comprimento+"\n�rea: "+area+"\nPer�metro: "+perimetro);
		return descricao;
	}
	
	public double largura(){
		return largura;
	}
	public double comprimento(){
		return comprimento;
	}
	public double area(){
		return area;
	}
	public double perimetro(){
		return perimetro;
	}
}
