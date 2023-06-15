package v_4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string str made of alphabetical letter only
 * create a function that returns the length of longest substring
 * without repeating character
 *
 */
public class Sc_8 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sc_8.class);

    public static boolean withoutRepeating(String str) {
        boolean[] visited = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            if (visited[(int) str.charAt(i)]) return false;
            else visited[str.charAt(i)] = true;
        }
        return true;
    }

    /**
     * Brute Force Approach
     * TC: O(n3)
     * SC: O(1)
     *
     * @param str
     * @return
     */
    public static int longestSubStringWithoutRepeating(String str) {
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String subStr = str.substring(i,j + 1);
                if (withoutRepeating(subStr) && subStr.length() > maxLength) {
                    maxLength = subStr.length();
                }
            }
        }
        return maxLength;
    }

    public static int longestSubStringWithoutRepeating_2(String str) {
        int maxLength = 0;
        int start = 0;
        int[] indexes = new int[128];
        for (int i: indexes) i = -1;
        for (int i = 0; i < str.length(); i++) {
            if (indexes[str.charAt(i)] >= start) {
                start = indexes[str.charAt(i)] + 1;
            }
            indexes[str.charAt(i)] = i;
            maxLength = Math.max(maxLength,i - start + 1);
        }
        return maxLength;
    }

    public static int longestSubStringWithoutRepeating_3(String str) {
        int maxLength = 0;
        int start = 0;
        List<Integer> indexes = new ArrayList<>(128);
        for (int i = 0;i < 128;i++) {
            indexes.add(i,-1);
        }
        for (int i = 0;i < str.length();i ++) {
            if (indexes.get(str.charAt(i)) >= start) {
                start = indexes.get(str.charAt(i)) + 1;
            }
            indexes.set(str.charAt(i),i);
            maxLength = Math.max(maxLength,i - start + 1);
        }
        return maxLength;
    }


    public static int longestSubStringWithoutRepeating_4(String str){
       int maxLength = 0;
       int start = 0;
       int[] indexes = new int[128];
       for (int i : indexes) i = -1;
       for (int i = 0;i < str.length();i ++) {
           if (indexes[str.charAt(i)] >= start) {
               start = indexes[str.charAt(i)] + 1;
           }
           indexes[str.charAt(i)] = i;
           maxLength = Math.max(maxLength,i - start + 1);
       }
       return maxLength;
    }
    public static void main(String[] args) {
        LOGGER.info("{}",longestSubStringWithoutRepeating("abcdbeghef"));
        LOGGER.info("{}",longestSubStringWithoutRepeating_2("abcdbeghef"));
        LOGGER.info("{}",longestSubStringWithoutRepeating_3("abcdbeghef"));
    }
}
