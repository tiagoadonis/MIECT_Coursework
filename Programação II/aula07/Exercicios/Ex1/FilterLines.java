import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;
import java.util.*;   // => "error: reference to LinkedList is ambiguous"
// java.util.LinkedList colide com p2utils.LinkedList!
//import p2utils.LinkedList;

public class FilterLines
{
	public static void main(String[] args) throws IOException
	{
		if (args.length != 1) {
			err.printf("Usage: java -ea FilterLines text-file\n");
			exit(1);
		}
		File fil = new File(args[0]);

		// Criar listas para as linhas curtas, médias e longas.
		LinkedList<String> curtas = new LinkedList<>();
		LinkedList<String> medias = new LinkedList<>();
		LinkedList<String> longas = new LinkedList<>();

		Scanner sf = new Scanner(fil);
		// exceções poderiam ser intercetadas e mostrar mensagem de erro.
		while (sf.hasNextLine()) {
			String line = sf.nextLine();
			// Guardar linha na lista apropriada, consoante o tamanho.
			if(line.length() < 20){
				curtas.add(line);
			}else if (line.length() > 20 && line.length() < 40){
				medias.add(line);
			}else{
				longas.add(line);
			}
		}
		sf.close();
		
		// Escrever conteúdo das listas...
		out.println("Curtas---|---------|---------|---------|---------");
		for(int i = 0; i < curtas.size(); i++){
			out.println(""+curtas.get(i));
		}
		out.println();
		out.println("Médias---|---------|---------|---------|---------");
		for(int i = 0; i < medias.size(); i++){
			out.println(""+medias.get(i));
		}
		out.println();
		out.println("Longas---|---------|---------|---------|---------");
		for(int i = 0; i < longas.size(); i++){
			out.println(""+longas.get(i));
		}
	}
}
