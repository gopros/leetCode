package code73;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public void setZeroes(int[][] matrix) {

        Set<Integer> seti = new HashSet<>();
        Set<Integer> setj = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    seti.add(i);
                    setj.add(j);
                }
            }
        }

        for (int i:seti ){
            for (int j = 0; j <matrix[0].length ; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int j:setj ){
            for (int i = 0; i <matrix.length ; i++) {
                matrix[i][j] = 0;
            }
        }


    }

    public static void main(String[] args) {

        Solution s = new Solution();


    }



}
