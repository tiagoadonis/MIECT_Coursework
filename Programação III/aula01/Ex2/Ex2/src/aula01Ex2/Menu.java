package aula01Ex2;
import static java.lang.System.*;
import java.util.*;

public class Menu {

static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[100];
		int pessoasOcupadas = 0;
		int opt = 0;
		
		do {
			out.println("1) Inserir uma nova pessoa");
			out.println("2) Apagar uma pessoa j� existente");
			out.println("3) Lista das pessoas");
			out.println("4) Sair");
			out.print("Op��o: ");
		
			opt = sc.nextInt();
			
			switch (opt) {
				case 1:
					out.print("Nome: ");
					String nome = sc.nextLine();
					out.println("");
					
					out.print("CC: ");
					String cc = sc.nextLine();
					out.println("");
					
					out.print("Data de Nascimento (dd/mm/aaaa): ");
					String line = sc.nextLine();
					out.println("");
					
					String[] data = line.split("/");
					int dia = Integer.parseInt(data[0]);
					int mes = Integer.parseInt(data[1]);
					int ano = Integer.parseInt(data[2]);
					
					Data date = new Data(dia, mes, ano);
					Pessoa a = new Pessoa(nome, cc, date);
					
					pessoas[pessoasOcupadas] = a;
					pessoasOcupadas++;
					out.println("Pessoa inserida com sucesso!!");
					break;
				case 2:
					out.println("Introduza o CC da pessoa a remover: ");
					String cartao = sc.nextLine();
					Pessoa[] tmp = new Pessoa[pessoasOcupadas];
					int index = 0;
					
					for (int i = 0; i < pessoasOcupadas; i++) {
						if ( !(pessoas[i].getCc().equals(cartao)) ) {
							tmp[index] = pessoas[i];
							index++;
						}
					}
					
					if (index == pessoasOcupadas) {
						out.println("ERRO! Pessoa n�o encontrada!");
					}
					else {
						out.println("Pessoa removida com sucesso!!");
						pessoas = tmp;
						pessoasOcupadas--;
					}
					
					break;
				case 3:
					for (int i = 0; i < pessoasOcupadas; i++) {
						pessoas[i].toString();
						out.println("");
					}
					break;
				case 4:
					exit(1);
					break;
			}
		}while(opt != 4);
	}

}
