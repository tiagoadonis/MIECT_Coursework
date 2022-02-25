public class Tarefa {
	private Data inicio;
	private Data fim;
	private String texto;
	
	Tarefa(Data inicio, Data fim, String texto){
		this.inicio = inicio;
		this.fim = fim;
		this.texto = texto;
	}
	
	public boolean intersecta(Tarefa t2){
		boolean intersects = false;
		if (t2.inicio().compareTo(this.inicio()) > 0) {
			if (t2.fim().compareTo(this.fim()) < 0) {
				intersects = true;
			}
		}
		return intersects;
	}
	
	public Data inicio(){ return inicio; }
	public Data fim(){ return fim; }
	public String texto(){ return texto; }

	public String toString(){
		return ""+inicio()+" --- "+fim()+": "+texto()+"\n";
	}

}

