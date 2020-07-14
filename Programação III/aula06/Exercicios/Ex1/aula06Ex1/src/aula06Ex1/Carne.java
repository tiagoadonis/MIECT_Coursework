package aula06Ex1;

public class Carne extends Alimento {
	private Variedade var;
	
	public Carne(Variedade v, double prot, double cal, double pes) {
		super (prot, cal, pes);
		this.var = v;
	}
	
	@Override
	public String toString() {
		return "Carne "+var.name()+", "+super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((var == null) ? 0 : var.hashCode());
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
		Carne other = (Carne) obj;
		if (var != other.var)
			return false;
		return true;
	}
}
