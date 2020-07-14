public class Tarefa {
	private Data inicio;
	private Data fim;
	private String texto;
	
	Tarefa(Data inicio, Data fim, String texto){
		this.inicio = inicio;
		this.fim = fim;
		this.texto = texto;
	}
	
	public Data inicio(){ return inicio; }
	public Data fim(){ return fim; }
	public String texto(){ return texto; }

	public String toString(){
		return ""+inicio()+"	"+fim()+"	"+texto();
	}

}

