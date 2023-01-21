package aw.some;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Array Permutation
 */
public class Scenario63 {

    /**
     * By using recursion
     * Time Complexity: O(n.n!)
     * Space Complexity: O(n.n!)
     *
     * @param arr
     * @return
     */
    public static ArrayList<ArrayList<Integer>> getPermutation_1(ArrayList<Integer> arr) {
        if (arr.size() < 2) return new ArrayList<ArrayList<Integer>>(Arrays.asList(arr));
        else {
            ArrayList<ArrayList<Integer>> permutations = new ArrayList<>();
            for (int i = 0; i < arr.size(); i++) {
                if (!arr.subList(0, i).contains(arr.get(i))) {
                    ArrayList<Integer> remaining = (ArrayList<Integer>) arr.clone();
                    remaining.remove(i);
                    ArrayList<ArrayList<Integer>> remainingPermutation = getPermutation_1(remaining);
                    for (ArrayList<Integer> permutation: remainingPermutation) {
                        ArrayList<Integer> concataentation= new ArrayList<>();
                        concataentation.add(arr.get(i));
                        concataentation.addAll(permutation);
                        permutations.add(concataentation);
                    }
                }
            }
            return permutations;
        }
    }

    //By Always getting the next permutation
    // Time Complexity: O(n.n!)
    // Space Complexity: O(n.n!)
    public static ArrayList<Integer> getNextGreaterPermutation(ArrayList<Integer> arrayList){
        int i = arrayList.size() - 2;
        while (i >= 0 && arrayList.get(i) >= arrayList.get(i + 1)) i--;
        if (i == -1) return arrayList;
        int j = arrayList.size() - 1;
        while (arrayList.get(j) <= arrayList.get(i)) j--;
        Collections.swap(arrayList,i,j);
        int left = i + 1;
        int right = arrayList.size() - 1;
        while (left < right) {
            Collections.swap(arrayList,left ++ ,right --);
        }
        return arrayList;
    }

    /**
     * By Always getting the next permutation:
     * Time Complexity: O(n.n!)
     * Space Complexity: O(n.n!)
     *
     * @param arrayList
     * @return
     */
    public static ArrayList<ArrayList<Integer>> getPermutation_2(ArrayList<Integer> arrayList) {
        if (arrayList.size() < 2) return new ArrayList<ArrayList<Integer>>(Arrays.asList(arrayList));
        Collections.sort(arrayList);
        ArrayList<ArrayList<Integer>> permutations = new ArrayList<>();
        permutations.add((ArrayList<Integer>) arrayList.clone());
        ArrayList<Integer> greatestPermutation = (ArrayList<Integer>) arrayList.clone();
        Collections.reverse(greatestPermutation);
        while (!arrayList.equals(greatestPermutation)) {
            arrayList = getNextGreaterPermutation(arrayList);
            permutations.add((ArrayList<Integer>) arrayList.clone());
        }
        return  permutations;
    }
}
