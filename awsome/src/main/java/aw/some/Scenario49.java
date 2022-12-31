package aw.some;

/**
 * Array of values in provided array is multiply of every element except itself
 * and do not use the / operator
 * for example:
 * [2,3,4,5]
 * output
 * [60,40,30,24]
 *
 */
public class Scenario49 {

    //Brute force Solution:
    // Time Complexity: O(n2)
    // Space Complexity: O(n)

    public static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                else product *= arr[j];
            }
            output[i] = product;
        }
        return output;
    }

    public static int[] productExceptSelf_2(int[] arr) {
        int n = arr.length;
        int[] cumulativeFromLeft = new int[n];
        cumulativeFromLeft[0] = 1;
        for (int i = 1;i < n;i++) {
            cumulativeFromLeft[i] = cumulativeFromLeft[i - 1] * arr[i - 1];
        }
        int[] cumulativeFromRight = new int[n];
        cumulativeFromRight[n -1] = 1;
        for (int i = n- 2; i >= 0 ; i--) {
            cumulativeFromRight[i] = cumulativeFromRight[i + 1] * arr[i + 1];
        }
        int[] output = new int[n];
        for (int i = 0;i < n; i++) {
            output[i] = cumulativeFromLeft[i] * cumulativeFromRight[i];
        }
        return output;
    }
}
