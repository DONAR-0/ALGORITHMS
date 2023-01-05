package aw.some;

import java.util.ArrayList;

/**
 * String subsequence
 * TC: O(n.2^n)
 * SC: O(n.2^n)
 *
 */
public class Scenario53 {
    public static void getSubSequences(String str, int i, String subsequence, ArrayList<String> subSequences) {
       if (i == str.length()) {
           subSequences.add(subsequence);
       } else {
           getSubSequences(str,i+1,subsequence+str.charAt(i),subSequences);
           getSubSequences(str,i+1,subsequence,subSequences);
       }
    }

    public static ArrayList<String> getSubsequences(String str) {
        ArrayList<String> subSequences = new ArrayList<>();
        getSubSequences(str,0,"",subSequences);
        return subSequences;
    }
}
