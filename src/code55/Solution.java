package code55;


class Solution {


    public boolean canJump(int[] nums) {

        if (nums.length<=1) return true;

        return DFS(nums,0);

    }

    public boolean canJump2(int[] nums) {

        if (nums.length<=1) return true;

        int[] dp = new int[nums.length];
        if (nums[0]==0) return false;
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i-1]==1&&nums[i]==0) return false;
            else dp[i] = Math.max(dp[i-1]-1,nums[i]);
        }

        return true;


    }

    public boolean DFS(int[] nums,int i){

        if (i>=nums.length) return true;

        for (int j = 1; j <= nums[i]; j++) {
            if (DFS(nums,i+j)) return true;
        }
        return false;

    }



    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a= {3,2,0,1,0};
        System.out.println(s.canJump2(a));


    }



}
