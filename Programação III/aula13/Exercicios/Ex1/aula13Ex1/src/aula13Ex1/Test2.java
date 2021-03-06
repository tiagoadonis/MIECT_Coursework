package aula13Ex1;
import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		Cidade cid1 = new Cidade("Szohod", 31212);
		Cidade cid2 = new Cidade("Wadesdah", 23423);
		Vila cid3 = new Vila("BedRock", 23423);
		
		Estado2 est1 = new Estado2("North Borduria", 223133, cid1);
		Estado2 est2 = new Estado2("South Borduria", 84321, cid2);
		
		Pais2 p1 = new Pais2("Borduria", est1.getCapital());
		Pais2 p2 = new Pais2("Khemed", cid2);
		Pais2 p3 = new Pais2("Aurelia");
		Pais2 p4 = new Pais2("Atlantis");
		
		// IllegalArgumentException: Capital Inv�lida
		Pais2 p5 = new Pais2("Khemed", cid3);
		
		// ERROR
		//Estado est3 = new Estado("Ohio", 409876, cid3);
		
		p1.addRegiao(est1);
		p1.addRegiao(est2);
		p2.addRegiao(new Provincia("Afrinia", 232475, "Aluko Pono"));
		p2.addRegiao(new Provincia("Eriador", 100000, "Dumpgase Liru"));
		p2.addRegiao(new Provincia("Laurania", 30000, "Mukabamba Dabba"));
		
		List<Pais2> org = new ArrayList<Pais2>();
		org.add(p1);
		org.add(p2);
		org.add(p3);
		org.add(p4);
		org.add(p5);
	}
}
