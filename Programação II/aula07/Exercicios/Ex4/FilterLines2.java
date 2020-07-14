import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;
// import java.util.*;   // => "error: reference to LinkedList is ambiguous"
// java.util.LinkedList colide com p2utils.LinkedList!
import p2utils.LinkedList;

public class FilterLines2{
	public static void main(String[] args) throws IOException
	{
		if (args.length != 1) {
			err.printf("Usage: java -ea FilterLines text-file\n");
			exit(1);
		}
		File fil = new File(args[0]);

		// Criar listas para as linhas curtas, médias e longas.
		LinkedList<String> curtas = new LinkedList<>();
		LinkedList<String> longas = new LinkedList<>();

		Scanner sf = new Scanner(fil);
		// exceções poderiam ser intercetadas e mostrar mensagem de erro.
		while (sf.hasNextLine()) {
			String line = sf.nextLine();
			// Guardar linha na lista apropriada, consoante o tamanho.
			if(line.length() < 20){
				curtas.addLast(line);
			}else{
				longas.addFirst(line);
			}
		}
		sf.close();
		
		// Escrever conteúdo das listas...
		out.println("Curtas---|---------|---------|---------|---------");
		curtas = curtas.reverse();
		curtas.print();
		out.println();
		out.println("Longas---|---------|---------|---------|---------");
		longas.print();
	}
}

