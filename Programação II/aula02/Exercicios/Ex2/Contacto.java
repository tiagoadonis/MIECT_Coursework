public class Contacto {
	private String nome;
	private String telefone;
	private String email;
  
	Contacto(String nome, String telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	Contacto(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String nome(){
		return nome;
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
