package aw.some;

import java.util.*;

/**
 * Scenario13
 * Binary search in sorted integer List
 *
 */
public class Scenario13 {

	public int indexOf(int[] a,int key) {
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if (key < a[mid]) {
				hi = mid - 1;
			} else if(key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
