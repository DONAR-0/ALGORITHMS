package aw.some;

import java.util.Arrays;
import java.util.Set;

/**
 * Scenario74
 */
public class Scenario74 {

	//By Using recursion
	//Time Complexity: O(m^n)
	//Space Complexity: O(n)
	public static int coinChangeRec(int amount,Set<Integer> coins) {
		if (amount == 0) {
			return 0;
		}
		int minCoins = Integer.MAX_VALUE;
		for (Integer coin:coins) {
			if ((amount - coin) >= 0) {
				int recursiveResult = coinChangeRec(amount - coin, coins);
				if (recursiveResult != Integer.MAX_VALUE) {
					minCoins = Math.min(minCoins,1 + recursiveResult);
				}
			}
		}
		return minCoins;
	}

	public static int coinChange(int amount,Set<Integer> coins) {
		int minCoins = coinChangeRec(amount, coins);
		return minCoins == Integer.MAX_VALUE ? - 1 : minCoins;

	}

	//By Using dynamic programming
	//Time Complexity: O(nm)
	//Space Complexity: O(n)
	public static int coinChange_2(int amount,Set<Integer> coins) {
		int[] nbCoinsArr = new int[amount + 1];
		Arrays.fill(nbCoinsArr, Integer.MAX_VALUE);
		nbCoinsArr[0] = 0;
		for (int i = 1; i < amount + 1; i++) {
			int minCoins = Integer.MAX_VALUE;
			for (Integer coin: coins) {
				if((i - coin) >= 0) {
					if(nbCoinsArr[i - coin] != Integer.MAX_VALUE) {
						minCoins = Math.min(minCoins, 1 + nbCoinsArr[i - coin]);
					}
				}
			}
			nbCoinsArr[i] = minCoins;
		}
		return nbCoinsArr[amount] == Integer.MAX_VALUE ? -1 : nbCoinsArr[amount];
	}
}
