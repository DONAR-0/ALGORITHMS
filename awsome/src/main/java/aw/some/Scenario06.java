package aw.some;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario06
*/
public class Scenario06 {

	private static Logger LOGGER = LoggerFactory.getLogger(Scenario06.class);

	/**
	* Largest and Smallest value
	* @param array 
	*/
	public void largestAndSmallest(int[] array) {
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		for (int i : array) {
			if (i > maxValue) {
				maxValue = i;
			} if (i < minValue) {
				minValue = i;
			}
		}
		LOGGER.info("max value = {},min value = {}",maxValue,minValue);
	}

	/**
	* 
	* @param array
	* @param sum
	*/
	public HashMap<Integer,Integer> printPairs(int[] array,int sum) {
		HashMap<Integer,Integer> pairMap = new HashMap<>();
		for(int i = 0; i < array.length;i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				if ((first + second) == sum) {
					//System.out.printf("Pair Found (%d,%d) %n",first,second);
					pairMap.put(first,second);
				}
			}
		}
		return pairMap;
	} 

	/**
	* O(n)
	* because comparision is done 
	* 
	* !set.contains(target) is o(1)
	* 
	* because behind the scene it uses hashmap
	*
	* */
	public HashMap<Integer,Integer> printPairsUsingSet(int[] array,int sum) {
		if (array.length < 2) {
			throw new IllegalArgumentException("array size should be greater than 2");
		}
		Set<Integer> set= new HashSet<>(array.length);
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		for (int integer : array) {
			int target = sum - integer;
			if (!set.contains(target)) {
				set.add(integer);
			} else {
				//System.out.printf("(%d,%d) %n",integer,target);
				hashMap.put(integer,target);
			}
		}
		return hashMap;
	}

	public void printPairsLoSpaceComplexity(int[] numbers,int sum) {
		if (numbers.length < 2) {
			throw new IllegalArgumentException("");
		}
		Arrays.sort(numbers);
		int left = 0;int right = numbers.length -1;
		while (left < right) {
			int k = numbers[left] + numbers[right];
			if (sum == k) {
				System.out.printf("(%d,%d) %n",numbers[left],numbers[right]);
				left = left + 1;
				right = right - 1;
			} else if(k < sum){
				left = left + 1;
			} else if(k > sum) {
				right = right - 1;
			}
		}
	}

	/***
	* Revisit
	*
	* @param numbers
	* @param sum
	* @return true/false
	*/
	public boolean checkIfPairExist(int[] numbers,int sum){
		if (numbers.length < 2) {
			throw new IllegalArgumentException("Array size should be greater than three");
		}
		Set<Integer> trackerSet = new HashSet<>(numbers.length);
		for(int integer : numbers){
			int target = sum - integer;
			if (!trackerSet.contains(target)) {
				trackerSet.add(integer);	
			} else {
				return true;
			}
		}
		return false;
	}



}
