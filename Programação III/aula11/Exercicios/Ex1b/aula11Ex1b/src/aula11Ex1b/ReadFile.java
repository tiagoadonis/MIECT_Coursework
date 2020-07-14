package aula11Ex1b;
import java.util.*;
import java.io.*;

public class ReadFile {

static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		HashSet<String> words = new HashSet<>();
		int totWords = 0; 
		
		System.out.print("Introduza o nome do ficheiro: ");
		String fileName = sc.nextLine();
		
		File f = new File(fileName);
		Scanner scf = new Scanner(f);
		
		while(scf.hasNextLine()) {
			String line = scf.nextLine().toLowerCase();
			String[] palavras = line.split(" ");
			for (int i = 0; i < palavras.length; i++) {
				if (words.contains(palavras[i])) {
					totWords++;
				}
				else {
					words.add(palavras[i]);
					totWords++;
				}
			}
		}
		scf.close();
	
		System.out.println("N�mero Total de Palavras: "+totWords);
		System.out.println("N�mero de Diferentes Palavras: "+words.size());
	}

}
