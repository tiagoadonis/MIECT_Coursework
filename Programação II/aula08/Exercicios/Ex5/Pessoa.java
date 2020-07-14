public class Pessoa implements Comparable<Pessoa>{
	
	private Data nascimento;
	private String nome;
	
	public Pessoa (Data nascimento, String nome){
		this.nascimento = nascimento;
		this.nome = nome;
	}
	
	public Data nascimento(){
		return this.nascimento;
	}
	
	public String nome(){
		return this.nome;
	}
	
	public int compareTo(Pessoa p){
		if (this.nascimento.mes() < p.nascimento.mes()){
			return -1;
		}
		else if (this.nascimento.mes() > p.nascimento.mes()){
			return 1;
		}
		else{
			if (this.nascimento.dia() < p.nascimento.dia()){
				return -1;
			}
			else if(this.nascimento.dia() > p.nascimento.dia()){
				return 1;
			}
			else {
				return 0;
			}
		}
	}
	
	public String toString(){
		return "("+nascimento.toString()+", "+nome()+")";
	}
}
