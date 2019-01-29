package code37;


import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public boolean isValidSudoku(char[][] board,int i,int j) {


        for (int k = 0; k < 9; k++) {
            if (k!=j&&board[i][j]==board[i][k]) return false;
        }
        for (int k = 0; k < 9; k++) {
            if (k!=i&&board[i][j]==board[k][j]) return false;
        }

        for (int k = i/3*3; k < i/3*3+3; k++) {
            for (int l = j/3*3; l < j/3*3+3; l++) {
                if ((i!=k||j!=l)&&board[i][j]==board[k][l]) return false;
            }
        }


        return true;
    }

    public void solveSudoku(char[][] board) {
        if (board.length==0||board.length>9){
            return;
        }else {
            DFS(board,0,0);
        }

    }

    public boolean DFS(char[][] board,int i,int j){

        if (i==9) {

            return true;
        }
        if (j>=9) {
            return DFS(board,i+1,0);
        }
        if (board[i][j]=='.'){
            for (int k = 0; k <9; k++) {
                board[i][j] = (char)(k+49);
                if (isValidSudoku(board,i,j)){
                    if (DFS(board,i,j+1)) return true;
                }
                board[i][j]='.';
            }
        }else {
            return DFS(board,i,j+1);
        }

        return false;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        char[] a1 = new char[]{'5','3','.','.','7','.','.','.','.'};
        char[] a2 = new char[]{'6','.','.','1','9','5','.','.','.'};
        char[] a3 = new char[]{'.','9','8','.','.','.','.','6','.'};
        char[] a4 = new char[]{'8','.','.','.','6','.','.','.','3'};
        char[] a5 = new char[]{'4','.','.','8','.','3','.','.','1'};
        char[] a6 = new char[]{'7','.','.','.','2','.','.','.','6'};
        char[] a7 = new char[]{'.','6','.','.','.','.','2','8','.'};
        char[] a8 = new char[]{'.','.','.','4','1','9','.','.','5'};
        char[] a9 = new char[]{'.','.','.','.','8','.','.','7','9'};

        char[][] b = new char[][]{a1,a2,a3,a4,a5,a6,a7,a8,a9};


        s.solveSudoku(b);

        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(b[i]));
        }


    }



}
