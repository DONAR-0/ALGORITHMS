package aw.some;

import java.util.*;

/**
 * Scenario13
 * Find All permutation of given array
 */
public class Scenario13 {

    private static int lenght;

    public <T> List<ArrayList<T>> combinations(T[] array, int number) {
        if (number == 0) {
            return Collections.emptyList();
        }
        lenght = number;
        T[] arr = array.clone();
        Arrays.sort(arr);
        List<ArrayList<T>> result = new LinkedList<>();
        backTracking(array, 0, new ArrayList<T>(), result);
        return result;
    }

    private <T> void backTracking(T[] array, int i, ArrayList<T> arrayList, List<ArrayList<T>> result) {
        if (i + lenght - arrayList.size() > array.length) {
            return;
        }
        if (lenght - 1 == arrayList.size()) {
            for (int j = i; j < array.length; j++) {
                arrayList.add(array[i]);
                result.add((ArrayList<T>) arrayList.clone());
                arrayList.remove(array[i]);
            }
        }

        for (int j = i; j < array.length; j++) {
            arrayList.add(array[i]);
            backTracking(array, i + 1, arrayList, result);
            arrayList.remove(array[j]);
        }
    }
}