package aula05Ex3;
import java.io.*;

public class TestAgenda {

	public static void main(String[] args) throws IOException{
		
		// Nokia
		Agenda agenda = new Agenda();
		agenda.loadFromFile("File1.txt");
		System.out.println("A agenda tem "+agenda.numContacts()+" contactos");
		agenda.agendaToString();
		System.out.println();
		agenda.addContact(new Pessoa("Daniel Ferreira", 3456218, new Data(5,10,1999)));
		System.out.println("A adicionar (agenda1): Daniel - 3456218 - 5/10/1999");
		agenda.saveToFile("File1_1.txt", new Nokia());
		agenda.agendaToString();
		System.out.println();
		
		// vCard
		Agenda agenda2 = new Agenda();
		agenda2.loadFromFile("File2.txt");
		System.out.println("A agenda2 tem "+agenda2.numContacts()+" contactos");
		agenda2.agendaToString();
		System.out.println();
		agenda2.addContact(new Pessoa("Carla Santos", 63529856, new Data(23,1,1989)));
		agenda2.addContact(new Pessoa("Rui Matos", 1576890, new Data(29,8,1974)));
		agenda2.addContact(new Pessoa("Pedro Pereira", 12345367, new Data(23,10,1968)));
		System.out.println("A adicionar (agenda2): Carla - 63529856 - 23/1/1989");
		System.out.println("A adicionar (agenda2): Rui - 1576890 - 29/8/1974");
		System.out.println("A adicionar (agenda2): Pedro - 12345367 - 23/10/1968");
		agenda2.saveToFile("File2_1.txt", new vCard());
		agenda2.agendaToString();
		System.out.println();
		
		// CSV
		Agenda agenda3 = new Agenda();
		agenda3.loadFromFile("File3.txt");
		System.out.println("A agenda3 tem "+agenda3.numContacts()+" contactos");
		agenda3.agendaToString();
		System.out.println();
		agenda3.addContact(new Pessoa("Rosa Teixeira", 56473891, new Data(2,12,1973)));
		agenda3.addContact(new Pessoa("Carlos Peixoto", 1576765, new Data(26,8,1989)));
		System.out.println("A adicionar (agenda3): Rosa - 56473891 - 2/12/1973");
		System.out.println("A adicionar (agenda3): Carlos - 1576765 - 26/8/1989");
		agenda3.saveToFile("File3_1.txt", new CSV());
		agenda3.agendaToString();
		System.out.println();
	}

}
