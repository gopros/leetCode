package code47;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> out = new ArrayList<>();

        Arrays.sort(nums);

        int[] visited = new int[nums.length];

        DFS(nums,0,visited,out,lists);



        return lists;

    }

    public void DFS(int[] nums,int level,int[] visited ,List out,List<List<Integer>> lists){

        if (out.size()==nums.length){
            List<Integer> list = new ArrayList<>();
            list.addAll(out);
            lists.add(list);
        }else {

            for (int i = 0; i < nums.length; i++) {
                if (visited[i]==0){
                    if (i>0&&nums[i]==nums[i-1]&&visited[i-1]==0) continue;;
                    visited[i]=1;
                    out.add(nums[i]);
                    DFS(nums,level+1,visited,out,lists);
                    out.remove(out.size()-1);
                    visited[i]=0;
                }
            }

        }


    }


    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {3,3,0,3};
        List<List<Integer>> lists = s.permuteUnique(a);

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(Arrays.toString(lists.get(i).toArray()));
        }


    }



}
