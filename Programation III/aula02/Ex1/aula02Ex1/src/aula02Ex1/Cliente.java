package aula02Ex1;
import java.util.*;
@SuppressWarnings("all")

public class Cliente {
	private static int current_numSocio = 1;
	private int numSocio;
	private String nome;
	private int cc;
	private Data dataNascimento;
	private List<Video> historicoVideos;
	private int req = 0;
	
	public Cliente (String nome, int cc, Data nascimento) {
		this.numSocio = current_numSocio++;
		this.nome = nome;
		this.cc = cc;
		this.dataNascimento = nascimento;
		this.historicoVideos = new ArrayList<>();
	}
	
	public int getNumSocio() {
		return this.numSocio;
	}
	
	public Data getDataNascimento() {
		return this.dataNascimento;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCC() {
		return this.cc;
	}
	
	public List<Video> getHistoricoVideos(){
		return this.historicoVideos;
	}
	
	public int getReq() {
		return this.req;
	}
}
