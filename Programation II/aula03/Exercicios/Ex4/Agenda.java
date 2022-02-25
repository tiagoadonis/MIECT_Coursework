public class Agenda {
	
	private int numTarefas = 0, tamanho ;
	private Tarefa[] tarefas;
	
	Agenda (){
		this.tamanho = 1000;
		this.tarefas = new Tarefa[1000];
	}
	
	public void novaTarefa(Tarefa novaTarefa){
		if (numTarefas > 0){
			tarefas[numTarefas++]= novaTarefa;
			for (int i = 0; i < numTarefas-1; i++){
				for (int j = i+1; j < numTarefas ; j++) {
					if (tarefas[j].inicio().compareTo(tarefas[i].inicio()) < 0){
						Tarefa tmp = tarefas[j];
						tarefas[j] = tarefas[i];
						tarefas[i] = tmp;
					}
				}
			}
		}else{
			tarefas[numTarefas++]= novaTarefa;
		}
	}
	
	public void escreve(){
		System.out.print("Agenda:\n");
		for (int k = 0; k < numTarefas; k++){
			System.out.print(tarefas[k]);
		}
	}
	
	public Agenda filtra(Data d1, Data d2){
		Agenda tmp = new Agenda();
		Tarefa intervalo = new Tarefa(d1, d2, "Intervalo"); 
		for(int i = 0; i < this.numTarefas; i++){
			if (intervalo.intersecta(this.tarefas[i])){
				tmp.novaTarefa(this.tarefas[i]);
			}
		}
		return tmp;
	}
}

