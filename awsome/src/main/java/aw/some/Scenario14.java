package aw.some;

import java.util.Arrays;

/**
* Scenario14
*/
public class Scenario14 {

	public int averageValueOfArray(int[] array) {
		
		var sum = 0;
		for (int i : array) {
	             	sum = sum + i;
		}
		return sum / (array.length - 1);
	}

	public Integer averageValueOfArray1(Integer[] array){
		return Arrays.stream(array)
		.mapToInt(i -> i)
		.sum() / (array.length - 1);
	}
}
