package pt.ua.prog2;

public class Contacto {
	public String nome;
	public String telefone;
	public String email;
  
	public Contacto(String nome, String telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Contacto(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String nome(){
		return nome.toUpperCase();
	}
	
	public String telefone(){
		return telefone;
	}
	
	public String eMail(){
		if (email==null){
			this.email = "";
		}else{
			this.email = email; 
		}
		return email;
	}
}
