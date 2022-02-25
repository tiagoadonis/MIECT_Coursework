package aula10Ex1;
import java.util.*;

public class ListaGeneric<T> {
	private List<T> lista = new LinkedList<>();
	
	public boolean addElem(T elem) {
		return lista.add(elem);
	}
	
	public boolean removeElem(T elem) {
		return lista.remove(elem);
	}
	
	public int totalElem() {
		return lista.size();
	}
	
	public Iterator<T> iterator() {
		Iterator<T> iterator = lista.iterator();
		return iterator;
	}
}
