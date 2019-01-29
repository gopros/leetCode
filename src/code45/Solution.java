package code45;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

    public int jump(int[] nums) {

        List<Integer> list = new ArrayList<>();

        DFS(nums,0,list,0);

        Collections.sort(list);

        return list.get(0);

    }

    public int jump2(int[] nums) {

        return 0;

    }

    public void DFS(int[] nums, int i, List<Integer> list,int count){

        if (i>=nums.length-1){
            list.add(count);
            return;
        }

        for (int j = 1; j <= nums[i]; j++) {

            DFS(nums,i+j,list,count+1);
        }



    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] a = {2,3,1,1,4};

        System.out.println(s.jump2(a));


    }



}
