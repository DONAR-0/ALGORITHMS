package aw.some;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/***
 * Given a string create, a function that returns the  
 * first repeating char (the first character that have seen 
 * ( The first character that we have seen before ).
 * If such a character doesn't exist, return the null 
 * */
public class Scenario27 {


	/***
	* Retrurn boolean value if character returns 
	*
	* @param string value needs to checked
	* @return true/false
	*/
	public boolean first_repeating_character(String string) {
		Set<Character> map = new HashSet<>();	
		for (Character character : string.toCharArray()) {
			if(map.contains(character)){
				return true;
			} else {
				map.add(character);
			}		
		}
		return false;
	}

	/***
	*  Time Complexity = o(n)
	*  Space Complexity = o(n)
	*
	* @param string
	* @return true/false 
	*/
	public boolean first_repeating_character_hashSet(String string) {
		var hashMap = new HashMap<Character,Boolean>();
		for (Character character: string.toCharArray()) {
			if(hashMap.getOrDefault(character, false)) {
				return true;
			} else {
				hashMap.put(character, true);
			}
		}
		return false;
	}
}
