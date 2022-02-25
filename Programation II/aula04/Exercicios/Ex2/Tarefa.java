public class Tarefa {
	private Data inicio;
	private Data fim;
	private String texto;
	
	Tarefa(Data inicio, Data fim, String texto){
		this.inicio = inicio;
		this.fim = fim;
		this.texto = texto;
		assert (fim.compareTo(inicio)>0) : "Error - Final Date can't be previous the Inical Date!";
		assert (!texto.equals("")): "Error - Text can't be null!";
	}
	
	public Data inicio(){ return inicio; }
	public Data fim(){ return fim; }
	public String texto(){ return texto; }

	public String toString(){
		return ""+inicio()+"	"+fim()+"	"+texto();
	}

}

