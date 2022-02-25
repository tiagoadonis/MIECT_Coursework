package aula06Ex1;

public class Peixe extends Alimento{
	private Tipo type;
	
	public Peixe(Tipo t, double prot, double cal, double pe) {
		super(prot,cal,pe);
		this.type = t;
	}
	
	@Override
	public String toString() {
		return "Peixe "+type.name()+" "+super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (type != other.type)
			return false;
		return true;
	}
}
