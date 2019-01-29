package code48;


import java.util.Arrays;

class Solution {

    public void rotate(int[][] matrix){


        for (int i = 0; i <= matrix.length/2; i++) {
            for (int j = i; j < matrix.length-1-i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i] = matrix[matrix.length-1-i][matrix.length-1-j];
                matrix[matrix.length-1-i][matrix.length-1-j] = matrix[j][matrix.length-1-i];
                matrix[j][matrix.length-1-i] = tmp;
            }
        }


    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        int[] c = {9,10,11,12};
        int[] d = {13,14,15,16};

        int[][] matrix = {a,b,c,d};

        s.rotate(matrix);

        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }


    }



}
