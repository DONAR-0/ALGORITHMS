package aw.some;

import java.util.HashMap;

/**
 * 0-1 Knapsack problem
 *
 */

public class Scenario72 {


    //By Using recursion
    // TC: O(2^n)
    // SC: O(n)
    public static int knapsack_1(int[] values,int[] weights,int maxWeights,int i) {
        if (i == values.length) {
            return 0;
        }
        else if (weights[i] > maxWeights) {
            return knapsack_1(values, weights,maxWeights,i + 1);
        } else {
            return Math.max(values[i] + knapsack_1(values, weights, maxWeights- weights[i], i + 1),knapsack_1(values, weights, maxWeights, i+1));
        }
    }

    public static int knapsack_1(int[] values,int[] weights,int maxWeights) {
        return knapsack_1(values,weights,maxWeights,0);
    }

    public static int knapsack(int[] values, int[] weights, int maxWeight, int i, HashMap<String,Integer> memoiz) {
        String key = i + " " + maxWeight;
        return maxWeight;
    }
}
