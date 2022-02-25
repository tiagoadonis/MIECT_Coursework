package guiao11Ex1;
import java.util.*;

public abstract class TestCollections {
	public static void main(String[] args) {
		
		List<Pessoa> vp = new ArrayList<Pessoa>();
		for (int i=0; i<10; i++) {
			vp.add(new Pessoa("Beb� no Vector "+i, 1000+i, new Data()));
		}
			
		Iterator<Pessoa> vec = vp.iterator();
		
		printSet(vp.iterator());

		List<Pessoa> lp = new LinkedList<Pessoa>();
		while ( vec.hasNext() ) {
			lp.add( vec.next() );
		}
		
		Iterator<Pessoa> lista = lp.iterator();
		while ( lista.hasNext() ) {
			System.out.println( lista.next() );
		}
		
		List<Figura> figList = new LinkedList<Figura>();
		figList.add(new Circulo (1,3, 1));
		figList.add(new Quadrado(3,4, 2));
		figList.add(new Rectangulo(1,2, 2,5));
		
		printSet(figList.iterator());
		
		System.out.println("Soma da Area de Lista de Figuras: " +sumArea(figList));
		
		// Partindo do principio que Quadrado extends Rectangulo:
		List< Rectangulo > quadList = new LinkedList<Rectangulo>();
		quadList.add(new Quadrado(3,4, 2));
		quadList.add(new Rectangulo(1,2, 2,5));
		
		System.out.println("Soma da Area de Lista de Quadrados: " + sumArea(quadList));
	}
	
	public static double sumArea(List<? extends Figura> lista) {
		double totArea = 0;
		Iterator<? extends Figura> it = lista.iterator();
		if(it.hasNext()) {
			totArea = totArea + it.next().area();
		}
		return totArea;
	}
	
	public static void printSet(Iterator iterator) {
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}