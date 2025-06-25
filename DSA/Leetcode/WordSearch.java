/*
79. Word Search
Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example 1:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

Example 2:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true

Example 3:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false

Constraints:
m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
 */
import java.util.Scanner;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int idx, boolean[][] visited) {
        if (idx == word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
            visited[i][j] || board[i][j] != word.charAt(idx)) {
            return false;
        }

        visited[i][j] = true;

        boolean found = dfs(board, word, i + 1, j, idx + 1, visited) ||
                        dfs(board, word, i - 1, j, idx + 1, visited) ||
                        dfs(board, word, i, j + 1, idx + 1, visited) ||
                        dfs(board, word, i, j - 1, idx + 1, visited);

        visited[i][j] = false; // backtrack

        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        sc.nextLine(); // consume the newline

        // Input board
        char[][] board = new char[rows][cols];
        System.out.println("Enter the board row by row (each row as a single string):");
        for (int i = 0; i < rows; i++) {
            String line = sc.nextLine().trim();
            for (int j = 0; j < cols; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        // Input word
        System.out.print("Enter the word to search: ");
        String word = sc.nextLine().trim();

        // Call solution
        WordSearch solver = new WordSearch();
        boolean result = solver.exist(board, word);
        System.out.println("Word exists in board: " + result);
    }
}
