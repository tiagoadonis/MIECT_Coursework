package aula06Ex1;

public class PratoVegetariano extends Prato{
	
	public PratoVegetariano(String nome) {
		super(nome);
	}
	
	@Override
	public boolean addIngrediente(Alimento alimento) {
		if(alimento == null) return false;
		if(alimento instanceof AlimentoVegetariano) {
			return super.addIngrediente(alimento);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Vegetariano "+super.toString();
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
