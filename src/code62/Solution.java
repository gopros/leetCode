package code62;


import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {


    public int uniquePaths(int m, int n) {

        if (m<=1||n<=1){
            return 1;
        }

        int[][] dp = new int[n][m];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length;j++){
                if (i==0||j==0){
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }



        return dp[n-1][m-1];
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.uniquePaths(0,1));


    }



}
