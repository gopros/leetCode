package code90;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        DFS(nums,0,list,l);
        list.add(new ArrayList<>());

        return list;
    }

    public void DFS(int[] nums,int i,List<List<Integer>> list,List<Integer> cur){

        if (i<0||i>=nums.length){
            List<Integer> l = new ArrayList<>();
            l.addAll(cur);
            list.add(l);
            return;
        }

        for (int j = i; j < nums.length; j++) {

            cur.add(nums[j]);
            if (j+1<nums.length) DFS(nums,-1,list,cur);

            DFS(nums,j+1,list,cur);
            cur.remove(cur.size()-1);
            while (j+1<nums.length&&nums[j]==nums[j+1]) j++;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        List<List<Integer>> lists = s.subsetsWithDup(new int[]{1,2,2});

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(Arrays.toString(lists.get(i).toArray()));
        }

    }



}
