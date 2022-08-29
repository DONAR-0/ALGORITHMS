package aw.some;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import lombok.val;

/**
* Scenario17
* Valid Parantheses
*/
public class Scenario17 {

	/**
	* Parantheses is the program
	*
	* */
	public boolean isValid(String s) {
		Map<Character,Character> characterCharacterMap = new HashMap<>();
		characterCharacterMap.put('(', ')');
		characterCharacterMap.put('[', ']');
		characterCharacterMap.put('{', '}');

		if (s.length() % 2 != 0) {
			return false;
		} else {
			for (int i = 0; i < s.length(); i = i + 2) {
				char key = s.charAt(i);
				char value = s.charAt(i+1);
				if(characterCharacterMap.get(key) == value) {
					continue;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isValidOne(String s) {
		char bracket[] = new char[s.length()];
		int counter = 0;
		for(int x = 0; x < s.length();x++) {
			char a = s.charAt(x);
			if (a == '(') {
				bracket[counter++] = ')';
			} else if(a == '{') {
				bracket[counter++] = '}';

			} else if( a == '['){
				bracket[counter++] = ']';
			}
			else {
				-- counter;
				if (counter < 0) {
					return false;
				}
				if (bracket[counter] != a) {
					return false;
				}
			}
		}
		if (counter > 0) {
			return false;
		}
		return true;
	}
	
}
