package aula05Ex1;
import java.util.*;

public class ColecaoFiguras {
	private List<Figura> figuras;
	private double areaTot;
	private double maxArea;
	
	public ColecaoFiguras(double maxArea) {
		this.figuras = new ArrayList<>();
		this.areaTot = 0;
		this.maxArea = maxArea;
	}
	
	public boolean addFigura(Figura f) {
		if(exists(f) || (areaTot + f.area() ) > maxArea){
			return false;
		} else {
			areaTot = areaTot + f.area();
			return figuras.add(f);
		}
	}
	
	public boolean delFigura(Figura f) {
		if (exists(f)){
			this.areaTot = this.areaTot - f.area();
			return figuras.remove(f);
		}else {
			return false;
		}
	}
	
	public double areaTotal() {
		return this.areaTot;
	}
	
	public boolean exists(Figura f) {
		return figuras.contains(f);
	}
	
	public Figura[] getFiguras() {
		return figuras.toArray(new Figura[0]);
	}
	
	public Ponto[] getCentros() {
		List<Ponto> tmp = new ArrayList<>();
		for(Figura f : figuras) {
			tmp.add(f.getCentro());
		}
		return tmp.toArray(new Ponto[0]);
	}
	
	@Override
	public String toString() {
		return "Cole�ao de Figuras: "+getFiguras()+"\nArea Total das figuras: "+areaTotal();
	}
}
