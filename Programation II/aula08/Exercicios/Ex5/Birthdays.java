import static java.lang.System.*;
import p2utils.*;

// Analise e complete este programa.
// Experimente chamar, por exemplo:
//
// java -ea Birthdays 1867-09-07 Curie 1879-03-14 Einstein 1809-02-12 Darwin

public class Birthdays{
	public static void main(String[] args) {
		if (args.length % 2 != 0) {
			err.println("Erro: número de argumentos inválido");
			err.println("Utilização: java Birthdays data1 nome1 data2 nome2 ...");
			err.println("Cada data no formato YYYY-MM-DD.");
			exit(1);
		}

		// Criar lista para guardar pessoas:
		SortedList<Pessoa> lista = new SortedList();

		for (int i=0; i<args.length/2; i++) {
			String[] array = args[2*i].split("-");
			
			int ano = Integer.parseInt(array[0]);// devolve null, se inválida!
			int mes = Integer.parseInt(array[1]);
			int dia = Integer.parseInt(array[2]);
			
			Data nasc = new Data(dia, mes, ano);
			String nome = args[2*i+1];

			// Criar nova pessoa com os dados dos argumentos e acrescentar à lista:
			lista.insert(new Pessoa(nasc, nome));
		}

		// Imprimir a lista:
		out.println(lista.toString());
	}
}

