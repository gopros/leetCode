package code42;


class Solution {


    public int trap(int[] height) {

        if (height.length<=2) return 0;

        int[] dp = new int[height.length];
        int sum=0;

        dp[0] = 0;

        for (int i = 1; i < dp.length; i++) {
            if (dp[i-1]>=height[i-1]){
                dp[i] = dp[i-1];
            }else {
                dp[i] = height[i-1];
            }
        }
        dp[height.length-1] = 0;
        for (int i = height.length-2; i >=0; i--) {
            if (dp[i+1]>=height[i+1]){
                dp[i] = Math.min(dp[i+1],dp[i]);
            }else {
                dp[i] = Math.min(height[i+1],dp[i]);
            }

            if (height[i]<dp[i]){
                sum+=dp[i]-height[i];
            }
        }





        return sum;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a ={4,2,2,4};

        System.out.println(s.trap(a));


    }



}
