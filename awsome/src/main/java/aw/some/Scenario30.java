package aw.some;

import java.util.HashMap;

/***
 * First Repeating Character
 */
public class Scenario30 {

    /**
     * This is brute force solution
     * TC : O(n2)
     * SPC : O(1)
     * @param str
     * @return
     */
   public static char firstRepeatingCharacter(String str) {
       for (int i = 0; i < str.length(); i++) {
           for (int j = 0; j < i;j++) {
               if (str.charAt(i) == str.charAt(j)) {
                   return str.charAt(i);
               }
           }
       }
       return '\0';
   }

    /**
     * TC: O(n)
     * SC: O(n)
     *
     * @param str
     * @return
     */
   public static char firstRepeatingCharacter_2(String str) {

       HashMap<Character,Boolean> visited = new HashMap<>();
       char[] characters = str.toCharArray();
       for (char ch:characters) {
           if (visited.containsKey(ch)) return ch;
           else visited.put(ch,true);
       }
       return '\0';
   }
}
