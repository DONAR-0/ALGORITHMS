package aw.some;


/**
 * Scenario75
 */
public class Scenario75 {

	// Time Complexity: O(n*m*4^|word|)
	// Space Complexity: O(n*m + |word|)
	//
	public static boolean outOfBoard(char[][] board,int i,int j){
		int n = board.length;
		int m = board[0].length;
		return i < 0 || i >= n || j < 0 || j >= m;
	}

	public static boolean searchWord(char[][] board,String word,int i,int j,int counter,boolean[][] visited) {

		if(counter == word.length()) {
			return true;
		} else if(outOfBoard(board, i, j) || visited[i][j] || board[i][j] != word.charAt(counter)) {
			return false;
		} else {
			visited[i][j] = true;
			if(searchWord(board, word, i+1, j, counter+1, visited) || searchWord(board, word, i, j+1, counter+1, visited) || searchWord(board, word, i-1, j, counter+1, visited) || searchWord(board, word, i, j-1, counter+1, visited)){
				return true;
			} else {
				visited[i][j] = false;
				return false;
			}
		}
	}

	public static boolean exist(char[][] board,String word) {
		int n = board.length;
		int m = board[0].length;
		boolean[][] visited = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (searchWord(board, word, i, j, 0, visited)) {
					return true;
				}
			}
		}
		return false;
	}

}
