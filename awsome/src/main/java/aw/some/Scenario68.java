package aw.some;

import java.util.Collections;
import java.util.Stack;
/**
* Scenario68
* smallert Number removing k digits
*/
public class Scenario68 {

	public static String smallestAfterRemoving(String num, int k) {
		if(k >= num.length()) return "0";
		Stack<Character> stack = new Stack<>();
		for(char digit : num.toCharArray()) {
			while(!stack.isEmpty() && digit < stack.peek() && k > 0) {
				stack.pop();
				k--;
			}
		  stack.push(digit);
		}
		while(k-- > 0) stack.pop();
		Collections.reverse(stack);
		while(stack.size() > 0 && stack.peek() == '0') stack.pop();
		Collections.reverse(stack);
		return !stack.isEmpty() ? stack.toString().replaceAll("[^\\d]","") : "0";
		// stack.toString() returns the stack as "[1, 2, 3]" for example, so we used
		// [^\\d] regular expression to remove all non-numerical Characters
	}
}
