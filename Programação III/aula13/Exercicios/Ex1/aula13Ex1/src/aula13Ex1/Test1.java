package aula13Ex1;
import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Localidade cid1 = new Localidade("Szohod", 31212, TipoLocalidade.Cidade);
		Localidade cid2 = new Localidade("Wadesdah", 23423,TipoLocalidade.Cidade);
		Localidade cid3 = new Localidade("BedRock", 23423,TipoLocalidade.Vila);
		
		Estado est1 = new Estado("North Borduria", 223133, cid1);
		Estado est2 = new Estado("South Borduria", 84321, cid2);
		
		Pais p1 = new Pais("Borduria", est1.getCapital());
		Pais p2 = new Pais("Khemed", cid2);
		Pais p3 = new Pais("Aurelia");
		Pais p4 = new Pais("Atlantis");
		
		p1.addRegiao(est1);
		p1.addRegiao(est2);
		p2.addRegiao(new Provincia("Afrinia", 232475, "Aluko Pono"));
		p2.addRegiao(new Provincia("Eriador", 100000, "Dumpgase Liru"));
		p2.addRegiao(new Provincia("Laurania", 30000, "Mukabamba Dabba"));
		
		List<Pais> org = new ArrayList<Pais>();
		org.add(p1);
		org.add(p2);
		org.add(p3);
		org.add(p4);
		
		//-----------------Debug-----------------------------------
		/*for(Regiao tmp : p1.getRegioes()) {
			System.out.println(tmp.getNome()+" populacao "+tmp.getPopulacao());
		}*/
		//-------------------------------------------------------
		
		System.out.println("-------Iterar sobre o conjunto");
		Iterator<Pais> itr = org.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------Iterar sobre o conjunto - For each (java 8)");
		for (Pais pais: org) {
			System.out.println(pais);
		}
		
		// ToDo:
		// adicionar, remover, ordenar, garantir elementos �nicos
		
		// ordenar por popula��o
		org.sort(new Comparator<Pais>() {
			@Override
			public int compare(Pais pais1, Pais pais2) {
				int dif = pais1.getPopulacao() - pais2.getPopulacao();
				if (dif > 0) {
					return 1;
				}
				else if (dif < 0) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});
		System.out.println();
		System.out.println("Ordena��o crescente por popula��o:");
		for (Pais pais: org) {
			System.out.println(pais);
		}
		
		// Remove
		System.out.println();
		org.remove(p2);
		org.remove(p3);
		System.out.println("Depois dos removes:");
		for (Pais pais: org) {
			System.out.println(pais);
		}
	
	}
}
