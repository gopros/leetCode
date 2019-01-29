package code78;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    public List<List<Integer>> subsets(int[] nums) {
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
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        List<List<Integer>> lists = s.subsets(new int[]{1, 2, 3});

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(Arrays.toString(lists.get(i).toArray()));
        }

    }



}
