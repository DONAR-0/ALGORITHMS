package v_4;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * First Repeating Character
 *
 */
@Slf4j
public class Sc_2 {

    /**
     * Brute Force Solution
     * TC: O(n^2)
     * SPC: O(1)
     *
     * @param string string value for finding
     * @return char character value
     */
    public static char firstRepeatingCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    return string.charAt(i);
                }
            }
        }
        return '\0';
    }

    public static char firstRepeatingCharacter_2(String string){
        HashMap<Character,Boolean> visited = new HashMap<>();
        char[] charArray = string.toCharArray();
        for (char ch: charArray) {
            if (visited.containsKey(ch)) return ch;
            else visited.put(ch,true);
        }
        return '\0';
    }


    public static void main(String[] args) {
        log.info("{}",firstRepeatingCharacter("giant everything"));
        log.info("{}",firstRepeatingCharacter_2("giant everything"));
    }
}
