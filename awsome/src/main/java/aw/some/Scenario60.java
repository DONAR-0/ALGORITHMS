package aw.some;

import java.util.HashMap;

/**
 * Subset that sums upto k
 */
public class Scenario60 {

    public static int subsetThatSumsUptoK_1(int[] arr, int k, int i, int sum) {
        if (sum == k) {
            return 1;
        } else if (sum > k || i >= arr.length) {
            return 0;
        } else
            return subsetThatSumsUptoK_1(arr, k, i + 1, sum + arr[i]) + subsetThatSumsUptoK_1(arr, k, i + 1, sum);
    }

    /**
     * By Using recursion
     * TC: O( 2 ^n )
     * SC: O(n)
     *
     * @param arr array
     * @param k   value add upto
     * @return int value
     */
    public static int subsetThatSumsUptoK_1(int[] arr, int k) {
        return subsetThatSumsUptoK_1(arr, k, 0, 0);
    }

    /**
     * By Using recursion + memoization
     * Time Complexity: O(nk)
     * Space Complexity: O(nk)
     *
     */
    public static int subsetsThatSumsUptoK_2(int[] arr, int k, int i, int sum, HashMap<String,Integer> memoiz) {
        String key = i + " " + sum;
        if (memoiz.containsKey(key)) {
            return memoiz.get(key);
        } else if (sum == k) {
            return 1;
        } else if (sum > k || i >= arr.length) {
            return 0;
        } else {
            int nbSubsets = subsetsThatSumsUptoK_2(arr,k,i+1,sum + arr[i],memoiz) + subsetsThatSumsUptoK_2(arr,k,i+1,sum,memoiz);
            memoiz.put(key,nbSubsets);
            return nbSubsets;
        }
    }

    public static int subsetsThatSumsUptoK_2(int[] arr,int k) {
        HashMap<String,Integer> memoiz = new HashMap<>();
        return subsetsThatSumsUptoK_2(arr,k,0,0,memoiz);
    }

}
