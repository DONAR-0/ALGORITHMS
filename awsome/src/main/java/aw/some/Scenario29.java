package aw.some;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Find Pair
 */
public class Scenario29 {

    /**
     * Find Pair
     * By Checking all the pair
     * Time Complexity: O(n2)
     * Space Complexity : O(1)
     *
     * @param arr
     * @param k
     * @return
     */
    public static boolean findPair(int[] arr,int k){
        for (int i = 0; i < arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) return true;
            }
        }
        return false;
    }


    /**
     * By Sorting the array
     * Time Complexity: O(nlogn)
     * SPC: O(1)
     * @return
     */
    public static boolean findPair2(int[] arr,int k){
        Arrays.sort(arr);
        int left = 0, right = arr.length -1;
        while (left < right) {
            if (arr[left] + arr[right] == k) return true;
            else if (arr[left] + arr[left] < k) left ++;
            else  right --;
        }
        return false;
    }

    /**
     * By Using the map
     * Time Complexity : O(n)
     * Space Complexity: O(n)
     * @param arr
     * @param k
     * @return
     */
    public static boolean findPair3(int[] arr,int k){
        HashMap<Integer,Boolean> visited = new HashMap<>();
        for (int element:arr) {
            if (visited.containsKey(k - element)) return true;
            else visited.put(element,true);
        }
        return false;
    }

}
