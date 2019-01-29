package code33;


class Solution {

    public int search(int[] nums, int target) {

        int j = nums.length-1;

        int i = 0;



        while (i<=j){

            if (nums[(i+j)/2]==target){
                return (i+j)/2;
            }

            if (nums[(i+j)/2]<nums[j]){
                if (nums[(i+j)/2]<target&&nums[j]>=target){
                    i = (i+j)/2+1;
                }else {
                    j = (i+j)/2-1;
                }
            }else{
                if (nums[(i+j)/2]>target&&nums[i]<=target){
                    j = (i+j)/2-1;
                }else {
                    i = (i+j)/2+1;
                }
            }
        }




        return -1;
    }


    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {4,5,6,7,0,1,2};
        System.out.println(s.search(a,5));


    }



}
