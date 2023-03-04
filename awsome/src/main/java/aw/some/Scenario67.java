package aw.some;

import java.util.ArrayList;
import java.util.List;

/**
* Scenario67: Longest Common Substring
*/
public class Scenario67 {
	
	// Brute Force Solution:
	// Time Complexity: O(mn2)
	// Space Complexity: O(1)
	//
	public static int lcs_1(String str1,String str2){
		int maxLen = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j < str1.length() + 1; j++) {
				if(str2.contains(str1.substring(i,j))){
					maxLen = Math.max(maxLen, j - i );
				}
			}
		}
		return maxLen;
	}
	
	//By Using recurssion
	//TC: O(3^(n+m))
	//SC: O(n + m)
	//
	public static int lcs_2(String str1,String str2,int i,int j){
		if(i == str1.length() || j == str2.length())
			return 0;
		else if(str1.charAt(i) == str2.charAt(j)) {
			return Math.max(1 + lcs_2(str1, str2,i + 1,j + 1), Math.max(lcs_2(str1, str2, i+ 1, j), lcs_2(str1, str2, i, j + 1)));
		}
		else {
			return Math.max(lcs_2(str1, str2,i+1,j), lcs_2(str1, str2, i, j+ 1));
		}
	}

	public static int lcs_2(String str1,String str2) {
		return lcs_2(str1, str2,0,0);
	}

	// By Using Dynamic Programming:
	// TC: O(nm)
	// SC: O(nm)
	//
	public static int lcs_3(String str1,String str2) {
		int n = str1.length();
		int m = str2.length();
		int[][] dp = new int[n+1][m+1];
		int maxLength = 0;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
					maxLength = Math.max(maxLength, dp[i][j]);
				} else {
					dp[i][j] = 0;
				}	
			}	
		}
		return maxLength;
	}

	//By Using a suffix tree:
	//TC: O(n + m)
	//SC: O((n + m)^2)
	//
	public static int getLcsFromSuffixTree(SuffixTree suffixTree) {
		if(!suffixTree.hasSuffixFromStr1 || !suffixTree.hasSuffixFromStr2) {
			return 0;
		} else {
			int maxFromChild = 0;
			for (SuffixTree child: suffixTree.children) {
				maxFromChild = Math.max(maxFromChild,getLcsFromSuffixTree(child));
			}
			return suffixTree.text.length() + maxFromChild;
		}
	}

	static int lcs_4(String str1, String str2) {
	   String concantation = str1 + '*' + str2 + '$';
	   SuffixTree suffixTree = new SuffixTree(concantation);
	   return getLcsFromSuffixTree(suffixTree);
	}

	static class SuffixTree {
		
		boolean hasSuffixFromStr1;
		boolean hasSuffixFromStr2;
		String text;
		List<SuffixTree> children = new ArrayList<SuffixTree>();
		public SuffixTree(String concantation) {
			
		}
	}
}
