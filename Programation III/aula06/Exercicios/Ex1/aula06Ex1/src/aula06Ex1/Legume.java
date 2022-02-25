package aula06Ex1;

public class Legume extends AlimentoVegetariano{
	
	public Legume(String nome, double prot, double calorias, double peso) {
		super(nome,prot,calorias,peso);
	}
	
	@Override
	public String toString() {
		return "Legume, "+super.toString();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}