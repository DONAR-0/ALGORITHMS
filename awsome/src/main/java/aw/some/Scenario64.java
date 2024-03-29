package aw.some;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Longest Common subsequence between two string
 */
public class Scenario64 {

    /**
     * Brute Force solution
     * TC: O((n+m).2^n)
     * SC: O(n.2^n)
     */
    public static boolean isSubSequence(String string1, String string2) {
        int ptr1 = 0, ptr2 = 0;
        while (ptr1 < string1.length() && ptr2 < string2.length()) {
            if (string1.charAt(ptr1) == string2.charAt(ptr2)) {
                ptr1++;
                ptr2++;
            } else {
                ptr1++;
            }
        }
        return ptr2 == string2.length();
    }

    public static void getSubsequences(String str, int i, String subsequence, ArrayList<String> subsequences) {
        if (i == str.length()) {
            subsequences.add(subsequence);
        } else {
            getSubsequences(str, i + 1, subsequence + str.charAt(i), subsequences);
            getSubsequences(str, i + 1, subsequence, subsequences);
        }
    }

    public static ArrayList<String> getSubsequences(String str) {
        ArrayList<String> subsequences = new ArrayList<>();
        getSubsequences(str, 0, "", subsequences);
        return subsequences;
    }

    public static int lcs_1(String str1, String str2) {
        int maxLength = 0;
        ArrayList<String> subsequences = getSubsequences(str1);
        for (String subsequence : subsequences) {
            if (isSubSequence(str2, subsequence) && subsequence.length() > maxLength) {
                maxLength = subsequence.length();
            }
        }
        return maxLength;
    }

    /**
     * Recursive solution:
     * Time Complexity: O(2^(m+n))
     * Space Complexity: O(n + m)
     */
    public static int lcs_2(String str1, String str2, int i, int j) {
        if (i == str1.length() || j == str2.length()) {
            return 0;
        } else if (str1.charAt(i) == str2.charAt(j)) {
            return 1 + lcs_2(str1, str2, i + 1, j + 1);
        } else {
            return Math.max(lcs_2(str1, str2, i + 1, j), lcs_2(str1, str2, i, j + 1));
        }
    }

    public static int lcs_2(String str1, String str2) {
        return lcs_2(str1, str2, 0, 0);
    }

    // Time-optimized recursive solution(memoization):
    // Time Complexity: O(nm)
    // Space Complexity: O(nm)
    public static int lcs_3(String str1, String str2, int i, int j, HashMap<String, Integer> memoiz) {
        String key = i + " " + j;
        if (memoiz.containsKey(key)) {
            return memoiz.get(key);
        } else if (i == str1.length() || j == str2.length()) {
            return 0;
        } else if (str1.charAt(i) == str2.charAt(j)) {
            return 1 + lcs_3(str1, str2, i + 1, j + 1, memoiz);
        } else {
            int output = Math.max(lcs_3(str1, str2, i + 1, j, memoiz), lcs_3(str1, str2, i, j + 1, memoiz));
            memoiz.put(key, output);
            return output;
        }
    }

    public static int lcs_3(String str1, String str2) {
        HashMap<String, Integer> memoiz = new HashMap<>();
        return lcs_3(str1, str2, 0, 0, memoiz);
    }

    /**
     * Dynamic Programming solution:
     * Time Complexity: O(nm)
     * Space Complexity: O(mn)
     *
     * @param str1
     * @param str2
     * @return
     */
    public static int lcs_4(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][ m + 1];
        for (int i = 1; i < n +1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

    public static int lcs_5(String str1,String str2) {
        int n = str1.length();
        int m = str2.length();
        int[] dp = new int[m + 1];
        int[] tempDp = new int[m + 1];
        for (int i = 1; i < n +1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    tempDp[j] = 1 + dp[j - 1];
                } else {
                    tempDp[j] = Math.max(tempDp[j - 1],dp[j]);
                }
            }
            for (int j = 1; j < m + 1; j++) {
                dp[j] = tempDp[j];
                tempDp[j] = 0;
            }
        }
        return dp[m];
    }
}
