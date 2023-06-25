package v_4;

/**
 * Longest Palindrome
 *
 */
public class Sc_12 {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param str String
     * @return length of longest palindrome
     */
    public static int longestPalindrome(String str) {
        int[] occurrences = new int[128];
        for (char letter: str.toCharArray()) {
            occurrences[(int)letter]++;
        }
        int length = 0;
        for (int occu: occurrences) {
            length += occu % 2 == 0 ? occu : occu - 1;
        }
        if (length < str.length()) length ++;
        return length;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("peakaep"));
        System.out.println(longestPalindrome("peakaepboo"));

    }
}