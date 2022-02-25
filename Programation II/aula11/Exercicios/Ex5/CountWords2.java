import static java.lang.System.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import p2utils.SortedKeyValueList;

public class CountWords2{

	public static void main(String[] args) throws IOException {
		SortedKeyValueList<Integer> counts = new SortedKeyValueList<>();
		for (int a = 0; a < args.length; a++) { // Processa cada ficheiro
			File fin = new File(args[a]);
			if (fin.exists() && fin.canRead()) {
				Scanner scf = new Scanner(fin);
				while (scf.hasNextLine()) { // Processa cada linha
					String line = scf.nextLine();
					// Divide a linha em "palavras", considerando como separador
					// qualquer sequência de 1 ou mais carateres não alfabéticos:
					String[] palavras = line.split("[^\\p{IsAlphabetic}]+"); 
					// (Sobre expressões regulares usadas no split: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)
					for (int i = 0; i < palavras.length; i++) { // Processa cada palavra
						// Completar...
						if(palavras[i].length() > 0){
							palavras[i] = palavras[i].toLowerCase();
							if(!counts.contains(palavras[i])){
								counts.set(palavras[i], 1);
							}else{
								int count = counts.get(palavras[i]);
								count++;
								counts.set(palavras[i], count);
							}
						}
					}
				}
				scf.close();
			}
			else {
				err.println("ERRO: Nao foi possivel ler do ficheiro "+args[a]);
			}
		}
		out.println(counts.toString("Results:\n", ";\n", "\nEnd"));
		out.println(counts.toString()); // mesma lista, outro formato
		mostFrequent(counts);
	}

	// Find and print the key with most occurrences
	// and its relative frequency.
	static void mostFrequent(SortedKeyValueList<Integer> counts) {
		String[] keys = counts.keys();
		int tot = 0;
		String word = "";
		int soma = 0;
		for(int i = 0;  i < keys.length; i++){
			if (counts.get(keys[i]) > tot){
				tot = counts.get(keys[i]);
				word = keys[i];
			}
			soma = soma + counts.get(keys[i]);
		}
		out.printf("Most frequent: %s (%2.2f%s)\n",word, 100.0*tot/soma, "%");
	}
}

