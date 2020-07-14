package p2utils;
import static java.lang.System.*;
import java.util.Scanner;
import java.util.Arrays;

/**
 * This class contains several sorting algorithms and
 * auxiliary methods and fields for evaluating their complexity.
 */
public class Sorting {

	// Fields to measure times:
	public static long startTime;  // start time of latest measurement (in ns)
	public static double elapsedTime;  // seconds elapsed in latest measurement

	// Fields to count operations: 
	public static long assignmentCount = 0L;
	public static long comparisonCount = 0L;

	// Start a new measurement
	public static void startMeasuring() {
	assignmentCount = 0L;
	comparisonCount = 0L;
	startTime = nanoTime();
	}

	// Stop a measurement (determine elapsedTime)
	public static void stopMeasuring() {
		elapsedTime = (double)(nanoTime() - startTime) * 1e-9;
	}


	/**
	* Sequential sort ("greedy" variation of selection sort).
	* Increasing sorting of integer subarray a[start..end[
	* @param a      the array to be (partially) sorted.
	* @param start  index of the first element to sort.
	* @param end    index of the first element not to be sorted (the last element to sort is {@code end-1}).
	* Requires:   a!=null and 0 <= start <= end <= a.length
	* Ensures:  The elements a[k] with start <= k < end are sorted.  the remaining elements are not changed.
	*/
	public static void sequentialSort(int[] a, int start, int end) {
		assert a!=null;
		assert 0<=start && start<=end && end<=a.length;

		for (int i=start; i<end-1; i++) { // For each element (except the last):
			for (int j=i+1; j<end; j++) {   // Scan every following element
				if (a[j] < a[i]) {            // compare them
					swap(a, i, j);              // if necessary, swap them
				}
				comparisonCount++;
			}
		}
	}

	/**
	* Bubble sort.
	* Optimized version.
	*/
	public static void bubbleSort(int[] a, int start, int end) {
		assert a!=null;
		assert 0<=start && start<=end && end<=a.length;

		while (start < end-1) {
			int last = start;
			for (int i=start; i<end-1; i++) {
				if (a[i] > a[i+1]) {
					swap(a, i, i+1);
					last = i;   // store index of the last swap
					assignmentCount++;
				}
				comparisonCount++;
			}
			// Elements a[last+1, end[ must be sorted now
			// So, next pass may stop there
			end = last+1;
		}
	}

	/**
	* Swaps two elements of an integer array.
	* @param a the array
	* @param i index of an element to swap
	* @param j index of the other element to swap
	* {@code i},{@code j} must be valid indexes within array {@code a}
	*/
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		assignmentCount = assignmentCount + 3;
	}


	public static void insertionSort(int[] a, int start, int end) {
		for (int i = start + 1; i < end; i++) {
		int j;
		int v = a[i];
		assignmentCount++;
			for (j = i-1; j >= start && a[j] > v; j--) {
				a[j+1] = a[j];
				assignmentCount++;
			}
		comparisonCount++;
		a[j+1] = v;
		assignmentCount++;
		}
	}

	public static void mergeSort(int[] a, int start, int end) {
		if(end - start > 1){
			int middle = (start + end)/2;
			mergeSort(a, start, middle);
			mergeSort(a, middle, end);
			mergeSubarrays(a, start, middle, end);
		}
	}

	public static void mergeSubarrays(int[] a, int start, int middle, int end) {
		int[] b = new int[end-start];
		int st = start;
		assignmentCount++;
		int md = middle;
		assignmentCount++;
		int j = 0;
		assignmentCount++;
		while (st < middle && md < end) {
			if (a[st] < a[md]) {
				b[j++] = a[st++];
			}
			else {
				b[j++] = a[md++];
			}
			comparisonCount++;
			assignmentCount++;
		}
		while (st < middle) {
			b[j++] = a[st++];
			assignmentCount++;
		}
		while (md < end) {
			b[j++] = a[md++];
			assignmentCount++;
		}
		arraycopy(b, 0, a, start, end-start);
	}

	// Test if [start, end[ defines a valid interval of indices in array a.
	public static boolean validSubarray(int[] a, int start, int end) {
		return a != null && 0 <= start && start <= end && end <= a.length;
	}

	public static boolean isSorted(int[] a, int start, int end) {
		assert validSubarray(a, start, end);
		boolean result = true;
		for(int i = start; result && i < end-1; i++)
			result = a[i] <= a[i+1];
		return result;
	}

	// Generic metque hod for sorting arrays of any reference type:
	public static <E extends Comparable<E>> void mergeSort(E[] a, int start, int end) {
		assert(validSubarray(a, start, end));
		if(end - start > 1){
			int mid = (start + end) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid, end);
			mergeSubarrays(a, start, mid, end);
		}
	}
	public static <E extends Comparable<E>> void mergeSubarrays(E[] a, int start, int mid, int end) {
		assert(validSubarray(a, start, mid));
		assert(validSubarray(a, mid, end));
		
		Comparable[] array = new Comparable[end - start];
		
		int s = start;
		int m = mid;
		int i = 0;
		
		while((s < mid) && (m < end)){
			if (a[i].compareTo(a[m]) < 0){
				array[i++] = a[s++];
			}else{
				array[i++] = a[m++];
			}
		}
		while(s < mid){
			array[i++] = a[s++];
		}
		while(m < end){
			array[i++] = a[m++];
		}
		arraycopy(array, 0, a, start, end-start);
	}
	
	public static <E> boolean validSubarray(E[] a, int start, int end){
		return (a != null) && (0 <= start) && (start <= end) && (end <= a.length);
	}
	
	public static <E extends Comparable<E>> boolean isSorted(E[] a, int start, int end){
		assert validSubarray(a, start, end);
		boolean result = true;
		for(int i = start; result && i < end-1; i++)
			result = a[i].compareTo(a[i+1]) <= 0;
		return result;
	}
}

