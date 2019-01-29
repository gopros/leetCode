package code59;


import java.util.Arrays;

class Solution {


    public int[][] generateMatrix(int n) {

        int top=0,bottom = n-1,left=0,right=n-1,current = 1,i=0,j=0;
        int[][] res =  new int[n][n];

        if (n==0) return res;

        while (true){
            if (current>n*n) break;

            while (j<=right) res[i][j++] = current++;

            top++;
            i = top;
            j = right;
            if (current>n*n) break;

            while (i<=bottom) res[i++][j] = current++;
            right--;
            i=bottom;
            j=right;
            if (current>n*n) break;

            while (j>=left) res[i][j--] = current++;

            bottom--;
            i = bottom;
            j = left;
            if (current>n*n) break;

            while (i>=top) res[i--][j] = current++;

            left++;
            i=top;
            j=left;


        }

        return res;



    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[][] a = s.generateMatrix(4);

        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }


    }



}
