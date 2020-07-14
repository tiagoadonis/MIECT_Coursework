package aula02Ex1;
import java.util.*;
import static java.lang.System.*;

public class Menu {

static Scanner sc = new Scanner (System.in);
private static List<Cliente> users = new ArrayList<>(); 	// verificar sen�o d� erro por ser STATIC
private static List<Video> videos = new ArrayList<>();
	
	public static void main(String[] args) {
		out.print("N�mero m�ximo de requisi��es por cliente: ");
		int n = sc.nextInt();
		sc.nextLine();
		int opt = 0;
		do {
			out.println("");
			out.println("1)-----Introduzir novo utilizador");
			out.println("2)-----Remover utilizador existente");
			out.println("3)-----Listar v�deos permitidos por utilizador");
			out.println("4)-----Introduzir novo filme");
			out.println("5)-----Remover filme");
			out.println("6)-----Verificar disponibilidade de um fime");
			out.println("7)-----Efetuar empr�stimo de um filme (checkout)");
			out.println("8)-----Efetuar devolu��o de um filme (checkin)");
			out.println("9)-----Listar utilizadores por v�deo");
			out.println("10)----Listar v�deos");
			out.println("11)----Hist�rico de v�deos por cliente");
			out.println("12)----Sair");
			out.print("Op��o: ");
			opt = sc.nextInt();
			sc.nextLine();
			out.println("");
			
			switch(opt) {
				case 1:
					addUser();
					break;
				case 2:
					removeUser();
					break;
				case 3:
					listUserVideos();
					break;
				case 4:
					addVideo();
					break;
				case 5:
					removeVideo();
					break;
				case 6:
					checkAvailability();
					break;
				case 7:
					lendVideo(n);
					break;
				case 8:
					returnVideo();
					break;
				case 9:
					listUseresByVideo();
					break;
				case 10:
					listVideos();
					break;
				case 11:
					historicVideosByClient();
					break;
				default:
					out.print("ERROR!! Option number invalid!!");
					break;
			}
		}while(opt != 12);
	}
	
	public static void addUser() {
		int opt = 0;
		do {
			out.println("1 - Estudante");
			out.println("2 - Funcion�rio");
			out.print("Op��o: ");
			opt = sc.nextInt();
			sc.nextLine();
			
		} while (opt!=1 && opt!=2 );	
		
		if (opt == 1){
			//Nome
			out.print("Nome: ");				
			String nome = sc.nextLine();
			//Cart�o de cidad�o
			out.print("Cart�o de cidad�o: ");
			int cc = sc.nextInt();
			sc.nextLine();
			//Nascimento
			out.print("Data de Nascimento(dd/mm/aaaa): ");
			String str = sc.nextLine();
			String[] data = str.split("/");
			int dia = Integer.parseInt(data[0]);
			int mes = Integer.parseInt(data[1]);
			int ano = Integer.parseInt(data[2]);
			Data nascimento = new Data (dia, mes, ano);
			//N�mero Mecanogr�fico
			out.print("NMEC: ");
			int nmec = sc.nextInt();
			sc.nextLine();
			//Curso
			out.print("Curso: ");
			String curso = sc.nextLine();
			users.add(new Estudante(nome, cc, nascimento, nmec, curso));
		}
		else if (opt == 2){
			//Nome
			out.print("Nome: ");
			String nome = sc.nextLine();
			//Cart�o de cidad�o
			out.print("Cart�o de cidad�o: ");
			int cc = sc.nextInt();
			sc.nextLine();
			//Nascimento
			out.print("Data de Nascimento(dd/mm/aaaa): ");
			String str = sc.nextLine();
			String[] data = str.split("/");
			int dia = Integer.parseInt(data[0]);
			int mes = Integer.parseInt(data[1]);
			int ano = Integer.parseInt(data[2]);
			Data nascimento = new Data (dia, mes, ano);
			//N�mero Funcion�rio
			out.print("N�mero de Funcion�rio: ");
			int numFuncionario = sc.nextInt();
			sc.nextLine();
			//N�mero Fiscal
			out.print("N�mero Fiscal: ");
			int numFiscal = sc.nextInt();
			sc.nextLine();
			users.add(new Funcionario(nome, cc, nascimento, numFuncionario, numFiscal));
		}
		out.println("Utilizador inserido com sucesso!!");
	}
	
	public static void removeUser() {
		out.print("Introduza o n�mero de s�cio do utilizador a remover: ");
		int numSocio = sc.nextInt();
		sc.nextLine();
		for(Cliente a : users) {
			if (a.getNumSocio() == numSocio) {
				users.remove(a);
				out.println("Utilizador removido com sucesso!!");
			}
		}
	}
	
	public static void listUserVideos(){
		int idade = 0;
		out.print("Introduza o n�mero de s�cio do utilizador: ");
		int numSocio = sc.nextInt();
		for (Cliente a : users) {
			if (a.getNumSocio() == numSocio) {
				int ano = a.getDataNascimento().getAno();
				idade = 2019 - ano; 
			}
		}
		if (idade > 6 && idade < 12) {
			for (Video a : videos) {
				if (a.getAge().equals("M6") || a.getAge().equals("ALL")){
					a.toString();
				}
			}
		}
		else if (idade > 12 && idade < 16) {
			for (Video a : videos) {
				if (a.getAge().equals("M12") || a.getAge().equals("ALL")){
					a.toString();
				}
			}
		}
		else if (idade > 16 && idade < 18) {
			for (Video a : videos) {
				if (a.getAge().equals("M16") || a.getAge().equals("ALL")){
					a.toString();
				}
			}
		}
		else if (idade > 18) {
			for (Video a : videos) {
				if (a.getAge().equals("M18") || a.getAge().equals("ALL")){
					a.toString();
				}
			}
		}
		else{
			for (Video a : videos) {
				if (a.getAge().equals("ALL")){
					a.toString();
				}
			}
		}
	}
	
	public static void addVideo() {
		//T�tulo
		out.print("T�tulo: : ");
		String titulo = sc.nextLine();
		//Categoria
		out.print("Categoria: ");
		String categoria = sc.nextLine();
		//Idade
		out.print("Idade: ");
		String idade = sc.nextLine();
		videos.add(new Video (titulo, categoria, idade));
		out.println("V�deo adicionado com sucesso!!");
	}
	
	public static void removeVideo() {
		out.print("Introduza o ID do v�deo a remover: ");
		int id = sc.nextInt();
		for (Video a : videos) {
			if (a.getID() == id) {
				videos.remove(a);
			}
		}
		out.println("Video removido com sucesso!!");
	}
	
	public static void checkAvailability() {
		out.print("Introduza o ID do v�deo: ");
		int id = sc.nextInt();
		for (Video a : videos) {
			if (a.getID() == id) {
				out.println(a.toString()+": "+a.getDisponibilidade()+" (disponibilidade)");
			}
		}
	}
	
	public static void lendVideo(int n) {
		out.print("Introduza o ID do v�deo: ");
		int id = sc.nextInt();
		out.print("Introduza o n�mro de s�cio do requesitador: ");
		int numSocio = sc.nextInt();
		Cliente b = null;
		for (Cliente a : users) {
			if (a.getNumSocio() == numSocio) {
				b = a;
			}
		}
		int requesicoes = b.getReq();
		requesicoes++;
		if (requesicoes < n) {
			for (Video a : videos) {
				if (a.getID() == id) {
					a.setDisponiblidade(false);
					a.getUsersPerVideo().add(b);
					b.getHistoricoVideos().add(a);
				}
			}
		}
		out.print("Checkout do video: "+id);
	}
	
	public static void returnVideo(){
		out.print("Introduza o ID do v�deo: ");
		int id = sc.nextInt();
		out.print("Rating (0-10): ");
		int grade = sc.nextInt();
		for (Video a : videos) {
			if (a.getID() == id) {
				a.setDisponiblidade(true);
				a.setRatingTotal(grade);
			}
		}
		out.print("Checkin do video: "+id);
	}
	
	public static void listUseresByVideo() {
		out.print("Introduza o ID do v�deo: ");
		int id = sc.nextInt();
		List<Cliente> list = null;
		for (Video a : videos) {
			if (a.getID() == id) {
				list = a.getUsersPerVideo();
			}
		}
		for(Cliente a : list) {
			a.toString();
		}
	}
	
	public static void listVideos() {
		for (Video a : videos) {
			a.toString();
		}
	}
	
	public static void historicVideosByClient() {
		out.print("Introduza o n�mero de s�cio do usu�rio: ");
		int numSocio = sc.nextInt();
		List<Video> lista = null;
		for (Cliente a: users) {
			if (a.getNumSocio() == numSocio) {
				lista = a.getHistoricoVideos();
			}
		}
		for (Video a : lista) {
			a.toString();
		}
	}
}
