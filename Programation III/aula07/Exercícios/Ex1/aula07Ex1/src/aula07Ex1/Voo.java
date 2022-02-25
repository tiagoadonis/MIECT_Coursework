package aula07Ex1;
import java.time.LocalTime;

public class Voo {
	private LocalTime partida;
	private String nome; 
	private String companhia;
	private String origem;
	private LocalTime atraso; 	// default é 00:00
	
	public Voo(LocalTime partida, String nome, String companhia, String origem, LocalTime atraso) {
		this.partida = partida;
		this.nome = nome;
		this.companhia = companhia;
		this.origem = origem;
		this.atraso = atraso;
	}
	
	public LocalTime getPartida() {
		return this.partida;
	}
	
	public LocalTime getAtraso() {
		return this.atraso;
	}
	
	public String getCompanhia() {
		return this.companhia;
	}
	
	public String getOrigem() {
		return this.origem;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%-10s\t%-18s\t%-20s\t%-5s", this.partida.toString(), this.nome, this.companhia, this.origem, 
							this.atraso.toString().equals("00:00") ? "" : this.atraso.toString());
	}
	
}
