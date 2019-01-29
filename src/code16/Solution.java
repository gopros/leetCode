package code16;

import java.util.Arrays;

public class Solution {

    public int threeSumClosest(int[] nums, int target) {


        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (Math.abs(target-nums[i]-nums[j]-nums[k])<min){
                        min = Math.abs(target-nums[i]-nums[j]-nums[k]);
                        result = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }

        return result;


    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {-1,2,1,-4};
        System.out.println(s.threeSumClosest(a,1));
    }

}
