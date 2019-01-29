package code81;


class Solution {

    public boolean search(int[] nums, int target) {

        if (nums.length==0) return false;
        int left = 0,right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;

            if (nums[mid]==target){
                return true;
            }


            if(nums[mid]>nums[left]) {
                if (target<nums[mid]&&target>=nums[left]){
                    right = mid-1;
                }else {
                    left=mid+1;
                }

            }else if(nums[mid]<nums[right]){
                if (target>nums[mid]&&target<=nums[right]){
                    left = mid+1;
                }else {
                    right=mid-1;
                }
            }else {
                if (nums[left]==target){
                    return true;
                }else {
                    left++;
                }
            }
        }
        return false;

    }


    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.search(new int[]{3,1,1},3));


    }



}
