package aula13Ex1;

public class Estado extends Regiao{
	private Localidade capital;
	
	public Estado(String name, int pop, Localidade local){
		super.setNome(name);
		super.setPopulacao(pop);
		if (local.getTipo().equals("Cidade")) {
			this.capital = local;
		}
		else {
			System.out.println("ERROR!! A capital n�o � uma cidade");
			System.exit(1);
		}
	}
	
	public Localidade getCapital() {
		return capital;
	}
}