package aula10Ex1;
import java.util.*;

public class VectorGeneric<T> {
	private List<T> lista = new ArrayList<>();
	
	public boolean addElem(T elem) {
		return lista.add(elem);
	}
	
	public boolean removeElem(T elem) {
		return lista.remove(elem);
	}
	
	public int totalElem() {
		return this.lista.size();
	}
	
	public Iterator<T> iterator() {
		Iterator<T> iterator = lista.iterator();
		return iterator;
	}
}
