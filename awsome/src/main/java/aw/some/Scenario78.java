package aw.some;

import java.util.ArrayList;

/**
 * Scenario78
 */
public class Scenario78 {

	//By Using recursion
	//Time Complexity: O(2^n)
	//Space Complexity: O(n)
	public static int lis_1(int[] arr,int i,int previous) {
		if (i == arr.length) {
			return 0;
		}
		else if(arr[i] <= previous) {
			return lis_1(arr, i+ 1, previous);
		}
		else {
			return Math.max(1 + lis_1(arr, i+1 ,arr[i]),lis_1(arr, i + 1, previous));
		}
	}

	public static int lis_1(int[] arr) {
		return lis_1(arr,0,Integer.MIN_VALUE);
	}

	//By using dynamic programming
	//Time Complexity: o(n^2)
	//Space Complexity: O(n)
	public static int lis_2(int[] arr){
		if(arr.length < 2) return arr.length;
		int[] dp = new int[arr.length];
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			int maxPreviousLength = 0;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					maxPreviousLength = Math.max(maxPreviousLength, dp[j]);
				}
			}
			dp[i] = maxPreviousLength  + 1;
			maxLength = Math.max(maxLength,dp[i]);
		}
		return maxLength;
	}


	// By Using dynamic programming + Binary Search
	// Time Complexity: O(nlogn)
	// Space Complexity: O(n)
	public static int ceilIndex(ArrayList<Integer> arr,int num) {
		int left = 0;
		int right = arr.size() - 1;
		while (left < right - 1) {
			int mid = (left + right)/2;
			if(num == arr.get(mid)) {
				return mid;
			} else if (num < arr.get(mid)) {
				right = mid;
			} else {
				left = mid;
			}
		}
		return right;
	}

	public static int list_3(int[] arr) {
		if (arr.length < 2) {
			return arr.length;
		}
		ArrayList<Integer> subSeq = new ArrayList<>();
		subSeq.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= subSeq.get(0)) {
				subSeq.set(0, arr[i]);
			} else if (arr[i] > subSeq.get(subSeq.size() - 1)) {
				subSeq.add(arr[i]);
			} else {
				subSeq.set(ceilIndex(subSeq, arr[i]), arr[i]);
			}
		}
		return subSeq.size();
	}
}











