package code34;


import java.util.Arrays;

class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] re = {-1,-1};
        if (nums.length==0) return re;

        int i=0,j=nums.length-1,mid=0,k;
        while (i<=j){
            mid = (i+j)/2;
            if (nums[mid]<target){
                i = mid+1;
            }else if (nums[mid]>target){
                j = mid-1;
            }else {
                break;
            }
        }

       if (nums[mid]==target){
            re[0] = mid;
            re[1] = mid;
           for (k = 1; mid-k>=0;) {
               if (nums[mid-k]!=target){

                   break;
               }else {
                   k++;
               }
           }
           re[0] = mid - k + 1;

           for (k = 1; mid+k<nums.length;) {
               if (nums[mid+k]!=target){

                   break;
               }else {
                   k++;
               }
           }
           re[1] = mid + k - 1;

       }

        return re;

    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {2,2};
        System.out.println(Arrays.toString(s.searchRange(a,2)));


    }



}
