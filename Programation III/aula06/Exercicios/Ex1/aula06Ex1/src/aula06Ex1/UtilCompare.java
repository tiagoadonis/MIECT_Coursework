package aula06Ex1;

public class UtilCompare {
	public static void sortArray(Comparable[] alimentos) {
		for (int i = alimentos.length-1; i >= 0; i-- ) {
			for (int j = 0; j < i; j++) {
				if (alimentos[j].compareTo(alimentos[j+1]) > 0) {
					Comparable tmp = alimentos[j];
					alimentos[j] = alimentos[j+1];
					alimentos[j+1] = tmp;
				}
			}
		}
	}
}
