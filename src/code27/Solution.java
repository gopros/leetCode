package code27;


class Solution {

    public int removeElement(int[] nums, int val) {

        int count = 0,k=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val){
                count++;
            }else {
                nums[i-count] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
        }
        return k;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] a = {0,1,2,2,3,0,4,2};

        s.removeElement(a,2);


    }



}
