package aw.some;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**.
* Some of the common programs
*
*/
public class Scenario05 {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario05.class);
	/**
	* missing number using the sum
	*
	* @param array
	* @param totalCount
	* @return number value 
	*/
	public int getMissingNumber(int[] array,int totalCount) {
		Integer sumOfArray = Arrays.stream(array, 0, array.length).sum();
		Integer totalSumOfNumber = (totalCount * (totalCount + 1) / 2);
		return totalSumOfNumber - sumOfArray;
	}

	/**
	* DUplicate chars in a word
	* @param word
	*/
	public void printDuplicateCharaters(String word) {
		char[] chars = word.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for (char c : chars) {
			if (map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Map.Entry<Character,Integer>> entries = map.entrySet();
		for (Map.Entry<Character,Integer> entry:map.entrySet()) {
			if (entry.getValue() > 1) {
			System.out.printf("key %s and value %d %n",entry.getKey(),entry.getValue());	
			}
		}
	}

	/********************************************************************************/
	/************************************** Anagram Code ****************************/
	/********************************************************************************/
	
	/**
	* Anagram One 
	* @param word words needs to check
	* @param anagram anagram word to check
	* @return boolean
	*/
	public boolean isAnagram(String word,String anagram){
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		//empty anagram word with word 
		//
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1,anagram.length());
				System.out.println(anagram);
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}
	
	/**
	* Anagram Two 
	* @param word words needs to check
	* @param anagram anagram word to check
	* @return boolean
	*/
	public boolean isAnagramO(String word,String anagram) {
		char[] charWord = word.toCharArray();
		char[] charAnangram = anagram.toCharArray();
		Arrays.sort(charWord);
		Arrays.sort(charAnangram);
		return Arrays.equals(charWord,charAnangram);
	}
	
	/**
	* Anagram Two 
	* @param word words needs to check
	* @param anagram anagram word to check
	* @return boolean
	*/
	public boolean isAnagramT(String word,String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}

		char[] charWord = word.toCharArray();
		
		StringBuilder stringBuilder = new StringBuilder(anagram);
		for (char c : charWord) {
			int index = stringBuilder.indexOf("" + c);
			if (index != -1) {
				stringBuilder.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return stringBuilder.length() == 0 ? true : false;
	}
	
	/********************************************************************************/
	/********************** First Non Repeating Character ****************************/
	/********************************************************************************/
	
	/**
	* Non Repeating character
	*
	* @return char
	*/
	public char getFirstNonRepeatingCharacter(String string) {
		Map<Character,Integer> counts = new LinkedHashMap<>(string.length());
		for(char c:string.toCharArray()){
			counts.put(c,counts.containsKey(c) ? counts.get(c) + 1:1);
		}
		for (Map.Entry<Character,Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException(string +" does not have non Repeating char");
	}
	
	public char getFirstNonRepeatingCharacterO(String string) {
		Set<Character> repeatinCharacters = new HashSet<>();
		List<Character> nonReapetingCharacters = new ArrayList<>();
		for (char c:string.toCharArray()) {
			if (repeatinCharacters.contains(c)) {
				continue;
			}
			if (nonReapetingCharacters.contains(c)) {
				nonReapetingCharacters.remove(c);
				repeatinCharacters.add(c);
			} else {
			    nonReapetingCharacters.add(c);
			}
		}
		return nonReapetingCharacters.get(0);
	}

}
