package aula01Ex3;

public class Circulo {
	private double raio;
	private Ponto centro;
	private double area;
	private double perimetro;

	public Circulo (double r, Ponto c){
		raio = r;
		centro = c;
		area = Math.PI * Math.pow(raio,2);
		perimetro = 2 * Math.PI * raio;
	}
	
	public Circulo(double x, double y, double r){
		Ponto centro = new Ponto(x,y);
		raio = r;
		area = Math.PI * Math.pow(raio,2);
		perimetro = 2 * Math.PI * raio;
	}
	
	public String toString(){
		String descricao = ("Figura: C�rculo\nRaio: "+raio+"\nCentro: "+centro+"\n�rea: "+area+"\nPer�metro: "+perimetro);
		return descricao;
	}
	
	public boolean iguais(Circulo a){ 
		return raio == a.raio(); 
	}
	
	public boolean intersecao(Circulo a){
		return centro.distancia(a.centro()) < raio + a.raio();
	}
	
	public double raio(){
		return raio;
	}
	public Ponto centro(){
		return centro;
	}
	public double area(){
		return area;
	}
	public double perimetro(){
		return perimetro;
	}
}