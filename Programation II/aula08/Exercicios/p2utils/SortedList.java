package p2utils;
import static java.lang.System.*;

public class SortedList<E extends Comparable<E>>{
	// private attributes
	private Node<E> first = null;
	private int size = 0;

	public SortedList() { }

	/**
	* @return Number of elements in the list
	*/
	public int size() { return size; }

	/** Checks if the list is empty.
	* @return  {@code true} if list empty, otherwise {@code false}.
	*/
	public boolean isEmpty() { return size == 0; }

	/**
	* @return  First element in the list
	*/
	public E first() {
		assert !isEmpty(): "empty!";
		return first.elem;
	}

	/** Inserts a new element in the list.
	* @param e the element to be inserted
	*/
	public void insert(E e) {
		first = insert(first,e);
		size++;
	}
	
	private Node<E> insert(Node<E> n,E e) {
		if (n==null || e.compareTo(n.elem) < 0)
			return new Node<E>(e,n);
		n.next = insert(n.next,e);
		return n;
	}

	/** Removes the first element in the list.
	*/
	public void removeFirst() {
		assert !isEmpty(): "empty!";
		first = first.next;
		size--;
	}

	/** Checks if the list is sorted.
	* @return {@code true} if sorted, {@code false} otherwise
	*/
	public boolean isSorted() { 
		if (size < 2)
			return true;
		return isSorted(first,first.next); 
	}
	private boolean isSorted(Node<E> prev,Node<E> n) {
		if (n == null) return true;
		if (n.elem.compareTo(prev.elem) < 0) return false;
		return isSorted(n,n.next);
	}
	
	//contains
	public boolean contains(E e){
		return contains(first, e);
	}
	private boolean contains(Node<E> elemento, E e){
		if ((elemento == null) || (e.compareTo(elemento.elem) < 0)) return false;
		if (elemento.elem.equals(e)) return true;
		return contains(elemento.next, e);
	}
	
	//toString
	public String toString(){
		Node<E> tmp = first;
		String str = "[" + tmp.elem;
		tmp = tmp.next;
		while(tmp != null){ 
			str = str + ", " + tmp.elem;
			tmp = tmp.next;
		}
		return str + "]";
	}
	
	//merge
	public SortedList<E> merge(SortedList<E> toMerge){
		SortedList temp = toMerge.clone();
		return merge(this.first, temp);
	}
	private SortedList<E> merge(Node<E> elemento, SortedList<E> toMerge){
		if(elemento != null){
			toMerge.insert(elemento.elem);
			return merge(elemento.next, toMerge);
		}else{
			return toMerge;
		}
	}

	public SortedList<E> clone(){
		return clone(this.first);
	}
	private SortedList<E> clone(Node<E> elemento){
		if (elemento == null) {
		  return new SortedList();
		}
		SortedList temp = clone(elemento.next);
		temp.insert(elemento.elem);
		return temp;
	}
}
