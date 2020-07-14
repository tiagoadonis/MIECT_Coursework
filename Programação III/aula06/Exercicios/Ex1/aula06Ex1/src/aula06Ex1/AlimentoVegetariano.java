package aula06Ex1;

public class AlimentoVegetariano extends Alimento{
	private String nome;
	
	public AlimentoVegetariano(String nome, double prot, double cal, double pes) {
		super(prot,cal,pes);
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome+" (Alimento Vegetariano)  "+super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		AlimentoVegetariano other = (AlimentoVegetariano) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
