package p2utils;
import java.lang.*;
/** This class implements a "dynamic" array of elements of generic type.
 * The capacity of a dynamic array grows automatically, as needed.
 * It implements a random access abstract data type, with two main methods:
 * set and get.
 */
@SuppressWarnings("unchecked")
public class DynamicArray<E> {

	private E[] array;
	private int maxidx = -1;  // maximum index ever set

	private static final int BLOCK = 256;

	// Define the constructor to initialize the fields
	public DynamicArray(){
		this.array = (E[]) new Object[0];
	}

	/** Returns the length of the array.
	* The "length" is defined as 1 plus the maximum index that was set.
	* @return Number of elements in the array
	*/
	public int length() { return 1+maxidx; }

	/** Set the element in position idx to given value.
	*/
	public void set(int idx, E value) {
		assert idx >= 0;
		
		if(idx > maxidx){
			maxidx = idx;
		}
		
		if (idx < array.length){
			this.array[idx] = value;
		}
		else{
			int a = ((idx + BLOCK) / BLOCK) * BLOCK; 
			E[] tmp = (E[]) new Object[a];
			System.arraycopy(array, 0, tmp, 0, array.length);
			this.array = tmp;
			array[idx] = value;
		}
		
	}
	/** Return the element in a given position in the list.
	* @param idx  the index of the element (0 is the first).
	* @return value at position idx of the array, or null, if not set yet.
	*/
	public E get(int idx) {
		assert idx >= 0;
		if (array[idx] != null){
			return array[idx];
		}
		return null;
	}

	// Define the second get method
	public E get(int idx, E value){
		assert idx >= 0;
		if (array[idx] != null){
			return array[idx];
		}
		return value;
	}
}
