package aula13Ex1;

public class Factory {
	public static Localidade factory(String nome, int pop, TipoLocalidade tipo) {
		if(tipo.name().equalsIgnoreCase("Cidade")) {
			return new Cidade(nome, pop);
		}
		if (tipo.name().equalsIgnoreCase("Aldeia")) {
			return new Aldeia(nome, pop);
		}
		if (tipo.name().equalsIgnoreCase("Vila")) {
			return new Vila(nome, pop);
		}
		else {
			throw new IllegalArgumentException("Localidade não existente");
		}
	}
}
