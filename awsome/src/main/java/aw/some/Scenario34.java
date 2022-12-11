package aw.some;

import java.lang.reflect.Member;

/**
 * Given an array of integers arr, create a function tha returns the sum
 * of the sub array that has greatest sum of the subarray.
 * and array is not empty
 *
 */
public class Scenario34 {

    /**
     * Brute force solution
     * Time complexity: O(n3)
     * SPC: O(1)
     *
     * @param arr
     * @return
     */
    public static int maximumSubArray_1(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                int actualSum = 0;
                for (int k = i; k <= j; k++) {
                    actualSum = actualSum + arr[k];
                }
                maxSum = Math.max(maxSum, actualSum);
            }
        }
        return maxSum;
    }

    /**
     * Cummlative array
     * TC: O(n2)
     * SPC: O(1)
     *
     * @param arr
     * @return
     */
    public static int maximumSumSubArray_2(int[] arr) {
      int maxSum = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++){
          int cummulativeSum = 0;
          for (int j = i; j < arr.length; j++) {
              cummulativeSum = cummulativeSum + arr[j];
              maxSum = Math.max(maxSum, cummulativeSum);
          }
      }
      return maxSum;
    }

    /**
     * Kadane 's algorithm
     * TC: O(n)
     * SPC: O(1)
     *
     * @param arr
     * @return
     */
    public static int maximumSumSubArray_3(int[] arr) {
        int globalSum = Integer.MIN_VALUE;
        int localSum = 0;
        for (int el: arr) {
           localSum = Math.max(el, localSum + el);
           globalSum = Math.max(globalSum, localSum);
        }
        return globalSum;
    }
}