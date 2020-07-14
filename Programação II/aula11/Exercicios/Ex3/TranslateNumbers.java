import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class TranslateNumbers {
	
static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) throws IOException{
		HashMap<String ,Integer> mapa = new HashMap<>();
		File fin = new File("numbers.txt");
		Scanner sf = new Scanner(fin);
		
		while(sf.hasNextLine()) {
			String[] line = sf.nextLine().split(" - ");
			String extenso = line[1];
			int numero = Integer.parseInt(line[0]);
			mapa.put(extenso, numero);
		}
		sf.close();
		
		out.print("A list of numbers: ");
		String[] lista = sc.nextLine().split(" ");
		for (int i = 0; i < lista.length; i++) {
			out.print(""+mapa.get(lista[i])+" ");
		}
		out.println("");
	}
}

