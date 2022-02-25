package aula11_ex3;

public class Peixe extends Alimento{
	
	private tipoPeixe tipo;

	public Peixe(tipoPeixe tipo, double proteina, double calorias, double peso) {
		super(proteina, calorias, peso);
		this.tipo=tipo;
	}
	
	public tipoPeixe getTipo() {
		return tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Peixe other = (Peixe) obj;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Peixe [tipo=" + tipo + "]";
	}
	
	
}
