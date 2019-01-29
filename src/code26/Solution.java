package code26;


class Solution {

    public int removeDuplicates(int[] nums) {
        int k=nums[0],count=1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=k){
                nums[count] = nums[i];
                k = nums[i];
                count++;
            }

        }

        for (int i = 0; i < count; i++) {
            System.out.print(nums[i]);
        }

        return k;



    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] a = {0,0,1,1,2,2,3,3,4,4};

        s.removeDuplicates(a);


    }



}
