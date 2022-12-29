package aw.some;

/**
 * Get Sub String index
 */

/**
 * Time Complexity:
 */
public class Scenario41 {

    /**
     * Brute Force Solution
     * Time complexity: O(nm)
     * space complexity: O(1)
     *
     * @param str1
     * @param str2
     * @return
     */
    public static int substrIndex(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        for (int i = 0; i <= n - m; i++) {
            boolean found = true;
            for (int j = 0; j < m; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) return i;
        }
        return -1;
    }


    /************************************************************************************/
    /**                        KMP Algorithm                                           **/
    /*************************************************************************************/
    /**
     * Time Complexity: O(n)
     * Space Complexity: O (m)
     *
     * @param str
     * @return
     */
    public static int[] getLpsArr(String str) {
        int[] lspArr = new int[str.length()];
        int length = 0;
        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(length)) {
                lspArr[i++] = ++length;
            } else if (length > 0) {
                length = lspArr[length - 1];
            } else {
                lspArr[i++] = 0;
            }
        }
        return lspArr;
    }

    public static int subStrIndex(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        if (m > n) return -1;
        if (m == n) return str2.equals(str1) ? 0 : -1;
        if (str2.equals("")) return 0;
        int[] lpsArr = getLpsArr(str2);
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i ++;
                j++;
            } else if (j > 0) {
                j = lpsArr[j - 1];
            } else {
                i++;
            }
        }
        return j < m ? -1 : i - j;
    }
}
