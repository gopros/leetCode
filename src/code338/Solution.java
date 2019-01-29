package code338;


class Solution {

    public int[] countBits(int num) {

        int[] dp = new int[num+1];
        dp[0]=0;

        for (int i = 1; i < num + 1; i++) {
            if (i%2==0) dp[i] = dp[i/2];
            else dp[i] = dp[i/2]+1;
        }

        return dp;

    }

    public static void main(String[] args) {

        Solution s = new Solution();


    }



}
