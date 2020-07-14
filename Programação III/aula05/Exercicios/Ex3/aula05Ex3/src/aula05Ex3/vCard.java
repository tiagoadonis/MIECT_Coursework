package aula05Ex3;
import java.io.*;
import java.util.*;

public class vCard implements AgendaInterface{
	
	public Pessoa[] readFromFile(String filename) throws IOException{
		File f = new File(filename);
		Scanner scf = new Scanner(f);
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		scf.nextLine();
		while(scf.hasNextLine()) {
			String[] line = scf.nextLine().split("#");
			String nome = line[1];
			int cc = Integer.parseInt(line[2]);
			String[] date = line[3].split("/");
			Data data = new Data(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
			Pessoa p = new Pessoa(nome, cc, data);
			pessoas.add(p);
		}
		scf.close();
		return pessoas.toArray(new Pessoa[0]);
	}
	
	public void writeToFile(String filename, Pessoa[] pessoas) throws IOException{
		File f = new File(filename);
		PrintWriter pwf = new PrintWriter(f);
		pwf.println("vCard");
		int i = 0;
		while(i < pessoas.length) {
			pwf.println("#"+pessoas[i].getNome()+"#"+pessoas[i].getCc()+"#"+pessoas[i].getNascimento().toString());
			i++;
		}
		pwf.close();
	}
}
