package code46;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();

        Stack<Integer> out = new Stack<>();

        int[] visited = new int[nums.length];

        DFS(nums,0,visited,out,lists);

        return lists;
    }

    public void DFS(int[] nums,int level,int[] visited,Stack<Integer> out,List<List<Integer>> lists){

        if (out.size()==nums.length){
            List<Integer> l = new ArrayList();
            for (int i = 0; i < out.size(); i++) {
                l.add(out.get(i));
            }
            lists.add(l);
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (visited[i]==0){
                    visited[i] = 1;
                    out.push(nums[i]);
                    DFS(nums,level+1,visited,out,lists);
                    out.pop();
                    visited[i] = 0;
                }

            }
        }

    }





    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {1,2,3};
        List<List<Integer>> lists = s.permute(a);

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(Arrays.toString(lists.get(i).toArray()));
        }


    }



}
