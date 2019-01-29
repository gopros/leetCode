package code18;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> re = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-3; i++) {
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for (int j = i+1; j < nums.length - 2; j++) {
                if (j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                for (int k = j+1; k < nums.length - 1; k++) {
                    if (k>j+1&&nums[k]==nums[k-1]){
                        continue;
                    }
                    for (int l = k+1; l <nums.length; l++) {
                        if (l>k+1&&nums[l]==nums[l-1]){
                            continue;
                        }
                        if (nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);
                            re.add(list);
                        }
                    }
                }

            }
        }

        return  re;


    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> re = s.fourSum(nums,0);

        for (int i = 0; i < re.size(); i++) {
            System.out.println(Arrays.toString(re.get(i).toArray()));
        }
    }



}
