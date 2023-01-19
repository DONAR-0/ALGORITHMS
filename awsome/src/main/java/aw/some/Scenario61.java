package aw.some;

/**
 * Given a string str made of digits, create a function that returns with how many ways
 * we can decode it,knowing that 1 is decoded as the letter 1 is decoded as the letter A,
 * 2 is decoded as the letter B, and so on until 26 that is decoded as letter Z.
 * input = "22"
 * can be typed K and AA so output would be 2
 */
public class Scenario61 {

	//By Using the recursion:
	//Time Complexity: O(2 ^ n)
	//Space Complexity: O(n)
	public static int waysToDecode_1(String str,int i){
		int n = str.length();
		if (n == 0 || (i < n && str.charAt(i) == '0')) {
			return 0;
		} else if (i >= n - 1) {
			return 1;
		} else if (Integer.parseInt("" + str.charAt(i) + str.charAt(i + 1)) >= 10 && Integer.parseInt("" + str.charAt(i) + str.charAt(i+ 1)) <= 26) {
			return waysToDecode_1(str, i + 1) + waysToDecode_1(str, i + 2);
		}
		return waysToDecode_1(str, i + 1);
	}
	
	/**
	* Ways to decode prblem
	* @param str String value to decode
	* @return return gives the value best
	*/
	public static int waysToDecode_1(String str){
		return waysToDecode_1(str, 0);
	}




}
