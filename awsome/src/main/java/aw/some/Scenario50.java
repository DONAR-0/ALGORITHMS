package aw.some;

/**
 *
 *
 */
public class Scenario50 {
    /**
     * By Using recursion
     * Time Complexity: O(2 ^n)
     * Space Complexity: O(n)
     *
      */
    public static boolean canJump(int[] arr,int i) {
        if (i == arr.length - 1) return true;
        for (int j = 1; j <=arr[i]; j++) {
           if (canJump(arr,i + j)) return true;
        }
        return false;
    }

    public static boolean canJump(int[] arr) {
        return canJump(arr,0);
    }

    /**
     * By Using dynamic programming
     * Time Complexity: O(n2)
     * Space Complexity: O(n)
     * @param arr
     * @return
     */
    public static boolean canJump_2(int[] arr) {
       int n = arr.length;
       boolean[] dp = new boolean[n];
       dp[0] = true;
        for (int i = 0; i < n; i++) {
           if (!dp[i]) return false;
           else if (i + arr[i] >= n - 1) return true;
           else {
               for (int j = 1; j <= arr[i]; j++) {
                  dp[i+j] = true;
               }
           }
        }
        return dp[n - 1];
    }

    //By Keeping track of the max index that we can reach:
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     */
    public static boolean canJump_3(int[] arr) {
        int n = arr.length;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i > maxIndex) return false;
            else maxIndex = Math.max(maxIndex,i + arr[i]);
        }
        return maxIndex >= n - 1;
    }
}