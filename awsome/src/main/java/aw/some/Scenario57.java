package aw.some;

/**
 * Scenario57
 * Circular array minimum problem
 */
public class Scenario57 {

  // By Using divide and conquer(iteratively):
  //  Time Complexity: O(logn)
  //  Space Complexity: O(1)
  public static int minimum(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    if (arr[right] > arr[left])
      return arr[left];
    while (left < right) {
      int mid = (left + right) / 2;
      if (arr[mid + 1] < arr[mid])
        return arr[mid + 1];
      else if (arr[mid] < arr[mid - 1])
        return arr[mid];
      else if (arr[mid] > arr[right])
        left = mid + 1;
      else
        right = mid - 1;
    }
    return arr[left];
  }

  /**
   * By Traversing the whole Array
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   *
   * */
  public static int minimum_2(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int value : arr) {
      min = Math.min(min, value);
    }
    return min;
  }

  /**
  * TC: O(log n)
  * SC: O(1)
  *
  * @param arr
  * @param left
  * @param right
  * @return
  */
  public static int minimum_3(int[] arr, int left, int right) {
    if (left >= right || arr[right] > arr[left])
      return arr[left];
    int mid = (left + right) / 2;
    if (arr[mid + 1] < arr[mid])
      return arr[mid + 1];
    else if (arr[mid] < arr[mid - 1])
      return arr[mid];
    else if (arr[mid] > arr[right])
      return minimum_3(arr, mid + 1, right);
    else
      return minimum_3(arr, left, mid - 1);
  }

  public static int minimum_3(int[] arr) {
    return minimum_3(arr, 0, arr.length - 1);
  }
}
