package aula13Ex1;

public class Provincia extends Regiao{
	private String governador;
	
	public Provincia(String name, int populacao, String gov) {
		super.setNome(name);
		super.setPopulacao(populacao);
		this.governador = gov;
	}
}
