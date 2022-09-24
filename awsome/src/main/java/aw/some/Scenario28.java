package aw.some;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario28
*
* Remove Duplicates in an array 
*
*/
public class Scenario28 {


	private static final Logger LOG = LoggerFactory.getLogger(Scenario28.class);
	
	/***
	* Remove Duplicates when array is param
	* time Complexity of o(n2)
	* space Complexity of o(n)
	*
	* @param array
	* @return
	*/
	public ArrayList<Integer> remove_duplicate(ArrayList<Integer> array) {
		var outputList = new ArrayList<Integer>();
		for (Integer intV:array) {
			if (outputList.contains(intV)) {
				continue;	
			} else {
				outputList.add(intV);
			}
		}
		return outputList;
	}
	
	/***
	 * Now one more solution is to
	 * sort the array and match with previous character
	 *
	 *
	 * */
	 public void remove_duplicate_1(ArrayList<Integer> array) {
		
	 }
}
