package aw.some;

/**
 * Scenario73: Shortest Palindrome
 *
 */
public class Scenario73 {

	//Brute Force Solution
	//Time Complexity: O(n2)
	//Space Complexity: O(1)
	public static String shortestPalindrome_1(String string) {
		int mirrorLength = 0;
		for (int i = 0; i < string.length(); i++) {
			if(string.substring(0,i).equals(new StringBuilder(string.substring(0,i)).reverse().toString())){
				mirrorLength = i;
			}
		}
		return new StringBuilder(string.substring(mirrorLength)).reverse() + string;
	}


	public static String shortestPalindrome_2(String str) {
		String concat = str + "#" + new StringBuilder(str).reverse();
		int[] lpsArr = getLpsArr(concat);
		int mirrorLength = lpsArr[lpsArr.length - 1];
		return new StringBuilder(str.substring(mirrorLength)).reverse() + str;
	}

	public static int[] getLpsArr(String string) {
		int[] lpsArr = new int[string.length()];
		int length = 0;
		int i = 1;
		while(i < string.length()) {
			if(string.charAt(i) == string.charAt(length)){
				lpsArr[i++] = ++length;
			} else if(length > 0) {
				length = lpsArr[length - 1];
			} else {
				lpsArr[i++] = 0;
			}

		}
		return lpsArr;
	}

}
