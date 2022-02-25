package p2utils;
import static java.lang.System.*;

public class SortedArray<E extends Comparable<E>> {
	
	private E[] array;
	private int numElems = 0;
	
	public SortedArray(int size){
		this.array = (E[]) new Comparable[size];
	}
	
	public int size(){
		return array.length;
	}
	
	public E first() {
		assert !isEmpty(): "empty!";
		return this.array[0];
	}
	
	public boolean isFull(){
		return this.numElems == this.array.length;
	}
	
	public boolean isEmpty(){
		return this.numElems == 0;
	}
	
	public void insert(E e) {
		assert !isFull(): "full!";
		if(numElems == 0){
			array[0] = e;
		}else{
			for(int i = numElems-1; i >= 0; i--){
				if(array[i].compareTo(e) > 0){
					array[i+1] = array[i];
					array[i] = e;
				}else{
					array[i+1] = e;
					break;
				} 
			}
		}
		assert isSorted(): "Not sorted!";
		numElems++;
	}
	
	public void removeFirst() {
		assert !isEmpty(): "empty!";
		arraycopy(array, 1, array, 0, --numElems);
	}
	
	public boolean isSorted(){
		if (numElems < 2)
			return true;
		return isSorted(array, 0);
	}
	private boolean isSorted(E[] array, int i){
		if (i == numElems-1) return true;
		if (array[i].compareTo(array[i++]) < 0) return false;
		return isSorted(array, i);
	}
	
	public boolean contains(E e){
		return contains(array, 0, e);
	}
	private boolean contains(E[] array, int i, E e){
		if (i == numElems) return false;
		if(array[i].compareTo(e) == 0){
			return true;
		}else{
			return contains(array, ++i, e);
		}
	}
	
	public String toString(){
		String str = "[" + array[0];
		for (int i = 1; i < numElems; i++){ 
			str = str + ", " + array[i];
		}
		return str + "]";
	}
	
	//Merge
	public SortedArray<E> merge(SortedArray<E> toMerge){
		SortedArray<E> temp = new SortedArray<E>(array.length + toMerge.array.length);
		for(int i = 0; i < numElems; i++){
			temp.insert(array[i]);
		}
		for (int j = 0; j < toMerge.numElems; j++){
			temp.insert(toMerge.array[j]);	
		}
		return temp;
	}
}

