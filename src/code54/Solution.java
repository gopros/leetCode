package code54;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {


        List<Integer> list = new ArrayList<>();

        if (matrix.length==0) return list;

        int i=0,j=0,top=0,right=matrix[0].length-1,bottom = matrix.length-1,left = 0;
        while (true){
            if (list.size()==matrix.length*matrix[0].length) break;
            i = top;
            j = left;
            while (j<=right) list.add(matrix[i][j++]);

            if (list.size()==matrix.length*matrix[0].length) break;
            top++;
            i=top;
            j=right;
            while (i<=bottom) list.add(matrix[i++][j]);

            if (list.size()==matrix.length*matrix[0].length) break;

            right--;
            i=bottom;
            j=right;
            while (j>=left) list.add(matrix[i][j--]);

            if (list.size()==matrix.length*matrix[0].length) break;

            bottom--;
            i=bottom;
            j=left;

            while (i>=top) list.add(matrix[i--][j]);
            left++;






        }

        return list;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {5, 6, 7, 8};
        int[] a3 = {9,10,11,12};
        int[] a4 = {13,14,15,16};

        int[][] matrix = {a1,a2,a3};

        List<Integer> list = s.spiralOrder(matrix);

        System.out.println(Arrays.toString(list.toArray()));


    }



}
