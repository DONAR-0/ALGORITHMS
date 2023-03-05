package aw.some;

/**
 * Edit Distance
 *
 */
public class Scenario66 {

    // By Using recursion
    // Time Complexity: O(3^(n+m))
    // Space Complexity: O(n + m)

    public static int minDistance(String word1,String word2,int i,int j) {
        if (i == word1.length()) {
            return word2.length() - j;
        } else if (j == word2.length()) {
            return word1.length() - i;
        } else if (word1.charAt(i) == word2.charAt(j)) {
            return minDistance(word1,word2,i + 1,j + 1);
        } else {
            return 1 + Math.min(minDistance(word1,word2,i + 1,j),Math.min(minDistance(word1, word2, i, j+ 1),minDistance(word1, word2, i + 1, j + 1)));
        }
    }

    public static int minDistance(String word1,String word2) {
        return minDistance(word1, word2,0,0);
    }

    // By using dynamic programming:
    // Time Complexity: O(nm)
    // Space Complexity: O(nm)
    public static int minDistance_2(String word1,String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < m + 1; i++) {
            dp[0][i] = i;
        }
        for (int i = 0;i < n + 1;i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i < n+1;i ++ ) {
            for (int j = 1;j < m+1;j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],Math.min(dp[i][j - 1],dp[i - 1][j - 1]));
                }
            }
        }
        return dp[n][m];
    }
}
