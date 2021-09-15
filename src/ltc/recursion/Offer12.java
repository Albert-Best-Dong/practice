package ltc.recursion;

public class Offer12 {
    boolean res = false;
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                backtrak(board, word, i, j, 0);

            }
        }
        return res;

    }

    public boolean backtrak(char[][] board,String word, int i, int j,int index) {
        if(index==word.length()-1) {

            return true;
        }
        if(i==board.length||j==board[0].length||i<0||j<0) return false;


        if (board[i][j] == word.charAt(index)) {
            board[i][j] = '0';
            index = index + 1;

        }else board[i][j] = '0';

        if(i+1<board.length && board[i+1][j]==word.charAt(index))
            backtrak(board,word,++i,j,index);

        if(j+1 < board[i].length && board[i][j+1]==word.charAt(index))
            backtrak(board,word,i,++j,index);

        if(i>0&&board[i-1][j]==word.charAt(index)) backtrak(board, word, --i, j, index);

        if(j>0&&board[i][j-1]==word.charAt(index)) backtrak(board, word, i, --j, index);

//        res = backtrak(board, word, ++i, j, index)
//                || backtrak(board, word, i, ++j, index)
//                || backtrak(board, word, --i, j, index)
//                || backtrak(board, word, i, --j, index);

        board[i][j] = word.charAt(index);

        return res;


    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(new Offer12().exist(board,"ABCCED"));
        System.out.println(new Offer12().exist(new char[][]{{'a'}},"b"));
        System.out.println(new Offer12().exist(new char[][]{{'a','b'},{'c','d'}},"dbca"));

    }
}
