package v_4;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Finding duplicates
 */

@Slf4j
public class Sc_4 {

    /**
     * Brute Force Solutions
     * TC: O(n^2)
     * SPC: O(1)
     *
     * @param arr
     * @return
     */
    public static int findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return arr[j];
            }
        }
        return 0;
    }

    /**
     * Finding duplicates by sorting the array
     * TC: O(nlogn)
     * SPC: O(1)
     *
     * @param arr
     * @return
     */
    public static int findDuplicates_2(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
