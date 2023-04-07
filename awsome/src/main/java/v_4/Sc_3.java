package v_4;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;

@Slf4j
public class Sc_3 {

    /**
     * TC: O(n^2)
     * SPC: O(n)
     */
    public static int[] removeDuplicates(int[] arr) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int element : arr) {
            if (!integerArrayList.contains(element)) {
                integerArrayList.add(element);
            }
        }
        int[] noDuplicatesArr = new int[integerArrayList.size()];
        for (int i = 0; i < noDuplicatesArr.length; i++) {
            noDuplicatesArr[i] = integerArrayList.get(i);
        }
        return noDuplicatesArr;
    }

    public static int[] removeDuplicates_2(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        Arrays.sort(arr);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                integerArrayList.add(arr[i]);
            }
        }
        int[] noDuplicatesArr = new int[integerArrayList.size()];
        for (int i = 0; i < noDuplicatesArr.length; i++) {
            noDuplicatesArr[i] = integerArrayList.get(i);
        }
        return noDuplicatesArr;
    }

    public static void main(String[] args) {
        log.info("{}", removeDuplicates(new int[]{1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1}));
        log.info("{}", removeDuplicates_2(new int[]{1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1}));
    }
}
