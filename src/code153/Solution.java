package code153;


class Solution {

    public int findMin(int[] nums) {

        int left = 0,right = nums.length-1;
        int mid = (left+right)/2,res = 0;

        while (mid!=left){
            if (nums[mid]<nums[left]){
                right = mid;
            }else if (nums[mid]>nums[right]){
                left = mid;
            }else {
                return nums[left];
            }
            mid = (left+right)/2;
        }

        res = nums[left]>nums[right]?nums[right]:nums[left];

        return res;

    }

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.findMin(new int[]{1,2}));


    }



}
