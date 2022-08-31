package aw.some;

import java.util.Arrays;

/**
* Scenario19
*/
public class Scenario19 {
	private int[] a;
	
	/**
	* Initialize a set of integers specified by integer arrays
	* @param keys the arrays of integers
	* @throws IllegalArgumentException if array contains the duplicates
	* */
	public Scenario19(int[] keys) {
		
		//Defensive Copy
		a = new int[keys.length];
		for(int i = 0; i < keys.length;i++) {
			a[i] = keys[i];
		}
		// sort the integers
		Arrays.sort(keys);

		//check for duplicates
		for (int i = 1; i < keys.length; i++) {
			if (a[i] == a[i - 1]) {
				throw new IllegalArgumentException("Arguments arrays contains duplicates");
			}
		}
	}

	/**
	* Is the key in this set of integers
	* @param key the search key
	* @return the number of keys in this set less than the key (if the key is in set)
	* */
	public boolean contains(int key) {
		return rank(key) != -1;
	}

	public int rank(int key) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) {
				hi = mid - 1;
			} else if(key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
