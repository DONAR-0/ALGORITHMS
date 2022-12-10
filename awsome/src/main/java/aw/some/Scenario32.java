package aw.some;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Finding duplicates
 *
 */
public class Scenario32 {

    /**
     * Brute Force Solution
     * TC: O(n2)
     * SPC: O(1)
     *
      * @param arr
     * @return
     */
    public static int findDuplicates(int[] arr) {
      for (int i = 0; i < arr.length;i++) {
          for (int j = i+1; j < arr.length;j++){
              if (arr[i] == arr[j]) return arr[j];
          }
      }
      return 0;
    }

    /**
     * Finding duplicates by sorting the array
     *
     * TC: O(nlogn)
     * SPC: O(1)
     *
     * @param arr
     * @return
     */
    public static int findDuplicates_2(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i - 1])
                return arr[i];
        }
        return 0;
    }

    /**
     * Finding duplicates by using the dictionary
     *
     * TC: O(n)
     * SPC: O(n)
     *
     * @param arr
     * @return
     */
    public static int findDuplicates_3(int[] arr){
        HashMap<Integer,Boolean> visited = new HashMap<>();
        for (int element: arr) {
            if (visited.containsKey(element)) return element;
            else visited.put(element,true);
        }
        return 0;
    }


    /**
     *  By using Floyd's cycle detection algorithm (tortoise and hare):
     *  TC: O(n)
     *  SPC: O(1)
     */
    public static int findDuplicate(int[] arr){
        int hare = 0, tortoise = 0;
        do{
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
        }while(tortoise != hare);
        tortoise = 0;
        while(tortoise != hare){
            tortoise = arr[tortoise];
            hare = arr[hare];
        }
        return tortoise;
    }
}
