package aula06Ex2;
import java.util.*;
import java.util.function.Predicate;

public class ListsProcess{
	public static <T> List<T> filter (List<T> lista, Predicate<T> filtro){
		List<T> tmp = new ArrayList<>();
		for(T elem : lista) {
			if(filtro.test(elem)) {
				tmp.add(elem);
			}
		}
		return tmp;
	}
}
