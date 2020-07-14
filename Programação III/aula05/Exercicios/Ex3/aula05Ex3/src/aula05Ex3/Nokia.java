package aula05Ex3;
import java.io.*;
import java.util.*;

public class Nokia implements AgendaInterface{
	
	public Pessoa[] readFromFile(String filename) throws IOException{
		File f = new File(filename);
		Scanner scf = new Scanner (f);
		scf.nextLine();
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		while (scf.hasNextLine()) {
			String nome = scf.nextLine();
			int cc = Integer.parseInt(scf.nextLine());
			String [] data = scf.nextLine().split("/");
			if(scf.hasNextLine()) {
				scf.nextLine();
			}
			Data date = new Data(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));
			Pessoa p = new Pessoa(nome, cc, date);
			pessoas.add(p);
		}
		scf.close();
		return pessoas.toArray(new Pessoa[0]);
	}
	
	public void writeToFile(String filename, Pessoa[] pessoas) throws IOException{
		File f = new File(filename);
		PrintWriter pwf = new PrintWriter(f);
		pwf.println("Nokia");
		int i = 0;
		while(i < pessoas.length) {
			pwf.println(pessoas[i].getNome());
			pwf.println(pessoas[i].getCc());
			pwf.println(pessoas[i].getNascimento().toString());
			pwf.println("");
			i++;
		}
		pwf.close();
	}
}
