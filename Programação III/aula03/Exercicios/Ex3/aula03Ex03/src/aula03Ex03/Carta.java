package aula03Ex03;

public class Carta {
	private String tipo;
	private static final String[] TIPOS_CARTAS = {"A", "B", "C", "D"};
	
	public Carta(String type) {
		for(String str : TIPOS_CARTAS) {
			if (str.equals(type)) {
				this.tipo = type;
			}
		}
	}
	
	@Override
	public String toString() {
		return this.tipo;
	}	
}
