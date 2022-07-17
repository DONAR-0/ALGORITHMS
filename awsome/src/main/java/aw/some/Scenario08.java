package aw.some;

import java.util.List;
import java.util.*;

/**
* Find Missing Number in given array of numbers
* with duplicates in it.
*
*/
public class Scenario08 {


	/**
	* Find Missing Number
	*
	* @return
	*/
	public List<Integer> findMissingNumber(int[] input) {

		int[] register = new int[input.length];
		List<Integer> results = new ArrayList<>();

		for (int i:input) {
			register[i] = 1;
		}

		for (int i = 0; i < register.length; i++) {
			if (register[i] == 0) {
				results.add(i);
			}	
		}

		return results;
	}

	public int[] reverseArray(int[] reverse){
		for (int i = 0; i < reverse.length / 2; i++) {
			swap(reverse, i, reverse.length - i - 1);
		}
		return reverse;
	}

	/**
	* 
	* @param values
	* @param i
	* @param j
	*/
	private void swap(int[] values,int i,int j) {
		int temp = values[i];
		values[i] = values[j];
		values[j] = temp;
	}
}
