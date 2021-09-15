package ltc.dsf;

public class LeetCode79 {
    boolean[][] visited;
    boolean flag = false;
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];
        backtrack(board, word.toCharArray(), 0, 0, 0);
        return flag;
    }

    public void backtrack(char[][] board, char[] word,int index,int i,int j) {

        if(index==word.length) return;
        if(i<0||j<0||i>=board.length||j>=board[i].length) return;
        for (int k = 0; k < word.length; k++) {
            if (!visited[i][j]) {
                if (board[i][j] == word[k]) {
                    visited[i][j] = true;
                    index = index + 1;

                }
            }

            backtrack(board, word, index, ++i, j);
            backtrack(board, word, index, i, ++j);
            backtrack(board, word, index, i, --j);
            backtrack(board, word, index, --i, j);
            visited[i][j] = false;
        }
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(new LeetCode79().exist(board, "ABCCED"));
    }
}
