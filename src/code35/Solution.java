package code35;


class Solution {

    public int searchInsert(int[] nums, int target) {

        if (nums.length==0) return 0;

        int i = 0;
        for (i = nums.length-1; i>=0 ; i--) {
            if (target>nums[i]){
                break;
            }else if(target==nums[i]) {
                i--;
                break;
            }
        }

        return i+1;
    }


    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {1,2,4,5,6};

        System.out.println(s.searchInsert(a,2));


    }



}
