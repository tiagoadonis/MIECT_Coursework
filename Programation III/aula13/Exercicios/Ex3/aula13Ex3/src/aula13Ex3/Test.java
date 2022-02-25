package aula13Ex3;
import java.util.*;

public class Test {

public static final String[] nomes = {"Tiago", "Carlos", "Paulo", "Daniel", "Jo�o", "Rafael", "Diogo", "Pedro", "Hugo",
		                             "Eduardo", "Edgar", "S�rgio", "Ana", "Maria", "In�s", "Carolina", "Mariana", "J�ssica",
		                             "Joana", "Filpa", "Carla", "M�nica", "Susana", "Beatriz"};

public static final String[] apelidos = {"Dias", "Antunes", "Pereira", "Sousa", "Jesus", "Oliveira", "Fernandes", "Martins", 
										"Almeida", "Abrantes", "Alves", "Santos", "Andrade", "Batista", "Br�s", "Cabral", 
										"Silva", "Carvalho", "Esteves", "Farias", "Ferro", "Gomes", "Lemos", "Macedo"};

public static final String[] brinquedos = {"Carro telecomandado", "Bola de Futebol", "Legos", "Pi�o", "Ioi�", "Cavalinho de pau",
										  "Corda", "Bonecas", "Frisbee", "Casa de bonecas", "Playstation", "Viola"};
	
	public static void main(String[] args) {
		BrincaBeira BB = new BrincaBeira(50);
		
		for (int i = 0; i < 50; i++) {
			int num = (int) (23 * Math.random());
			BB.addFunc(nomes[num], apelidos[num]);
		} 
		
		System.out.println("Lista de Funcion�rios:");
		System.out.println();
		BB.listarFunc();
		System.out.println("----------------------------------------------------");
		
		for (int i = 0; i < 12; i++) {
			int num = (int) (12 * Math.random());
			switch(i) {
				case 0:
					System.out.print("Janeiro: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 1:
					System.out.print("Fevereiro: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 2:
					System.out.print("Mar�o: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 3:
					System.out.print("Abril: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 4:
					System.out.print("Maio: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 5:
					System.out.print("Junho: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 6:
					System.out.print("Julho: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 7:
					System.out.print("Agosto: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 8:
					System.out.print("Setembro: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 9:
					System.out.print("Outubro: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 10:
					System.out.print("Novembro: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
				case 11:
					System.out.print("Dezembro: ");
					BB.darBrinquedo(brinquedos[num]);
					break;
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Primeiros nomes dos funcion�rios: ");
		System.out.println();
		ArrayList<String> firstNames = BB.primeirosNomes();
		for(String str : firstNames) {
			System.out.println(str);
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("Frequ�ncia dos primeiros nomes dos funcion�rios: ");
		HashMap<String, Integer> freqFirstNames = BB.freqPrimeirosNomes();
		System.out.println();
		String[] keys = new String[freqFirstNames.size()];
		freqFirstNames.keySet().toArray(keys);
		
		for (String str : keys) {
			System.out.println(str + " = "+ freqFirstNames.get(str));
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("Distribui��o ingressos de futebol: ");
		System.out.println();
		BB.ingressosFutebol();
	}
}