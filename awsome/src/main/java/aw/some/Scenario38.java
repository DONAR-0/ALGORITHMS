package aw.some;

/**
 * Given a non-empty array of integers arr, create a function that returns the index of peak element.
 * We consider an element as peak if it's greater than neighbors, the next and previous element,
 * and the first element have at most one neighbor only.And if there are multiple peaks in arr, just return
 * the index of one of them.
 *
 */
public class Scenario38 {

    /**
     * By Traversing the whole array
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param arr array of int
     * @return peak
     */
    public static int findPeak(int[] arr){
        for (int i = 0; i < arr.length;i++){
            if ((i == 0 || arr[i] >= arr[i - 1]) && ( i == arr.length - 1 || arr[i] >= arr[i + 1])) {
                return i;
            }
        }
        return  -1;
    }

    /**
     * By Using divide and Conquer(iteratively)
     * Time Complexity: O(logn)
     * Space Complexity: O(1)
     *
     * @return peak
     */
    public static int findPeak_1(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    /**
     * By Using divide and Conquer (recursively)
     * Time Complexity: O(logn)
     * Space Complexity: O(1)
     */
    public static int findPeak_2(int[] arr,int left,int right){
        if (left >= right) return left;
        int mid = (left + right)/2;
        if (arr[mid] < arr[mid + 1]){
            return findPeak_2(arr,mid+1,right);
        } else {
            return findPeak_2(arr,left,mid);
        }
    }
    static int findPeak_rec(int[] arr) {
        return findPeak_2(arr,0,arr.length - 1);
    }
}
