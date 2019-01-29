package code135;


class Solution {

    public int candy(int[] ratings) {

        int[] nums = new int[ratings.length];


        for (int i = 0; i < ratings.length-1; i++) {
            if (i==0){
                if (ratings[i]>ratings[i+1]){
                    nums[i] = 2;
                }else {
                    nums[i] = 1;
                }
            }else {
                if (ratings[i]>ratings[i-1]){
                    nums[i] = nums[i-1]+1;
                }else {
//                    nums[i]
                }
            }


        }
        return 0;

    }

    public static void main(String[] args) {

        Solution s = new Solution();


    }



}
