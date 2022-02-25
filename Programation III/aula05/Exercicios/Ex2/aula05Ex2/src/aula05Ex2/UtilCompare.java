package aula05Ex2;

public class UtilCompare {
	
	public static void sortArray(Comparable[] listaVeic) {
		for (int i = listaVeic.length-1; i >= 0; i-- ) {
			for (int j = 0; j < i; j++) {
				if (listaVeic[j].compareTo(listaVeic[j+1]) > 0) {
					Comparable tmp = listaVeic[j];
					listaVeic[j] = listaVeic[j+1];
					listaVeic[j+1] = tmp;
				}
			}
		}
	}
}
