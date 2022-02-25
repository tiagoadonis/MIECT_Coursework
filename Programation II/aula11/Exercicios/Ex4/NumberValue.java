import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class NumberValue {

static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) throws IOException{
		int sum = 0, buffer = 0, num = 0;;
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
		
		String[] lista = sc.nextLine().split("\\s+");
		for (int i = 0; i < lista.length; i++) {
			if(mapa.containsKey(lista[i])) {
				num = mapa.get(lista[i]);
			}else {
				err.println("Wrong usage - unsupported format.");
				exit(1);
			}
			if (buffer == 0) {
				buffer = buffer + num;
			}
			else if(num > buffer) {
				buffer = buffer * num;
			}
			else {
				sum = sum + buffer;
				buffer = num;
			}
		}
		sum = sum + buffer;
		for (int i = 0; i < lista.length; i++) {
			out.print(lista[i]+" ");
		}
		out.println("-> "+sum);
	}
}

