package aw.some;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Scenario65 {

    /**
     * Brute Force solution
     * Time Complexity: O(n2)
     * Space Complexity: O(1)
     *
     * @param arr
     * @param searchedValue
     * @return
     */
    public static boolean contains(int[] arr,int searchedValue) {
        for (int value: arr) {
            if (value == searchedValue) return true;
        }
        return false;
    }

    public static int longestConsecutiveSequence_1(int[] arr) {
        if (arr.length < 2) return arr.length;
        int maxLength = 1;
        for (int element: arr) {
            int left = element;
            while (contains(arr,left - 1)) left--;
            int right = element;
            while (contains(arr,right + 1)) right++;
            maxLength = Math.max(maxLength,right - left + 1);
        }
        return maxLength;
    }


    /**
     * By Sorting the array
     * TC: O(nlogn)
     * SC: O(1)
     * if we are allowed to modify the input.
     * O(n) else
     * @param arr
     * @return
     */
    public static int longestConsecutiveSequence_2(int[] arr) {
        if (arr.length < 2) return arr.length;
        Arrays.sort(arr);
        int maxLength = 1;
        int length = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) length++;
            else if (arr[i] == arr[i - 1]) {}
            else length = 1;
            maxLength = Math.max(maxLength,length);
        }
        return maxLength;
    }

    /**
     * Optimized brute force solution:
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * @param arr array of integer
     * @return length of the program
     */
    public static int longestConsecutiveSequence_3(int[] arr) {
        if (arr.length < 2) return arr.length;
        int maxLength = 1;
        Set<Integer> values = new HashSet<>();
        for (int element: arr) values.add(element);
        for (int element: values) {
            if (values.contains(element - 1)) continue;
            else {
                int right = element;
                while (values.contains(right + 1)) right++;
                maxLength = Math.max(maxLength, right - element + 1);
            }
        }
        return maxLength;
    }
}
