package aw.some;

import java.util.*;

/**
 * Back Tracking
 *
 */
public class Scenario11 {

    public List<String> letterCombinationsBad(String digits) {
        // Now What i have is String in format of digits
        // So first things first i have to make sure String is getting converted to number
        // Once i have found the number than map and with the avleus
        // that means i have to find every combination of from two string
	
        // ==============================================================================

	// 1. formatNumber = done
        // 2. findValuesFromMap =
        // 3. findEveryCombinationFromNoOfString
        Integer value = Integer.parseInt(digits);
        char[] numbers = digits.toCharArray();
        List<String> stringsFromNumber = stringsFromNumber(numbers);
        List<String> values = findEveryCombinationFromNoOfString(stringsFromNumber);
        return values;
    }

    private List<String> findEveryCombinationFromNoOfString(List<String> stringsFromNumber) {
        //2 Strings
        List<String> result = new ArrayList<>();

        for (int i = 0; i < stringsFromNumber.get(0).length(); i++) {
            for (int j = 0; j < stringsFromNumber.get(1).length(); j++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(String.format("%s%s", stringsFromNumber.get(0).charAt(i), stringsFromNumber.get(1).charAt(j)));
                result.add(stringBuilder.toString());
            }
        }
        return result;
    }

    private List<String> stringsFromNumber(char[] numbers) {
        Map<Character,String> mapValues = new HashMap<>();
        mapValues.put('2',"abc");
        mapValues.put('3',"def");
        mapValues.put('4',"ghi");
        mapValues.put('5',"jkl");
        mapValues.put('6',"mno");
        mapValues.put('7',"pqrs");
        mapValues.put('8',"tuv");
        mapValues.put('9',"wxyz");
        List<String> values = new ArrayList<>();
        for (char c:numbers) {
            if (mapValues.containsKey(c)) {
                values.add(mapValues.get(c));
            }
        }
        return values;
    }

    //=======================Im===========================================//

    public List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        if (digits== null||digits.isEmpty()) {
            return result;
        }
        backTrack(result,new StringBuilder(),digits,0,getMap());
        return result;
    }

    private void backTrack(List<String> result, StringBuilder stringBuilder, String digits, int start,Map<Character, List<Character>> map) {
        if (stringBuilder.length() == digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }
        char current = digits.charAt(start);
        for (char c:map.get(current)) {
            stringBuilder.append(c);
            backTrack(result,stringBuilder,digits,start+1,map);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    private Map<Character, List<Character>> getMap() {
        Map<Character,List<Character>> characterListMap = new HashMap<>();
        characterListMap.put('2', Arrays.asList('a','b','c'));
        characterListMap.put('3', Arrays.asList('d','e','f'));
        characterListMap.put('4', Arrays.asList('g','h','i'));
        characterListMap.put('5', Arrays.asList('j','k','l'));
        characterListMap.put('6', Arrays.asList('m','n','o'));
        characterListMap.put('7', Arrays.asList('p','q','r','s'));
        characterListMap.put('8', Arrays.asList('t','u','v'));
        characterListMap.put('9', Arrays.asList('w','x','y','z'));
        return characterListMap;
    }
}
