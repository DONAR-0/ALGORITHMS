package aw.some;

/**
* Scenario15
* Shuffle Value in Object[] array
*
*/
public class Scenario15 {

	public void shuffle(int[] a) {
		// Choose index uniformly int [0, n -1]
		int n = a.length;
		for (int j = 0; j < a.length; j++) {
			int r = j + (int) (Math.random() * (n - j));
			int swap = a[r];
			a[r] = a[j];
			a[j] = swap;
		}
	}
}
