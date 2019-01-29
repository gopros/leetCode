package code221;


import java.util.Arrays;

class Solution {

    public int maximalSquare(char[][] matrix) {

        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]=='1'){
                    if (max<1) max = 1;
                    int k = 1;
                    int flag = 1;
                    while (i+k<matrix.length&&j+k<matrix[i].length){
                        for (int l = 0; l <=k; l++) {
                            if (matrix[i+l][j+k]!='1'){
                                flag=0;
                                break;
                            }
                            if (matrix[i+k][j+l]!='1'){
                                flag = 0;
                                break;
                            }
                        }

                        if (flag==0){
                            if (max<k) max = k;
                            break;
                        }else {
                            if (max<k+1) max = k+1;
                            k++;
                        }

                    }

                }
            }
        }


        return max;
    }

    public int maximalSquare1(char[][] matrix){

        if (matrix.length==0) return 0;


        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i==0||j==0){
                    dp[i][j] = matrix[i][j] - '0';
                }else {
                    if (matrix[i][j]=='0'){
                        dp[i][j] = 0;
                    }else {
                        dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                    }
                }


            }
        }

        int max = 0;

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (dp[i][j]>max) max = dp[i][j];
                System.out.println(dp[i][j]);
            }
        }

        return max;

    }



    public static void main(String[] args) {

        Solution s = new Solution();


        char[][] matrix = {{'1','0','1','1','0'},{'1','1','1','1','1'},{'1','1','0','1','1'},{'1','1','0','1','1'}};

        System.out.println(s.maximalSquare1(matrix));

    }



}
