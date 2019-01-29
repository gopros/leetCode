package code289;


import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public void gameOfLife(int[][] board) {

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int count = 0;
                for (int k = -1; k <=1; k++) {
                    for (int l = -1; l <=1 ; l++) {
                        if (i+k<0||i+k>=board.length||j+l<0||j+l>=board[0].length||(k==0&&l==0)) continue;
                        if (board[i+k][j+l]==1) count++;
                    }
                }
                if ((count>3||count<=1)&&board[i][j]==1) {
                    List<Integer> l = new ArrayList<>();
                    l.add(i);l.add(j);
                    list.add(l);
                }
                if (count==3&&board[i][j]==0){
                    List<Integer> l = new ArrayList<>();
                    l.add(i);l.add(j);
                    list.add(l);
                }
            }
        }

        for (List<Integer> l:list) {
            int i = l.get(0);
            int j = l.get(1);
            if (board[i][j]==0) board[i][j]=1;
            else board[i][j] = 0;
        }



    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        s.gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }


    }



}
