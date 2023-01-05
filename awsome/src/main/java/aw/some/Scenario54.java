package aw.some;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Scenario54 {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario54.class);


    /**
     * TC: O(n)
     * SC: O(n)
     *
     * @param str string values
     * @return boolean
     */
    public static boolean isValid(String str){
        HashMap<Character,Character> bracketsMap = new HashMap<>();
        bracketsMap.put('(',')');
        bracketsMap.put('[',']');
        bracketsMap.put('{','}');
        List<Character> openingBrackets = Arrays.asList('(','{','[');
        Stack<Character> stack = new Stack<>();
        for (char ch: str.toCharArray()) {

        }
    }
}
