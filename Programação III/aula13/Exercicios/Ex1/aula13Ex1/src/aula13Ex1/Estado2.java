package aula13Ex1;

public class Estado2 extends Regiao{
private Cidade capital;
	
	public Estado2(String name, int pop, Cidade local){
		super.setNome(name);
		super.setPopulacao(pop);
		if (local.getTipo().equals("Cidade")) {
			this.capital = local;
		}
		else {
			System.out.println("ERROR!! A capital não é uma cidade");
			System.exit(1);
		}
	}
	
	public Cidade getCapital() {
		return capital;
	}
}
