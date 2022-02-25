package aula06Ex1;

public class PratoDieta extends Prato{
	private double limCalorias;
	
	public PratoDieta(String nome, double limite) {
		super(nome);
		this.limCalorias = limite;
	}
	
	@Override
	public boolean addIngrediente(Alimento alimento) {
		if(alimento == null) return false;
		if(alimento.getCalorias() + super.getCaloriasTotal() <= limCalorias) {
			return super.addIngrediente(alimento);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Dieta ("+this.limCalorias+" Calorias) "+super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(limCalorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PratoDieta other = (PratoDieta) obj;
		if (Double.doubleToLongBits(limCalorias) != Double.doubleToLongBits(other.limCalorias))
			return false;
		return true;
	}
}
