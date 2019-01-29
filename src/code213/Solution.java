package code213;


class Solution {

    public int rob(int[] nums) {

        int a = rob2(nums);

        if (nums.length<=1) return a;

        int[] dp1 = new int[nums.length-1];
        int[] dp2 = new int[nums.length-1];

        for (int i = 0,j=1; i < nums.length-1&&j<nums.length ; i++,j++) {
            dp1[i] = nums[i];
            dp2[i] = nums[j];
        }

        int b = rob2(dp1);
        int c= rob2(dp2);

        if (a==b||a==c){
            return a;
        }else {
            return Math.max(b,c);
        }


    }


    public int rob2(int[] nums) {

        if (nums.length==0) return 0;
        else if(nums.length==1) return nums[0];

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }


        return dp[dp.length-1];
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] a = {2,3,2};

        System.out.println(s.rob(a));


    }



}
