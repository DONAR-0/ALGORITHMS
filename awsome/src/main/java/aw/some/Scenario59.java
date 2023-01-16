package aw.some;

import java.util.Set;

/**
 * Given a staircase of n steps and a set of possible steps that we can climb at a time
 * name possibleSteps, create a function that returns the number of ways that a person
 * take to reach the top of the staircase
 *
 */
public class Scenario59 {
    //By Using recursion
    // Time Complexity: O(m^n)
    // Space Complexity: O(n)

    public static int waysToClimb(int n, Set<Integer> possibleSteps) {
        if (n == 0) return 1;
        int nbWays = 0;
        for (Integer steps : possibleSteps) {
            if ((n - steps) >= 0) {
                nbWays += waysToClimb(n - steps, possibleSteps);
            }
        }
        return nbWays;
    }

    //By Using dynamic programming
    // Time complexity: O(n*m)
    // Space Complexity: O(n)
    public static int waysToClimb_2(int n,Set<Integer> possibleSteps) {
        int[] nbWaysArray = new int[n + 1];
        nbWaysArray[0] = 1;
        for (int i = 1; i < n + 1;i++) {
            int nbWays = 0;
            for (Integer steps: possibleSteps) {
                if ((i - steps) >= 0) {
                    nbWays += nbWaysArray[i - steps];
                }
            }
            nbWaysArray[i] = nbWays;
        }
        return nbWaysArray[n];
    }
}