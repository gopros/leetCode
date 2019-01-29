package code75;


import java.util.Arrays;

class Solution {


    public void sortColors(int[] nums) {

        int start = 0,end = nums.length-1;

        for (int i = 0; i < nums.length&&i<=end; i++) {
            if (nums[i]==0){
                int a = nums[i];
                nums[i] = nums[start];
                nums[start] = a;
                start++;
            }else if (nums[i]==2){
                int a = nums[i];
                nums[i] = nums[end];
                nums[end] = a;
                end--;
                i--;
            }
        }

    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {1,2,0,0,2,1,2,1};
        s.sortColors(a);
        System.out.println(Arrays.toString(a));


    }



}
