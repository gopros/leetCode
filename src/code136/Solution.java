package code136;


import java.util.HashMap;
import java.util.Map;

class Solution {

    public int singleNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else {
                map.put(nums[i],1);
            }
        }



        return (int) map.keySet().toArray()[0];

    }

    public int singleNumber2(int[] nums) {

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res^=nums[i];
        }
        return res;
    }


    public static void main(String[] args) {

        Solution s = new Solution();
        s.singleNumber2(new int[]{1,2,1,2,4});


    }



}
