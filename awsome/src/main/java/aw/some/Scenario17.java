package aw.some;

import java.util.Stack;

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
		Stack<Character> stackCharacter = new Stack<>();
		if (s.length() % 2 != 0) {
			return false;
		} else {
			for (int i = 0; i < s.length(); i = i + 2) {
				System.out.println(s.charAt(i)+" "+i);
			}
		}
		return false;
	}
	
}
