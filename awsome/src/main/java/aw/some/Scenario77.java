package aw.some;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Scenario77
 */
public class Scenario77 {

	// By representing words as a grpah:
	// Time Complexity: O(mn^2)
	// Space Complexity: O(mn^2)
	public static int difference(String word1,String word2) {

		int counter = 0;
		for (int i = 0; i < word1.length(); i++) {
			if(word1.charAt(i) != word2.charAt(i)) counter ++;
		}
		return counter;
	}

	public static int transformationSequenceLength(String beginWord,String endWord,ArrayList<String> wordList) {
		if (wordList.size() == 0 || !wordList.contains(endWord)) {
			return 0;
		}
		HashMap<String,HashSet<String>> adjList = new HashMap<>();
		for (String word : wordList) {
			adjList.put(word, new HashSet<>());
		}
		for (int i = 0; i < wordList.size(); i++) {
			for (int j = i+1; j < wordList.size(); j++) {
				if (difference(wordList.get(i),wordList.get(j)) == 1) {
					adjList.get(wordList.get(i)).add(wordList.get(j));
					adjList.get(wordList.get(j)).add(wordList.get(i));
				}
			}
		}
		Set<String> visited = new HashSet<>();
		ArrayList<Object[]> queue = new ArrayList<>();
		int i = 0;
		for (String word: wordList) {
			if (difference(beginWord, word) == 1) {
				queue.add(new Object[]{word,1});
				visited.add(word);
			}
		}

		while(i < queue.size()) {
			String word = (String) queue.get(i)[0];
			Integer level = (Integer) queue.get(i)[1];
			i++;
			if (word.equals(endWord)) {
				return level + 1;
			} else {
				for (String transformation: adjList.get(word)) {
					if (!visited.contains(transformation)) {
						queue.add(new Object[]{transformation,level + 1});
						visited.add(transformation);
					}
				}
			}
		}
		return 0;
	}

	//By generating common forms:
	//Time Complexity: O(nm2)
	//Space Complexity: O(nm2)
	//
	public static int transformationSequenceLength_2(String beginWord,String endWord,ArrayList<String> wordList) {

		if (wordList.size() == 0 || !wordList.contains(endWord)) {
			return 0;
		}
		int lenWord = wordList.get(0).length();
		HashMap<String,ArrayList<String>> forms = new HashMap<>();
		for(String word: wordList) {
			for (int i = 0; i < lenWord; i++) {
				String form= word.substring(0,i) + "*" + word.substring(i + 1);
				if (!forms.containsKey(form)) {
					forms.put(form, new ArrayList<String>());
				}
				forms.get(form).add(word);
			}
		}
		Set<String> visited = new HashSet<>();
		ArrayList<Object[]> queue = new ArrayList<>();
		queue.add(new Object[]{beginWord, 0});
		int i = 0;
		while(i < queue.size()) {
			String word = (String) queue.get(i)[0];
			Integer level = (Integer) queue.get(i)[1];
			i++;
			if(word.equals(endWord)) {
				return level + 1;
			} else {
				for (int j = 0; j < lenWord; j++) {
					String form = word.substring(0, j) + "*" + word.substring(j + 1);
					if(forms.containsKey(form)) {
						for(String tx: forms.get(form)) {
							if (!visited.contains(tx)) {
								queue.add(new Object[]{tx,level + 1});
								visited.add(tx);
							}
						}
					}
				}
			}
		}
		return 0;
	}

}














































