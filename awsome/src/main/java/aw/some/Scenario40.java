package aw.some;

/**
 * Longest Palindrome
 *
 */
public class Scenario40 {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param str String
     * @return number of possible values
     */
    public static int longestPalindrome(String str) {
        int[] occurrences = new int[128];
        for (char letter: str.toCharArray()) {
            occurrences[(int) letter]++;
        }
        int length = 0;
        for (int occu: occurrences) {
            length += occu % 2 == 0 ? occu : occu - 1;
        }
        if (length < str.length()) length++;
        return length;
    }
}
