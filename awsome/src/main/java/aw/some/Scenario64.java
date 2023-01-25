package aw.some;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Longest Common subsequence between two string
 */
public class Scenario64 {

    /**
     * Brute Force solution
     * TC: O((n+m).2^n)
     * SC: O(n.2^n)
     */
    public static boolean isSubSequence(String string1,String string2) {
        int ptr1 = 0,ptr2 = 0;
        while (ptr1 < string1.length() && ptr2 < string2.length()) {
            if (string1.charAt(ptr1) == string2.charAt(ptr2)) {
                ptr1 ++;
                ptr2 ++;
            } else {
                ptr1 ++;
            }
        }
        return ptr2 == string2.length();
    }

    public static void getSubsequences(String str, int i, String subsequence, ArrayList<String> subsequences){
        if (i == str.length()) {
            subsequences.add(subsequence);
        } else {
            getSubsequences(str, i + 1,subsequence + str.charAt(i), subsequences);
            getSubsequences(str, i + 1,subsequence, subsequences);
        }
    }

    public static ArrayList<String> getSubsequences(String str) {
        ArrayList<String> subsequences = new ArrayList<>();
        getSubsequences(str,0,"",subsequences);
        return subsequences;
    }

    public static int lcs_1(String str1,String str2) {
        int maxLength = 0;
        ArrayList<String> subsequences = getSubsequences(str1);
        for (String subsequence: subsequences) {
            if (isSubSequence(str2,subsequence) && subsequence.length() > maxLength) {
                maxLength = subsequence.length();
            }
        }
        return maxLength;
    }

    /**
     * Recursive solution:
     * Time Complexity: O(2^(m+n))
     * Space Complexity: O(n + m)
     *
     */
    public static int lcs_2(String str1,String str2,int i,int j) {
        if (i == str1.length() || j == str2.length()) {
            return 0;
        }
        else if (str1.charAt(i) == str2.charAt(j)) {
            return 1 + lcs_2(str1,str2,i + 1,j +1);
        } else {
            return Math.max(lcs_2(str1, str2, i + 1, j),lcs_2(str1, str2, i, j + 1));
        }
    }

    public static int lcs_2(String str1,String str2) {
        return lcs_2(str1,str2,0,0);
    }

    // Time-optimized recursive solution(memoization):
    // Time Complexity: O(nm)
    // Space Complexity: O(nm)
    public static int lcs_3(String str1, String str2, int i, int j, HashMap<String,Integer> memoiz) {
        String key = i + " " + j;
        if(memoiz.containsKey(key)) {
            return memoiz.get(key);
        } else if (i == str1.length() || j == str2.length()) {
            return 0;
        }
        return i;
    }
}
