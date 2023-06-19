package v_4;

/**
 * Given a non-empty array of integers arr, create a function that returns the index of the peak element.
 * We consider an element as peak if it is greater than neighbors, the next and previous element and the first
 * element have at the most one neighbor only. And if there are multiple peaks in arr, just return the index of one of them.
 */
public class Sc_10 {

    /**
     * By Traversing the whole array
     * <p>
     * Time complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param arr
     * @return
     */
    public static int findPeak(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] >= arr[i - 1]) && (i == arr.length - 1 || arr[i] >= arr[i + 1])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * By Using divide and conquer(iteratively)
     * TC: O(logn)
     * SC: O(1)
     *
     * @param arr
     * @return
     */
    public static int findPeak_1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static int findPeak_2(int[] arr,int left,int right) {
       if (left >= right) return left;
       int mid = (left + right) / 2;
       if (arr[mid] < arr[mid + 1]) {
           return findPeak_2(arr,mid + 1, right);
       } else {
           return findPeak_2(arr,left,mid);
       }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 5, 8, 8, 3, 9};
        System.out.println(findPeak(arr));
        System.out.println(findPeak_1(arr));
    }
}
