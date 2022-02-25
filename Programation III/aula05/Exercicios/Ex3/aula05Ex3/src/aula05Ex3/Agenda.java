package aula05Ex3;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class Agenda {
	private ArrayList<Pessoa> agenda = new ArrayList<>();
	
	public void loadFromFile(String filename) throws IOException{
		File f = new File(filename);
		Scanner scf = new Scanner(f);
		String format = scf.nextLine();
		scf.close();
		AgendaInterface agendaFormat = null;
		if (format.equals("Nokia")) {
			agendaFormat = new Nokia();
		}
		else if (format.equals("vCard")) {
			agendaFormat = new vCard();
		}
		else if(format.equals("CSV")) {
			agendaFormat = new CSV();
		}
		addContacts(agendaFormat.readFromFile(filename));
	}
	
	public void saveToFile(String filename, AgendaInterface format) throws IOException{
		format.writeToFile(filename, agendaToArray());
	}
	
	public void addContacts(Pessoa[] pessoas) {
		for (Pessoa a : pessoas) {
			addContact(a);
		}
	}
	
	public void addContact(Pessoa a) {
		agenda.add(a);
	}
	
	public void removeContact(Pessoa a) {
		if (agenda.contains(a)) {
			agenda.remove(a);
		}else {
			out.print("A pessoa que inseriu n�o existe na lista de contactos");
			exit(1);
		}
	}
	
	private Pessoa[] agendaToArray() {
		return agenda.toArray(new Pessoa[0]);
	}
	
	public int numContacts() {
		return agenda.size();
	}
	
	public void agendaToString() {
		for(Pessoa a : this.agendaToArray()) {
			System.out.println(a);
		}
	}
	
}