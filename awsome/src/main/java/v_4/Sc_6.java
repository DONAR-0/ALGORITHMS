package v_4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Given an array of integers arr, create a function that returns the sum of the sub array tha has greatest
 * sum of the sub array and arr is not empty.
 */
public class Sc_6 {

    private static final Logger LOG = LoggerFactory.getLogger(Sc_6.class);
    /**
     * Brute Force Solution
     * Time Complexity: O(n3)
     * SPC: O(1)
     * @param arr
     * @return
     */
    public static int maximumSumArray_1(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int actualSUm = 0;
                for (int k = i ; k <= j; k++) {
                    actualSUm = actualSUm + arr[k];
                }
                maxSum = Math.max(maxSum,actualSUm);
            }
        }
        return maxSum;
    }

    public static int maximumSumArray_2(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
                int actualSUm = 0;
            for (int j = i; j < arr.length; j++) {
                    actualSUm = actualSUm + arr[j];
                maxSum = Math.max(maxSum,actualSUm);
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

    public static void main(String[] args) {
        int arr[]  = new int[] { 1, 3, 5,12, 13, 15, 16, 19, 7, 9, -12 ,-2,-31 };
        LOG.info("{}",maximumSumArray_1(arr));
        LOG.info("{}",maximumSumArray_2(arr));
        LOG.info("{}",maximumSumSubArray_3(arr));
    }

}
