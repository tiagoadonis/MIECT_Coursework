package aula11_ex3;

public enum DiaSemana {
	segunda(0),
	terça(1),
	quarta(2),
	quinta(3),
	sexta(4),
	sabado(5),
	domingo(6);
	
	private int index;
	
	private DiaSemana(int i) {
		index = i;
	}
	
	public static DiaSemana rand() {
		int rand = (int)(Math.random()*6);
		DiaSemana value = null;
		for(DiaSemana dia : DiaSemana.values()) {
			if(dia.getIndex() == rand) value = dia;
		}
		return value;
	}
	
	public static DiaSemana enumDay(int n) {
		DiaSemana var = null;
		for(DiaSemana v : DiaSemana.values()) {
			if(v.getIndex() == n) return v;
		}
		return var;
	}

	public int getIndex() {
		return index;
	}
}
