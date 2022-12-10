package aw.some;

import java.util.ArrayList;
import java.util.Arrays;

public class Scenario31 {

    /**
     * Brute Force Solution
     * TC: O(n2)
     * SPC: O(n)
     *
     * @param arr
     * @return
     */
    public static int[] removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int element : arr) {
            if (!list.contains(element)) {
                list.add(element);
            }
        }
        int[] noDuplicatesArr = new int[list.size()];
        for (int i = 0; i < noDuplicatesArr.length; i++) {
            noDuplicatesArr[i] = list.get(i);
        }
        return noDuplicatesArr;
    }

   public static int[] removeDuplicates_2(int[] arr) {
       if (arr.length == 0) {
           int[] emptyArr = new int[0];
           return emptyArr;
       }
       Arrays.sort(arr);
      ArrayList<Integer> list = new ArrayList<>();
      list.add(arr[0]);
       for (int i = 1; i < arr.length; i++) {
          if (arr[i] != arr[i - 1]) {
              list.add(arr[i]);
          }
       }
       int[] noDuplicatesArr = new int[list.size()];
       for (int i = 0;i < noDuplicatesArr.length;i++){
           noDuplicatesArr[i] = list.get(i);
       }
       return noDuplicatesArr;
   }
}
