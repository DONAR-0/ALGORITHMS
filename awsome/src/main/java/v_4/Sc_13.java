package v_4;

public class Sc_13 {

    /**
     * Brute Force Solution
     * Time Complexity: O(nm)
     * Space Complexity: O(1)
     *
     * @param str1
     * @param str2
     * @return
     */
    public static int substringIndex(String str1,String str2) {
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

    public static void main(String[] args) {
        System.out.println(substringIndex("hellomynameis","myname"));
    }
}
