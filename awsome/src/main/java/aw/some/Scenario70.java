package aw.some;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Merging the scenarios
 *
 */
public class Scenario70 {

    public static int[][] mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = Math.max(intervals[i][1],intervals[i + 1][1]);
                intervals[i] = new int[0];
            }
        }
        ArrayList<int[]> output = new ArrayList<>(Arrays.asList(intervals));
        return output.toArray(new int[output.size()][2]);
    }
}
