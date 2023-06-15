package aw.some;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scenario36 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario36.class);
    public static boolean withoutRepeating(String str) {
        boolean[] visited = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            if (visited[(int) str.charAt(i)]) return false;
            else visited[str.charAt(i)] = true;
        }
        return true;
    }

    /**
     * Brute force approach
     * Time Complexity: O(n2)
     * Space Complexity: O(1)
     *
     * @param str
     * @return
     */
    public static int longestSubStringWithoutRepeating(String str){
        int maxLength = 0;
        for (int i = 0; i < str.length();i++){
            for (int j = i; j < str.length(); j++){
                String subStr = str.substring(i,j+1);
                if (withoutRepeating(subStr) && subStr.length() > maxLength){
                    maxLength = subStr.length();
                }
            }
        }
        return maxLength;
    }

    /**
     * TC: O(n)
     * SPC: O(1)
     * @param str
     * @return
     */
    public static int longestSubStringWithoutRepeating_2(String str){
       int maxLength = 0;
       int start = 0;
       int[] indexes = new int[128];
       for (int i : indexes) i = -1;
       for (int i = 0; i < str.length(); i++) {
           if (indexes[str.charAt(i)] >= start) {
               start = indexes[str.charAt(i)] + 1;
           }
           indexes[str.charAt(i)] = i;
           maxLength = Math.max(maxLength, i - start + 1);
       }
       return maxLength;
    }
}