package aula03Ex03;

public class PesadoPassageiros extends Veiculo{
	private final String[] paragens = {"Viseu", "Aveiro", "Albergaria-a-Velha", "Celorico", "Guarda", "Mangualde"};
	
	public PesadoPassageiros(Condutor c) {
		super(c, new Carta("D"), 50, 50, 300, 5000);
	}
	
	public void anunciarParagem(String paragem) throws Exception {
		for(String p : paragens) {
			if(p.equals(paragem)) {
				System.out.println("Proxima paragem: "+paragem);
				return;
			}
		}
		throw new Exception("A paragem \""+paragem+"\" nao existe!");
	}
}
