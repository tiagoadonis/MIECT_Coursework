package aula13Ex1;

public class Localidade extends Regiao{
	private TipoLocalidade tipo;
	
	public Localidade(String name, int pop, TipoLocalidade type) {
		super.setNome(name);
		super.setPopulacao(pop);
		for (TipoLocalidade tmp : TipoLocalidade.values()) {
			if (tmp.toString().equals(type.toString())) {
				this.tipo = type;
			}
		}
	}
	
	public String getTipo() {
		return this.tipo.name();
	}
	
	public String getNome() {
		return super.getNome();
	}
}
