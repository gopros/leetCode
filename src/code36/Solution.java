package code36;


import java.util.HashMap;
import java.util.Map;

class Solution {

    public boolean isValidSudoku(char[][] board) {

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('1',0);
        map.put('2',0);
        map.put('3',0);
        map.put('4',0);
        map.put('5',0);
        map.put('6',0);
        map.put('7',0);
        map.put('8',0);
        map.put('9',0);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                HashMap<Character,Integer> m = new HashMap<>();
                m = (HashMap<Character, Integer>) (map).clone();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[i*3+k][j*3+l]=='.'){
                            continue;
                        }
                        if (m.get(board[i*3+k][j*3+l])==0){
                            m.put((board[i*3+k][j*3+l]),1);
                        }else{
                            return false;
                        }
                    }
                }

            }
        }

        for (int i = 0; i < 9; i++) {
            HashMap<Character,Integer> m = new HashMap<>();
            m = (HashMap<Character, Integer>) (map).clone();
            for (int j = 0; j < 9; j++) {
                if (board[i][j]=='.'){
                    continue;
                }
                if (m.get(board[i][j])==0){
                    m.put((board[i][j]),1);
                }else{
                    return false;
                }
            }

            HashMap<Character,Integer> n = new HashMap<>();
            n = (HashMap<Character, Integer>) (map).clone();
            for (int j = 0; j < 9; j++) {
                if (board[j][i]=='.'){
                    continue;
                }
                if (n.get(board[j][i])==0){
                    n.put((board[j][i]),1);
                }else{
                    return false;
                }
            }
        }



        return true;
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

        char[][] b = {a1,a2,a3,a4,a5,a6,a7,a8,a9};

        System.out.println(s.isValidSudoku(b));


    }



}
