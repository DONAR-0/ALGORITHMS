package aw.some;

/**
 * Subset that sums upto k
 */
public class Scenario60 {

    public static int subsetThatSumsUptoK(int[] arr,int k,int i,int sum) {
        if (sum== k) {
            return 1;
        } else if (sum > k || i >= arr.length) {
            return 0;
        } else
            return subsetThatSumsUptoK(arr, k, i + 1, sum + arr[i]) + subsetThatSumsUptoK(arr,k,i + 1,sum);
    }

    /**
     * By Using recursion
     * TC: O( 2 ^n)
     * SC: O(n)
     *
     * @param arr array
     * @param k value add upto
     * @return int value
     */
    public static int subsetThatSumsUptoK(int[] arr,int k) {
        return subsetThatSumsUptoK(arr,k,0,0);
    }
}
