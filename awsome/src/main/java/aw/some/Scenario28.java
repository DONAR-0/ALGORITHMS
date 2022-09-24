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
	*
	* @param array
	* @return
	*/
	public ArrayList<Integer> remove_duplicate(ArrayList<Integer> array) {
		var outputList = new ArrayList<Integer>();
		for (Integer intV:array) {
			if (outputList.contains(intV)) {
				LOG.info("{}",intV);
				continue;	
			} else {
				outputList.add(intV);
			}
		}
		return outputList;
	}
}
