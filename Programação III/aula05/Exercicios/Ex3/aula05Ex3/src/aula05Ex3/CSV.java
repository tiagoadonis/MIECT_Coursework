package aula05Ex3;
import java.util.*;
import java.io.*;

public class CSV implements AgendaInterface{
	
	public Pessoa[] readFromFile(String filename) throws IOException{
		File f = new File(filename);
		Scanner scf = new Scanner (f);
		scf.nextLine();
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		while(scf.hasNextLine()) {
			String[] str = scf.nextLine().split("\t");
			String nome = str[0];
			int cc = Integer.parseInt(str[1]);
			String[] date = str[2].split("/");
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
		pwf.println("CSV");
		int i = 0;
		while(i < pessoas.length) {
			pwf.println(pessoas[i].getNome()+"	"+pessoas[i].getCc()+"	"+pessoas[i].getNascimento().toString());
			i++;
		}
		pwf.close();
	}
}
