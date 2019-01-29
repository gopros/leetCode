package code152;


class Solution {


    public int maxProduct(int[] nums) {
        int[] dp = new int[nums.length];
        int[] sq = new int[nums.length];
        dp[0] = nums[0];
        sq[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sq[i] = Math.min(nums[i],Math.min(sq[i-1]*nums[i],dp[i-1]*nums[i]));
            dp[i] = Math.max(nums[i],Math.max(sq[i-1]*nums[i],dp[i-1]*nums[i]));
            max = Math.max(max,dp[i]);
        }
        return max;



    }

    public static void main(String[] args) {

        Solution s = new Solution();
        s.maxProduct(new int[]{2,3,-2,4});


    }



}
