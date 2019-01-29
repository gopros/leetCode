package code41;


import java.util.Arrays;

class Solution {

    public int firstMissingPositive(int[] nums) {

        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<=nums.length&&nums[i]>0){
                a[nums[i]-1] = 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (a[i]==0){
                return i+1;
            }
        }

        return nums.length+1;

    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {3,1,2};
        System.out.println(s.firstMissingPositive(a));


    }



}
